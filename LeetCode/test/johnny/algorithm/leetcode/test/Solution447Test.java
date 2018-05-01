package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution447;

public class Solution447Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfBoomerangs");
        Solution447 instance = new Solution447();

        assertEquals(2, instance.numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}));
    }
}
