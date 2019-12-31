package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution841;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution841Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("backspaceCompare");
        Solution841 instance = new Solution841();

        List<List<Integer>> rooms1 = ListUtil.buildList2(new Integer[][] {{1},{2},{3},{}});
        assertEquals(true, instance.canVisitAllRooms(rooms1));
        
        List<List<Integer>> rooms2 = ListUtil.buildList2(new Integer[][] {{1,3},{3,0,1},{2},{0}});
        assertEquals(false, instance.canVisitAllRooms(rooms2));
    }
}
