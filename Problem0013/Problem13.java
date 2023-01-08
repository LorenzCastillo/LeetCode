package Problem0013;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {
    public static void main(String[] args) {
        String num = "MCMXCIV";
        System.out.println(romanToInt(num));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String x1, x2;
        int sum = 0, i = 0;

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        while (i < s.length()) {
            x1 = Character.toString(s.charAt(i));
            if (i != s.length() - 1) {
                x2 = Character.toString(s.charAt(i+1));

                if (map.containsKey(x1 + x2)) {
                    sum += map.get(x1 + x2);
                    i += 2;
                    continue;
                }
            }
            sum += map.get(x1);
            i++;
        }
        return sum;
    }
}