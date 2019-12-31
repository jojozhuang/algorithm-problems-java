package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import johnny.leetcode.algorithm.Solution332;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution332Test extends JunitBase {

    @Test
    public void testFindItinerary() {
        System.out.println("findItinerary");
        Solution332 instance = new Solution332();

        List<String> expect1 = new LinkedList<String>();
        assertEquals(expect1, instance.findItinerary(null));

        List<String> expect2 = ListUtil.buildList(new String[] {"JFK", "MUC", "LHR", "SFO", "SJC"});
        assertEquals(expect2, instance.findItinerary(new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}));

        List<String> expect3 = ListUtil.buildList(new String[] {"JFK","ATL","JFK","SFO","ATL","SFO"});
        assertEquals(expect3, instance.findItinerary(new String[][]{{"JFK","SFO"},{"JFK","ATL"}, {"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}));
    }
}
