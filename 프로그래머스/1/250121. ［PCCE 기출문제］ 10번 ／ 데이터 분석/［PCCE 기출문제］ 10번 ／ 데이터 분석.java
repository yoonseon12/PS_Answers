import java.util.*;
import java.util.stream.*;

class Solution {
    static final String CODE = "code";
    static final String DATE = "date";
    static final String MAXIMUM = "maximum";
    static final String REMAIN = "remain";
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Data> dataList = Arrays.stream(data)
            .map(Data::new)
            .filter(info -> isLessThan(ext, val_ext, info))
            .collect(Collectors.toList());

        sortDataList(sort_by, dataList);

        return dataList.stream()
            .map(Data::toArray)
            .toArray(int[][]::new);
    }
    
    private static void sortDataList(String sort_by, List<Data> dataList) {
        switch (sort_by) {
            case CODE:
                dataList.sort(Comparator.comparingInt(Data::getCode));
                break;
            case DATE:
                dataList.sort(Comparator.comparingInt(Data::getDate));
                break;
            case MAXIMUM:
                dataList.sort(Comparator.comparingInt(Data::getMaximum));
                break;
            case REMAIN:
                dataList.sort(Comparator.comparingInt(Data::getRemain));
                break;
        }
    }

        private static boolean isLessThan(String ext, int val_ext, Data info) {
            switch (ext) {
                case CODE:
                    return info.getCode() < val_ext;
                case DATE:
                    return info.getDate() < val_ext;
                case MAXIMUM:
                    return info.getMaximum() < val_ext;
                case REMAIN:
                    return info.getRemain() < val_ext;
                default:
                    return false;
            }
        }
}

class Data {
    private int code;
    private int date;
    private int maximum;
    private int remain;

    public Data(int[] data) {
        this.code = data[0];
        this.date = data[1];
        this.maximum = data[2];
        this.remain = data[3];
    }

    public int getCode() {
        return code;
    }

    public int getDate() {
        return date;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getRemain() {
        return remain;
    }

    public int[] toArray() {
        return new int[]{code, date, maximum, remain};
    }
}