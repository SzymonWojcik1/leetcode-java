package com.leetcode.hashtables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    RomanToInteger romanToInt = new RomanToInteger();

    @Test
    void test3RomanToInt(){
        String romanNumber = "III";
        int romanNumberInInt = 3;

        int solution = romanToInt.romanToInt(romanNumber);

        assertEquals(romanNumberInInt, solution);
    }

    @Test
    void test5RomanToInt(){
        String romanNumber = "V";
        int romanNumberInInt = 5;

        int solution = romanToInt.romanToInt(romanNumber);

        assertEquals(romanNumberInInt, solution);
    }

    @Test
    void test9RomanToInt(){
        String romanNumber = "IX";
        int romanNumberInInt = 9;

        int solution = romanToInt.romanToInt(romanNumber);

        assertEquals(romanNumberInInt, solution);
    }

    @Test
    void test58RomanToInt(){
        String romanNumber = "LVIII";
        int romanNumberInInt = 58;

        int solution = romanToInt.romanToInt(romanNumber);

        assertEquals(romanNumberInInt, solution);
    }

    @Test
    void test1994RomanToInt(){
        String romanNumber = "MCMXCIV";
        int romanNumberInInt = 1994;

        int solution = romanToInt.romanToInt(romanNumber);

        assertEquals(romanNumberInInt, solution);
    }
}
