package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution818;

public class Solution818Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("racecar");
        Solution818 instance = new Solution818();

        assertEquals(2, instance.racecar(3));
        assertEquals(5, instance.racecar(6));
    }
}
