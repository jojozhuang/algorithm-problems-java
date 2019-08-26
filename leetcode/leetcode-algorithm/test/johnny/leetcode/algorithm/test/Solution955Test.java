package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution955;

public class Solution955Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDeletionSize");
        Solution955 instance = new Solution955();

        assertEquals(1, instance.minDeletionSize(new String[] {"ca","bb","ac"}));
        assertEquals(0, instance.minDeletionSize(new String[] {"xc","yb","za"}));
        assertEquals(3, instance.minDeletionSize(new String[] {"zyx","wvu","tsr"}));
    }
}
