package org.ad.hackerrank.ipe.wc;

import java.util.HashMap;
import java.util.HashSet;

public class _1_Sales_By_Match {

    public int numberOfPairsHashSet(int[] array) {
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

    public int numberOfPairsHashMap(int [] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int pairs = 0;
        for(int value: array) {
            if(!hashMap.containsKey(value)) {
                hashMap.put(value, 1);
            } else {
                int count = hashMap.get(value);
                hashMap.put(value, ++count);
                if(count%2==0){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
