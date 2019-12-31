package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution288;

public class Solution288Test extends JunitBase {

    @Test
    public void testIsUnique() {
        System.out.println("isUnique");
        Solution288 instance = new Solution288(new String[]{"deer", "door", "cake", "card"});

        assertEquals(false, instance.isUnique("dear"));
        assertEquals(true, instance.isUnique("cart"));
        assertEquals(false, instance.isUnique("cane"));
        assertEquals(true, instance.isUnique("make"));
    }
}
