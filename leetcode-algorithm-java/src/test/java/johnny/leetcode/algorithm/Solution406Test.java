package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution406Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reconstructQueue");
        Solution406 instance = new Solution406();

        int[][] people1 = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] expect1 = new int[][] {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
        assertArrayEquals(expect1, instance.reconstructQueue(people1));
    }
}
