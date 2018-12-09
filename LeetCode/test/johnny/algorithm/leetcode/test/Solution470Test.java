package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution470;

public class Solution470Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("rand10");

        Solution470 instance = new Solution470();
        for (int i = 0; i < 5; i++) {
            int random = instance.rand10();
            System.out.println(random);
            assertEquals(true, random>=1 && random <= 10);
            instance.rand10();
        }
    }
}
