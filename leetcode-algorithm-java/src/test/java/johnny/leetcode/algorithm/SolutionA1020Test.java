package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1020;

public class SolutionA1020Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numEnclaves");
        SolutionA1020 instance = new SolutionA1020();

        assertEquals(3, instance.numEnclaves(new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}}));
        assertEquals(0, instance.numEnclaves(new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}}));
    }
}
