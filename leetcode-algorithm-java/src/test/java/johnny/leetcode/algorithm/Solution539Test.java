package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution539;
import johnny.algorithm.common.ListUtil;

public class Solution539Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMinDifference");
        Solution539 instance = new Solution539();

        List<String> timePoints1 = ListUtil.buildList(new String[] {"23:59","00:00"});
        assertEquals(1, instance.findMinDifference(timePoints1));
    }
}
