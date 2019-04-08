package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA5019;

public class SolutionA5019Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("videoStitching");
        SolutionA5019 instance = new SolutionA5019();

        assertEquals(3, instance.videoStitching(new int[][]{{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}}, 10));
        assertEquals(-1, instance.videoStitching(new int[][]{{0,1},{1,2}}, 5));
        assertEquals(3, instance.videoStitching(new int[][]{{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}}, 9));
        assertEquals(2, instance.videoStitching(new int[][]{{0,4},{2,8}}, 5));
    }
}
