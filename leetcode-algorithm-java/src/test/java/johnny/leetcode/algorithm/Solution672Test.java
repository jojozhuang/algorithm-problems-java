package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution672Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("flipLights");
        Solution672 instance = new Solution672();

        assertEquals(2, instance.flipLights(1,1));
        assertEquals(3, instance.flipLights(2,1));
        assertEquals(4, instance.flipLights(3,1));
    }
}
