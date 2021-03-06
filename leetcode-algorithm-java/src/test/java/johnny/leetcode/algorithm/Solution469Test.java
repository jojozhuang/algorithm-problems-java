package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution469Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isConvex");
        Solution469 instance = new Solution469();

        List<List<Integer>> points1 = ListUtil.buildList2(new Integer[][] {{0,0},{0,1},{1,1},{1,0}});
        assertEquals(true, instance.isConvex(points1));

        List<List<Integer>> points2 = ListUtil.buildList2(new Integer[][] {{0,0},{0,10},{10,10},{10,0},{5,5}});
        assertEquals(false, instance.isConvex(points2));
    }
}
