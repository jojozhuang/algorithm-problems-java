package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1391Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hasValidPath");
        SolutionA1391 instance = new SolutionA1391();

        assertEquals(true, instance.hasValidPath(new int[][]{{2,4,3},{6,5,2}}));
        assertEquals(false, instance.hasValidPath(new int[][]{{1,2,1},{1,2,1}}));
        assertEquals(false, instance.hasValidPath(new int[][]{{1,1,2}}));
        assertEquals(true, instance.hasValidPath(new int[][]{{1,1,1,1,1,1,3}}));
        assertEquals(true, instance.hasValidPath(new int[][]{{2},{2},{2},{2},{2},{2},{6}}));
        assertEquals(false, instance.hasValidPath(new int[][]{{2,3,6,5,6,1,6,6},{5,6,3,5,1,5,4,2},{5,3,6,1,4,1,6,3},{2,2,4,2,5,6,2,3},{2,2,2,4,6,2,4,5},{1,6,5,6,4,2,4,6},{2,2,6,5,1,3,6,6},{6,5,2,3,2,3,2,6},{2,2,3,3,3,3,6,1},{5,3,3,2,2,2,1,1}}));

    }
}
