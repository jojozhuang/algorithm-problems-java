package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1037Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isBoomerang");
        SolutionA1037 instance = new SolutionA1037();

        assertEquals(true,instance.isBoomerang(new int[][]{{1,1},{2,3},{3,2}}));
        assertEquals(false,instance.isBoomerang(new int[][]{{1,1},{2,2},{3,3}}));
    }
}
