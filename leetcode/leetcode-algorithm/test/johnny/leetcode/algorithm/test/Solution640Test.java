package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution640;

public class Solution640Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("solveEquation");
        Solution640 instance = new Solution640();

        assertEquals("x=2", instance.solveEquation("x+5-3+x=6+x-2"));
        assertEquals("Infinite solutions", instance.solveEquation("x=x"));
        assertEquals("x=0", instance.solveEquation("2x=x"));
        assertEquals("x=-1", instance.solveEquation("2x+3x-6x=x+2"));
        assertEquals("No solution", instance.solveEquation("x=x+2"));
    }
}
