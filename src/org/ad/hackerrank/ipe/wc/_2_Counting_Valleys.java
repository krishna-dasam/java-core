package org.ad.hackerrank.ipe.wc;

public class _2_Counting_Valleys {

    public int count(int n, String str) {
        int valley = 0;
        int level = 0;
        for (Character c : str.toCharArray()) {
            if (c == 'U') {
                level++;
                if (level == 0) valley++;
            }
            if (c == 'D') level--;
        }
        return valley;
    }
}
