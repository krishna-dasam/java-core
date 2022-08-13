package org.ad.leetcode;

public class _7_Reverse_Integer {

    public int reverseInteger (int num) {
        int reverse = 0;
        while(num!=0) {
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        return reverse;
    }
}
