package com.algorithm.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组和一个目标值，你要找到数组里两个整数， 它们的和等于目标值。然后返回这两个整数的下标。<br/>
 *
 * 比如说给你的整数数组是：
 *
 * 1, 2, 3, 6, 8, 11
 *
 * 目标值是 10。那么，满足条件的两个整数是，2 和 8，它们的和是 10。所以你要返回它们的下标是 1 和 4。
 *
 * @author pengc
 * @see com.algorithm.code
 * @since 2019/8/27
 */
public class Two {

    // Time: O(logn), Space: O(1)
    public int[] getTwoNumToGivenValueHashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int difference = target - nums[j];
            Integer value = numMap.get(difference);
            if (null != value) {
                return new int[]{j, value};
            }
        }

        return new int[]{};
    }

    // Time: O(n), Space: O(n)
    public int[] getTwoNumSumToGivenValueHashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int difference = target - nums[j];
            if (numMap.containsKey(difference)) {
                return new int[]{j, numMap.get(difference)};
            }

            numMap.put(nums[j], j);
        }

        return new int[]{};
    }

    public static void main(String args[]) {
        Two two = new Two();
        int[] nums = new int[]{1, 2, 3, 6, 8, 11};
        int[] result = two.getTwoNumSumToGivenValueHashMap(nums, 10);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
