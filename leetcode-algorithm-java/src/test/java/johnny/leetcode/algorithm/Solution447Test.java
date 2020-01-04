package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution447Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfBoomerangs");
        Solution447 instance = new Solution447();

        assertEquals(2, instance.numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}));
        assertEquals(2, instance.numberOfBoomerangs(new int[][]{{1,1},{2,2},{3,3}}));
    }
}
