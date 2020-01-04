package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution533Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findBlackPixel");
        Solution533 instance = new Solution533();

        char[][] picture1 = new char[][] {
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'W', 'B', 'W', 'B', 'W'}
        };
        assertEquals(6, instance.findBlackPixel(picture1,3));
    }
}
