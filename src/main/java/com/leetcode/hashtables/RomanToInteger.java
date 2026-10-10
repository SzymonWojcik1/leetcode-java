package com.leetcode.hashtables;

import java.util.HashMap;

// LeetCode 13 - Roman to intenger
// https://leetcode.com/problems/roman-to-integer
public class RomanToInteger {
    public int romanToInt(String s) {
        // First version, gonna correct it another time.
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1); romanMap.put("V", 5); romanMap.put("X", 10); romanMap.put("L", 50);
        romanMap.put("C", 100); romanMap.put("D", 500); romanMap.put("M", 1000);
        int value = 0;
        int step = 0;
        while (s.length() > step) {
            if (step >= s.length()){
                return value;
            }
            if (s.charAt(step)> s.charAt(step+1)){
                value += romanMap.get(Character.toString(s.charAt(step)));
                step++;
            } else if (s.charAt(step) == s.charAt(step+1)) {
                if (step+2 <= s.length() && s.charAt(step) == s.charAt(s.charAt(step+2))){
                    value += romanMap.get(Character.toString(s.charAt(step))) * 3;
                    step += 3;
                } else {
                    value += romanMap.get(Character.toString(s.charAt(step))) * 2;
                    step += 2;
                }
            } else {
                value -= romanMap.get(Character.toString(s.charAt(step)));
                step++;
            }
        }
        return value;
    }
}
