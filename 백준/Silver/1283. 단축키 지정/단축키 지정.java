import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    static int N;
    static List<Character> shortcutKeys;
    static StringBuilder sb;
    static final Character noneShortcutKey = '@';
    static final int noneIndex = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        shortcutKeys = new ArrayList<>();

        for (int i=0; i<N; i++) {
            String text = br.readLine();
            String[] strArr = text.split(" ");
            boolean isShortcutKey = false;

            for (int j = 0; j < strArr.length; j++) { // 입력받은 문자열을 공백 기준으로 순차적으로 순회
                String firstText = strArr[j];
                Character shortcutKey = firstText.charAt(0);
                if (!isExistShortcutKey(shortcutKey)) {
                    applyShortcut(shortcutKey);
                    int index = strArr.length > 1 ? j : noneIndex; // 공백이 포함된 문자열이였을 경우 단축키가 걸린 인덱스, 아니면 0
                    writeAnswer(shortcutKey, text, index);
                    isShortcutKey = true;
                    break;
                }

            }
            String removeSpaceText = Arrays.stream(strArr).collect(Collectors.joining());
            if (!isShortcutKey) {
                boolean isNoneShortcutKey = false;
                for (char c : removeSpaceText.toCharArray()) {
                    if (!isExistShortcutKey(c)) {
                        applyShortcut(c);
                        writeAnswer(c, text, null);
                        isNoneShortcutKey = true;
                        break;
                    }
                }
                if (!isNoneShortcutKey) {
                    writeAnswer(noneShortcutKey, text, noneIndex);
                }
            }
        }
        System.out.println(sb);
    }

    public static boolean isExistShortcutKey(Character c) {
        char upper = Character.toUpperCase(c);
        return shortcutKeys.contains(upper);
    }

    public static void applyShortcut(Character c) {
        char upper = Character.toUpperCase(c);
        shortcutKeys.add(upper);
    }

    public static void writeAnswer(Character shortcutKey, String text, Integer index) {
        String[] s = text.split(" ");
        boolean isShortcutKeyAlreadyWrite = false;
        for (int i=0; i<s.length; i++) {
            for (Character c : s[i].toCharArray()) {
                if (c == shortcutKey && !isShortcutKeyAlreadyWrite && (index == null || i == index)) {
                    sb.append("[" + c + "]");
                    isShortcutKeyAlreadyWrite = true;
                } else {
                    sb.append(c);
                }
            }
            sb.append(" ");
        }
        sb.append("\n");
    }
}