package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution978;

public class Solution978Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxTurbulenceSize");
        Solution978 instance = new Solution978();

        assertEquals(5, instance.maxTurbulenceSize(new int[] {9,4,2,10,7,8,8,1,9}));
        assertEquals(2, instance.maxTurbulenceSize(new int[] {4,8,12,16}));
        assertEquals(1, instance.maxTurbulenceSize(new int[] {100}));
    }
}
