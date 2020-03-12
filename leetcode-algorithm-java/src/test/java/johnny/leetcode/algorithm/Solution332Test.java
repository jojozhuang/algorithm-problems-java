package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution332Test extends JunitBase {

    @Test
    public void testFindItinerary() {
        System.out.println("findItinerary");
        Solution332 instance = new Solution332();

        List<String> expect1 = new LinkedList<>();
        assertEquals(expect1, instance.findItinerary(null));

        List<String> expect4 = ListUtil.buildList(new String[] {"JFK", "SJC", "JFK", "KUL"});
        assertEquals(expect4, instance.findItinerary(new String[][]{{"JFK", "KUL"}, {"JFK", "SJC"}, {"SJC", "JFK"}}));

        List<String> expect2 = ListUtil.buildList(new String[] {"JFK", "MUC", "LHR", "SFO", "SJC"});
        assertEquals(expect2, instance.findItinerary(new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}));

        List<String> expect3 = ListUtil.buildList(new String[] {"JFK","ATL","JFK","SFO","ATL","SFO"});
        assertEquals(expect3, instance.findItinerary(new String[][]{{"JFK","SFO"},{"JFK","ATL"}, {"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}));
    }
}
