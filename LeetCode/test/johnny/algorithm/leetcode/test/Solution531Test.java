package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution531;

public class Solution531Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLonelyPixel");
        Solution531 instance = new Solution531();

        char[][] picture1 = new char[][] {
            {'W', 'W', 'B'},
            {'W', 'B', 'W'},
            {'B', 'W', 'W'}
        };
        assertEquals(3, instance.findLonelyPixel(picture1));
    }
}
