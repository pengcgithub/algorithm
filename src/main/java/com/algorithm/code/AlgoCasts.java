package com.algorithm.code;

import java.util.HashMap;
import java.util.Map;

/**
 * <br/>
 *
 * @author pengc
 * @see com.algorithm.code
 * @since 2019/8/27
 */
public class AlgoCasts {

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

    public int[] getTwoNumSumToGivenValueHashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {

        }

        return null;
    }

    public static void main(String args[]) {
        AlgoCasts algoCasts = new AlgoCasts();
        int[] nums = new int[]{1, 2, 3, 6, 8, 11};
        int[] result = algoCasts.getTwoNumToGivenValueHashMap(nums, 10);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
