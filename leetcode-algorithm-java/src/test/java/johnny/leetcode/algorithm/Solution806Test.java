package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution806;

public class Solution806Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfLines");
        Solution806 instance = new Solution806();

        int[] widths1 = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] expect1 = new int[] {3,60};
        assertArrayEquals(expect1, instance.numberOfLines(widths1, "abcdefghijklmnopqrstuvwxyz"));

        int[] widths2 = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] expect2 = new int[] {2,4};
        assertArrayEquals(expect2, instance.numberOfLines(widths2, "bbbcccdddaaa"));
    }
}
