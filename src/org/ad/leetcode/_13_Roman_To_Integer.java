package org.ad.leetcode;

public class _13_Roman_To_Integer {

    public int romanToInteger(String s) {
        int value = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = valueOfRomanLiteral(s.charAt(i));
            if (current >= prev) {
                value += current;
            } else {
                value -= current;
            }
            prev = current;
        }
        return value;
    }

    private static int valueOfRomanLiteral(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

