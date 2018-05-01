package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution712;

public class Solution712Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumDeleteSum");
        Solution712 instance = new Solution712();

        assertEquals(231, instance.minimumDeleteSum("sea","eat"));
        assertEquals(403, instance.minimumDeleteSum("delete","leet"));
    }
}
