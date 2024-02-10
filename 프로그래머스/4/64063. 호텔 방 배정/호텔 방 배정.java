import java.util.*;

class Solution {
    HashMap<Long, Long> rooms;
    
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        rooms = new HashMap<>();
        
        for (int i=0; i<room_number.length; i++) {
            long emptyRoom = findEmptyRoom(room_number[i]);
            rooms.put(emptyRoom, emptyRoom + 1);
            answer[i] = emptyRoom;
        }
            
        return answer;
    }
    
    private long findEmptyRoom(long x) {
        if (!rooms.containsKey(x)) {
            return x;
        }
        
        long emptyRoom = findEmptyRoom(rooms.get(x));
        rooms.put(x, emptyRoom);
        
        return emptyRoom;
    }
    
}