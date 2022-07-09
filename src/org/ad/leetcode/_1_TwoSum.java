package org.ad.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

    public int[] twoSum(int[] nums, int target){
        int [] result = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(indexMap.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = indexMap.get(target-nums[i]);
                break;
            }else {
                indexMap.put(nums[i], i);
            }
        }
        return result;
    }
}
