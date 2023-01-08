package Problem0001;

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
