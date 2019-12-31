package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1046;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1046Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lastStoneWeight");
        SolutionA1046 instance = new SolutionA1046();

        assertEquals(1, instance.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
