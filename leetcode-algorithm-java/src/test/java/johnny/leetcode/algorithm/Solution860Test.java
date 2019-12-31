package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution860;

public class Solution860Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lemonadeChange");
        Solution860 instance = new Solution860();

        assertEquals(true, instance.lemonadeChange(new int[] {5,5,5,10,20}));
        assertEquals(true, instance.lemonadeChange(new int[] {5,5,10}));
        assertEquals(false, instance.lemonadeChange(new int[] {10,10}));
        assertEquals(false, instance.lemonadeChange(new int[] {5,5,10,10,20}));
    }
}
