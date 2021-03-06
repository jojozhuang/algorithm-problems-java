package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution785Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isBipartite");
        Solution785 instance = new Solution785();

        int[][] graph1 = new int[][] {{1,3}, {0,2}, {1,3}, {0,2}};
        assertEquals(true, instance.isBipartite(graph1));
        
        int[][] graph2 = new int[][] {{}, {3}, {}, {1},{}};
        assertEquals(true, instance.isBipartite(graph2));
    }
}
