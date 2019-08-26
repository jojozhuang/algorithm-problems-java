package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution353;

public class Solution353Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("SnakeGame");

        int[][] food1 = new int[][] {{1,2},{0,1}};
        Solution353 instance = new Solution353(3,2,food1);

        assertEquals(0, instance.move("R"));
        assertEquals(0, instance.move("D"));
        assertEquals(1, instance.move("R"));
        assertEquals(1, instance.move("U"));
        assertEquals(2, instance.move("L"));
        assertEquals(-1, instance.move("U"));
    }
}
