package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1389Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("createTargetArray");
        SolutionA1389 instance = new SolutionA1389();

        assertArrayEquals(new int[]{0,4,1,3,2}, instance.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
        assertArrayEquals(new int[]{0,1,2,3,4}, instance.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));

    }
}
