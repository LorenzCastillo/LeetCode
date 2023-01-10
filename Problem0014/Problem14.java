package Problem0014;

import java.util.Arrays;

public class Problem14 {
    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}
