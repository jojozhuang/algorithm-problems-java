package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution960;

public class Solution960Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDeletionSize");
        Solution960 instance = new Solution960();

        assertEquals(3, instance.minDeletionSize(new String[] {"babca","bbazb"}));
        assertEquals(4, instance.minDeletionSize(new String[] {"edcba"}));
        assertEquals(0, instance.minDeletionSize(new String[] {"ghi","def","abc"}));
    }
}
