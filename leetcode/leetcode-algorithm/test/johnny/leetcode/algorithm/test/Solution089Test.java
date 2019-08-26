package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution089;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution089Test extends JunitBase {

    @Test
    public void testGrayCode() {
        System.out.println("grayCode");
        Solution089 instance = new Solution089();

        List<Integer> expect1 =  ListUtil.buildList(new Integer[] {0});
        assertEquals(expect1, instance.grayCode(0));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0,1});
        assertEquals(expect2, instance.grayCode(1));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {0,1,3,2});
        assertEquals(expect3, instance.grayCode(2));

         List<Integer> expect4 = ListUtil.buildList(new Integer[] {0,1,3,2,6,7,5,4});
        assertEquals(expect4, instance.grayCode(3));
    }
}
