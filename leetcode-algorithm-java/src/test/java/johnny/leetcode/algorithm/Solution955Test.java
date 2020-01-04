package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
