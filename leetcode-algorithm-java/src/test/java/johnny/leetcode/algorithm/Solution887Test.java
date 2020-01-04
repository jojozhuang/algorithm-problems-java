package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution887Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("superEggDrop");
        Solution887 instance = new Solution887();

        assertEquals(2, instance.superEggDrop(1,2));
        assertEquals(3, instance.superEggDrop(2,6));
        assertEquals(4, instance.superEggDrop(3,14));
    }
}
