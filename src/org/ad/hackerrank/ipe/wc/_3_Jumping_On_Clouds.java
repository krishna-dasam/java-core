package org.ad.hackerrank.ipe.wc;

public class _3_Jumping_On_Clouds {

    public int minNumJumps(int[] clouds) {
        int jumps = 0;
        for (int i = 0; i < clouds.length - 1; i++) {
            if (!(i + 2 == clouds.length || clouds[i + 2] == 1)) {
                i++;
            }
            jumps++;
        }
        return jumps;
    }
}
