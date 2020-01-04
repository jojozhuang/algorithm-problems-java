package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1051Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("heightChecker");
        SolutionA1051 instance = new SolutionA1051();

        assertEquals(3,instance.heightChecker(new int[] {1,1,4,2,1,3}));
    }
}
