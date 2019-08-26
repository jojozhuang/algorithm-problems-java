package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution886;

public class Solution886Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("possibleBipartition");
        Solution886 instance = new Solution886();

        int[][] dislikes1 = new int[][]{{1,2},{1,3},{2,4}};
        assertEquals(true, instance.possibleBipartition(4,dislikes1));
        
        int[][] dislikes2 = new int[][]{{1,2},{1,3},{2,3}};
        assertEquals(false, instance.possibleBipartition(3,dislikes2));
        
        int[][] dislikes3 = new int[][]{{1,2},{2,3},{3,4},{4,5},{1,5}};
        assertEquals(false, instance.possibleBipartition(5,dislikes3));
    }
}
