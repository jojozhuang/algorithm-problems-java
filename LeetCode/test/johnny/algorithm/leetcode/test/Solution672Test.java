package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution672;

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
