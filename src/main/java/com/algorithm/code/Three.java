package com.algorithm.code;

/**
 * 给你一个整数数组，并且这个数组是按递增排序的，你要找到数组中的两个整数，它们的和等于给定的目标值，然后返回它们的下标。题目假设给你的数组总是有且只有一个解，而且同一个元素不能使用两次。另外，返回结果的下标要从 1 开始。<br/>
 *
 * 比如说给你的数组是：
 *
 * 1, 2, 3, 6, 8, 11
 *
 * 目标值是 10。那么，满足条件的两个整数是，2 和 8，它们的和是 10。所以你要返回它们的下标是 [2, 5]。
 *
 * leetcode 167
 * lintcode 608
 *
 * @author pengc
 * @version v3.1.0
 */
public class Three {

    // Time:O(n) Space: O(1)
    public int[] getTwoNumSumToGivenValue(int[] nums, int target) {

        int i = 0, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                --j;
            } else if (nums[i] + nums[j] < target) {
                ++i;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[]{};
    }

    public static void main(String args[]) {
        Three three = new Three();
        int[] nums = new int[]{1, 2, 3, 6, 8, 11};
        int[] result = three.getTwoNumSumToGivenValue(nums, 10);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
