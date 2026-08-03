package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RemoveDuplicateFromArrayTest {
    private RemoveDuplicateFromArray removeDuplicateFromArray = new RemoveDuplicateFromArray();

    @Test
    void removeDuplicateFromArrayTestOne(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int output = 5;

        assertEquals(output, removeDuplicateFromArray.removeDuplicates(nums));
    }

    @Test
    void removeDuplicateFromArrayTestTwo(){
        int[] nums = {1,1,2};
        int output = 2;

        assertEquals(output, removeDuplicateFromArray.removeDuplicates(nums));
    }
}
