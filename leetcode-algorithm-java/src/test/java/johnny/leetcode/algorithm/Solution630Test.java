package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution630Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("scheduleCourse");
        Solution630 instance = new Solution630();

        assertEquals(3, instance.scheduleCourse(new int[][] {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}}));
    }
}
