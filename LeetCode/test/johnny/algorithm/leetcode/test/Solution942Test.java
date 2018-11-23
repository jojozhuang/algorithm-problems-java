package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution944;

public class Solution942Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("diStringMatch");
        Solution944 instance = new Solution944();

        assertEquals(1, instance.minDeletionSize(new String[] {"cba","daf","ghi"}));
        assertEquals(0, instance.minDeletionSize(new String[] {"a","b"}));
        assertEquals(3, instance.minDeletionSize(new String[] {"zyx","wvu","tsr"}));
    }
}
