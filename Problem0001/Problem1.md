# Problem #1: [Two Sum](https://leetcode.com/problems/two-sum/) (Java)

---

### Difficulty - Easy

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example 1:**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

**Constraints**

- `2 <= nums.length <= 104`
- `-109 <= nums[i] <= 109`
- -109 <= target <= 109
- **Only one valid answer exists**

---

## Solution

```
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    if (nums[i] > nums[j]) {
                        solution[0] = j;
                        solution[1] = i;
                    }
                    else {
                        solution[0] = i;
                        solution[1] = j;
                    }
                    return solution;
                }
            }
        }
        return null;
    }
}
```