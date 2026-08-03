package com.leetcode.arrays;

// LeetCode 14 - Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        String solution = strs[0];

        for(int i =1; i < strs.length; i++){
            while (!strs[i].startsWith(solution)) {
                if (solution.isEmpty()) {
                    return solution;
                }
                solution = solution.substring(0, solution.length() -1);
            }
        }

        return solution;
    }
}
