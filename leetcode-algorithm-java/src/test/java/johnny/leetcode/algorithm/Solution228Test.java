package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution228Test extends JunitBase {

    @Test
    public void testSummaryRanges() {
        System.out.println("summaryRanges");
        Solution228 instance = new Solution228();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.summaryRanges(null));

        List<String> expect2 = ListUtil.buildList(new String[]{"1"});
        assertEquals(expect2, instance.summaryRanges(new int[]{1}));

        List<String> expect3 = ListUtil.buildList(new String[]{"1->2"});
        assertEquals(expect3, instance.summaryRanges(new int[]{1,2}));

        List<String> expect4 = ListUtil.buildList(new String[]{"1->2","4"});
        assertEquals(expect4, instance.summaryRanges(new int[]{1,2,4}));

        List<String> expect5 = ListUtil.buildList(new String[]{"0->2","4->5","7"});
        assertEquals(expect5, instance.summaryRanges(new int[]{0,1,2,4,5,7}));

        List<String> expect6 = ListUtil.buildList(new String[]{"0->2","4","6->7"});
        assertEquals(expect6, instance.summaryRanges(new int[]{0,1,2,4,6,7}));
    }
}
