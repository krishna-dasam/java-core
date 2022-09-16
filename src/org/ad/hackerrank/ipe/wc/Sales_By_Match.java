package org.ad.hackerrank.ipe.wc;

import java.util.HashSet;

public class Sales_By_Match {

    public int numberOfPairs(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        int pairs = 0;
        for (int value : array) {
            if (!hashSet.contains(value)) {
                hashSet.add(value);
            } else {
                pairs++;
                hashSet.remove(value);
            }
        }
        return pairs;
    }
}
