package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution537;

public class Solution537Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("complexNumberMultiply");
        Solution537 instance = new Solution537();

        assertEquals("0+2i", instance.complexNumberMultiply("1+1i3", "1+1i"));
        assertEquals("0+-2i", instance.complexNumberMultiply("1+-1i", "1+-1i"));
    }
}
