import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<strArr.length; i++) {
            if (strArr[i].contains("ad")) continue;
            list.add(strArr[i]);
        } 
        return list.toArray(new String[list.size()]);
    }
}