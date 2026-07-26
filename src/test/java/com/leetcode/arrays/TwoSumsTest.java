package com.leetcode.arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumsTest {
    TwoSums twoSums = new TwoSums();

    @Test
    void testTwoSums(){
        int[] nums = {2,7,11,17};
        int target = 19;

        int[] solution = twoSums.twoSum(nums, target);

        assertEquals(0, solution[0]);
        assertEquals(3, solution[1]);

        int target2 = 18;

        int[] solution2 = twoSums.twoSum(nums, target2);
        assertEquals(1, solution2[0]);
        assertEquals(2, solution2[1]);

        int[] nums2 = {3,3};

        int target3 = 6;

        int[] solution3 = twoSums.twoSum(nums2, target3);
        assertEquals(0, solution3[0]);
        assertEquals(1, solution3[1]);
    }
}
