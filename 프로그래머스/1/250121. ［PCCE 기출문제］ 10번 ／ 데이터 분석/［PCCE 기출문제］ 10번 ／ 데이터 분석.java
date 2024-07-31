import java.util.*;
import java.util.stream.*;

class Solution {
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] arr = {"code", "date", "maximum", "remain"};
        List<String> dataList = List.of(arr);
        int extIndex = dataList.indexOf(ext);
        int sortIndex = dataList.indexOf(sort_by);
        
        return Arrays.stream(data)
            .filter(o1 -> o1[extIndex] < val_ext)
            .sorted(Comparator.comparingInt(o -> o[sortIndex]))
            .toArray(int[][]::new);
    }
}