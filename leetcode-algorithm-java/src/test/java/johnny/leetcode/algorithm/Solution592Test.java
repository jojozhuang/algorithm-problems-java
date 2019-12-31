package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution592;

public class Solution592Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("fractionAddition");
        Solution592 instance = new Solution592();

        assertEquals("0/1", instance.fractionAddition("-1/2+1/2"));
        assertEquals("1/3", instance.fractionAddition("-1/2+1/2+1/3"));
        assertEquals("-1/6", instance.fractionAddition("1/3-1/2"));
        assertEquals("2/1", instance.fractionAddition("5/3+1/3"));
    }
}
