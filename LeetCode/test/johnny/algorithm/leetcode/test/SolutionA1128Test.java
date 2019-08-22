package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1128;

public class SolutionA1128Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numEquivDominoPairs");
        SolutionA1128 instance = new SolutionA1128();

        assertEquals(1, instance.numEquivDominoPairs(new int[][] {{1,2},{2,1},{3,4},{5,6}}));
        assertEquals(3, instance.numEquivDominoPairs(new int[][] {{1,2},{1,2},{1,1},{1,2},{2,2}}));
    }
}
