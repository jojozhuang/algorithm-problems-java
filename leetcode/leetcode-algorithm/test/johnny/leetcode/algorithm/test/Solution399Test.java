package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution399;

public class Solution399Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("calcEquation");
        Solution399 instance = new Solution399();

        String[][] equations1 = new String[][]{{"a", "b"}, {"b", "c"}};
        double[] values1 = new double[] {2.0, 3.0};
        String[][] queries1 = new String[][]{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
        assertArrayEquals(new double[] {6,0.5,-1,1,-1}, instance.calcEquation(equations1,values1,queries1),0.0);
    }

}
