package com.leetcode.maths;

// LeetCode 9 - Palindrome Number
// https://leetcode.com/problems/palindrome-number/
// Time: O(log n)
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int reverse=0;
        int modulo;
        int rest = x;

        while (rest!=0){
            modulo = rest % 10;
            rest = rest / 10;
            reverse = reverse*10+modulo;
        }
        return reverse == x;
    }
}
