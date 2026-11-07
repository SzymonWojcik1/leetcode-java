package com.leetcode.hashtables;

import java.util.HashMap;

// LeetCode 13 - Roman to intenger
// https://leetcode.com/problems/roman-to-integer
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1); romanMap.put('V', 5); romanMap.put('X', 10); romanMap.put('L', 50);
        romanMap.put('C', 100); romanMap.put('D', 500); romanMap.put('M', 1000);

        int value = 0;
        int step = 0;
        int valueAtStep = 0;

        while(s.length()>step){
            if(step+1==s.length()){
                value += romanMap.get(s.charAt(step));
                return value;
            }
            valueAtStep = romanMap.get(s.charAt(step));
            if (valueAtStep < romanMap.get(s.charAt(step+1))){
                value -= valueAtStep;
            }else{
                value+=valueAtStep;
            }
            step++;

        }
        return value;
    }
}
