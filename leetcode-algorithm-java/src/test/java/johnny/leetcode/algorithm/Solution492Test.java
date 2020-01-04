package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution492Test extends JunitBase {

    @Test
    public void testConstructRectangle() {
        System.out.println("constructRectangle");
        Solution492 instance = new Solution492();

        //assertArrayEquals(new int[]{}, instance.constructRectangle(0));
        assertArrayEquals(new int[]{1,1}, instance.constructRectangle(1));
        assertArrayEquals(new int[]{2,1}, instance.constructRectangle(2));
        assertArrayEquals(new int[]{3,1}, instance.constructRectangle(3));
        assertArrayEquals(new int[]{2,2}, instance.constructRectangle(4));
        assertArrayEquals(new int[]{5,2}, instance.constructRectangle(10));
    }
}
