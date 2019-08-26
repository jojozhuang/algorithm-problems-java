package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution925;

public class Solution925Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isLongPressedName");
        Solution925 instance = new Solution925();

        assertEquals(true, instance.isLongPressedName("alex", "aaleex"));
        assertEquals(false, instance.isLongPressedName("saeed", "ssaaedd"));
        assertEquals(true, instance.isLongPressedName("leelee", "lleeelee"));
        assertEquals(false, instance.isLongPressedName("dfuyalc", "fuuyallc"));
        assertEquals(true, instance.isLongPressedName("vtkgn", "vttkgnn"));
        
        assertEquals(false, instance.isLongPressedName("pyplrz", "ppyypllr"));
    }
}
