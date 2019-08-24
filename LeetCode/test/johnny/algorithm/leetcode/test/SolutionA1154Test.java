package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1154;

public class SolutionA1154Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("movesToMakeZigzag");
        SolutionA1154 instance = new SolutionA1154();

        assertEquals(9, instance.dayOfYear("2019-01-09"));
        assertEquals(41, instance.dayOfYear("2019-02-10"));
        assertEquals(60, instance.dayOfYear("2003-03-01"));
        assertEquals(61, instance.dayOfYear("2004-03-01"));
    }
}
