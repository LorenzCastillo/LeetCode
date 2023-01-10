# Problem #14: [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) (Java)

---

### Difficulty - Easy

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

**Example 1:**

```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

**Example 2:**

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

**Constraints**

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

---

## Solution

```
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
```