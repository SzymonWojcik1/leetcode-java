package com.leetcode.arrays;

import java.util.HashSet;

// LeetCode 26 - Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicateFromArray {
    public int removeDuplicates(int[] nums) {

        int k=0;
        int l=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++) {
            if (!set.contains(nums[i])){
                k++;
                nums[i-l] = nums[i];
            } else {
                l++;
            }
            set.add(nums[i]);
        }
        return k;

        /*
        A version I corrected with the help of AI

        int writePos=1;

        for(int i = 0; i<nums.length;i++) {
            if (nums[i]==nums[writePos-1]){

            }else{
                nums[writePos] = nums[i];
                writePos++;
            }
        }
        return writePos;
         */
    }
}
