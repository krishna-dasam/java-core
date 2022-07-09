package org.ad.leetcode;

public class _9_Palindrome_Number {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int org = x;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return org == rev;
    }

    public boolean isPalindrome_using_string(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome_using_string_builder(int x) {
        if (x < 0) return false;
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
