package com.leetcode.arrays;

import java.util.HashMap;

// LeetCode 1 - Two Sum
// https://leetcode.com/problems/two-sum/
// Time: O(n)
public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = {0,0};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++) {
            int x = target - nums[i];
            if(!map.containsKey(x)){
                map.put(nums[i],i);
            }else {
                solution[1] = i;
                solution[0] = map.get(x);
                return solution;
            }
        }
        return solution;
    }
}
