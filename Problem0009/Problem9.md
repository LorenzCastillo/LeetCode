# Problem #9: [Palindrome Number](https://leetcode.com/problems/palindrome-number/) (Java)

---

### Difficulty - Easy

Given an integer `x`, return `true` if `x` is a
palindrome, and `false` otherwise.

**Example 1:**

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

**Example 2:**

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

**Constraints**

- `-231 <= x <= 231 - 1`

---

## Solution

```
public class Problem9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String y = String.valueOf(x), revStr="";
        char a;

        for (int i = 0; i < y.length(); i++) {
            a = y.charAt(i);
            revStr = a + revStr;
        }

        if (y.equals(revStr)) {
            return true;
        } return false;
    }
}
```