package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution914Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hasGroupsSizeX");
        Solution914 instance = new Solution914();

        assertEquals(true, instance.hasGroupsSizeX(new int[] {1,2,3,4,4,3,2,1}));
        assertEquals(false, instance.hasGroupsSizeX(new int[] {1,1,1,2,2,2,3,3}));
        assertEquals(false, instance.hasGroupsSizeX(new int[] {1}));
        assertEquals(true, instance.hasGroupsSizeX(new int[] {1,1}));
        assertEquals(true, instance.hasGroupsSizeX(new int[] {1,1,2,2,2,2}));
    }
}
