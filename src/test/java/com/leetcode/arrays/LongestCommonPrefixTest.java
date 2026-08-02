package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void testPrefixFl(){
        String[] strs = {"flower","flow","flight"};
        String output = "fl";

        String solution = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(output, solution);
    }

    @Test
    void testPrefixNothing(){
        String[] strs = {"dog","racecar","car"};
        String output = "";

        String solution = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(output, solution);
    }

    @Test
    void testPrefixNothingAgain(){
        String[] strs = {"race","racecar","car"};
        String output = "";

        String solution = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(output, solution);
    }

    @Test
    void testPrefixEmptyString(){
        String[] strs = {"flower","flow","","flight"};
        String output = "";

        String solution = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(output, solution);
    }
}
