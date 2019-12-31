package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution478;

public class Solution478Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Generate Random Point in a Circle");
        
        Solution478 instance1 = new Solution478(1,0,0);
        double[] result1 = instance1.randPoint();

        assertTrue(Math.sqrt(Math.pow(result1[0],2) + Math.pow(result1[1], 2)) <= 1.0);
    }
}
