package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Dot Product
 *
 * https://www.1point3acres.com/bbs/thread-561624-1-1.html
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=608715
 *
 * 给两个相同长度的vector。形式是[(1,4), (3,1), (2,2)]这种。
 * [(1,4), (3,1), (2,2)]代表的vector是<1,1,1,1,3,2,2>。求两个vector的dot product。
 *
 */

public class DotProduct {
    // [(1,4), (3,1), (2,2)]
    // [(2,3), (1,2), (3,2)]
    // 1*2*3+1*1*1+3*1*1+2*3*2=22
    public int dotProduct(int[][] vectors1, int[][] vectors2)
    {
        int sum = 0;

        int i = 0;
        int j = 0;
        while (i < vectors1.length && j < vectors2.length) {
            int[] v1 = vectors1[i];
            int[] v2 = vectors2[j];
            sum += v1[0] * v2[0] * Math.min(v1[1], v2[1]);
            if (v1[1] == v2[1]) {
                i++;
                j++;
            } else if (v1[1] < v2[1]) {
                i++;
                v2[1] -= v1[1];
            } else {
                j++;
                v1[1] -= v2[1];
            }
        }

        return sum;
    }

}
