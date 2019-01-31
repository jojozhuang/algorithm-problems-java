package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution923;

public class Solution923Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("threeSumMulti");
        Solution923 instance = new Solution923();

        assertEquals(20, instance.threeSumMulti(new int[] {1,1,2,2,3,3,4,4,5,5}, 8));
        assertEquals(12, instance.threeSumMulti(new int[] {1,1,2,2,2,2}, 5));
    }
}
