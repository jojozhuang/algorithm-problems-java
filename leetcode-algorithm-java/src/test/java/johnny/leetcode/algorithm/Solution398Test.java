package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution398Test extends JunitBase {

    @Test
    public void testPick() {
        System.out.println("pick");
        Solution398 instance = new Solution398(null);

        assertEquals(0, instance.pick(0));

        Solution398 instance2 = new Solution398(new int[]{1,2,3,3,3});
        assertEquals(0, instance2.pick(1));
        assertEquals(1, instance2.pick(2));
        int random2 = instance2.pick(3);
        assertTrue(random2==2||random2==3||random2==4);
    }
}
