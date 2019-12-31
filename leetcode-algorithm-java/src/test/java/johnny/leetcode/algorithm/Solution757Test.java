package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution757;

public class Solution757Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("intersectionSizeTwo");
        Solution757 instance = new Solution757();

        int[][]intervals1 = {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        assertEquals(3, instance.intersectionSizeTwo(intervals1));

        int[][]intervals2 = {{1, 2}, {2, 3}, {2, 4}, {4, 5}};
        assertEquals(5, instance.intersectionSizeTwo(intervals2));
    }
}
