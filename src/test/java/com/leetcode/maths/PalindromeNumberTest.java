package com.leetcode.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void is10Palindrome(){
        int x = 10;

        boolean solution = palindromeNumber.isPalindrome(x);
        assertFalse(solution);
    }

    @Test
    void is121Palindrome(){
        int x = 121;

        boolean solution = palindromeNumber.isPalindrome(x);
        assertTrue(solution);
    }

    @Test
    void is55Palindrome(){
        int x = 55;

        boolean solution = palindromeNumber.isPalindrome(x);
        assertTrue(solution);
    }

    @Test
    void isNegativePalindrome(){
        int x = -121;

        boolean solution = palindromeNumber.isPalindrome(x);
        assertFalse(solution);
    }

    @Test
    void is5Palindrome(){
        int x = 5;

        boolean solution = palindromeNumber.isPalindrome(x);
        assertTrue(solution);
    }

    @Test
    void is0Palindrome(){
        int x = 0;

        boolean solution = palindromeNumber.isPalindrome(x);
        assertTrue(solution);
    }
}
