package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution733;

public class Solution733Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("floodFill");
        Solution733 instance = new Solution733();

        int[][] image1 = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] expect1 = {{2,2,2},{2,2,0},{2,0,1}};
        assertArrayEquals(expect1, instance.floodFill(image1,1,1,2));
    }
}
