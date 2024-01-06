import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[][] book_time) {
        Hotel[] hotels = new Hotel[book_time.length];
        for (int i=0; i<hotels.length; i++) {
            hotels[i] = new Hotel(book_time[i][0], book_time[i][1]);
        }
        Arrays.sort(hotels);

        ArrayList<Hotel> room = new ArrayList<>();
        room.add(hotels[0]);
        for (int i=1; i<hotels.length; i++) {
            boolean isAllocate = false;
            // 이미 할당된 객실 중에 현재 사용 가능한 객실이 없다면, 새로 할당
            for (Hotel allocatedRoom : room) {
                if (hotels[i].startTime >= allocatedRoom.endTime) {
                    allocatedRoom.endTime = hotels[i].endTime;
                    isAllocate = true;
                    break;
                }
            }

            // 이미 할당된 객실 중에 현재 사용 가능한 객실이 있다면, 할당
            if (!isAllocate) {
                room.add(hotels[i]);
            }
        }

        return room.size();
    }
}

class Hotel implements Comparable<Hotel> {
    public int startTime;
    public int endTime;
    private static final int CLEAN_TIME = 10;

    public Hotel(String startTime, String endTime) {
        this.startTime = Integer.parseInt(startTime.replace(":",""));
        this.endTime = findFinalTime(Integer.parseInt(endTime.replace(":","")));

    }

    public int findFinalTime(int endTime) {
        int finalTime = endTime + CLEAN_TIME;
        if (finalTime % 100 >= 60) {
            finalTime += 100;
            finalTime -= 60;
        }
        return finalTime;
    }

    @Override
    public int compareTo(Hotel o) {
        return Integer.compare(this.startTime, o.startTime);
    }
}