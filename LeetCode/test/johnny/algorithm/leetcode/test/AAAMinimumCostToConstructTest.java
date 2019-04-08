package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.algorithm.leetcode.AAAMinimumCostToConstruct;
import johnny.algorithm.leetcode.common.ListUtil;

public class AAAMinimumCostToConstructTest extends JunitBase {

    @Test
    public void testConnectRopse() {
        System.out.println("testConnectRopse");
        AAAMinimumCostToConstruct city = new AAAMinimumCostToConstruct();
        
        int numTotalAvailableCities = 6;
        int numTotalAvailableRoads = 3;
        List<List<Integer>> roadsAvailable = ListUtil.buildList2(new Integer[][] {{1, 4}, {4, 5}, {2, 3}});
        int numNewRoadsConstruct = 4;
        List<List<Integer>> costNewRoadsConstruct  = ListUtil.buildList2(new Integer[][] {{1, 2, 5}, {1, 3, 10}, {1, 6, 2}, {5, 6, 5}});
        assertEquals(7, city.getMinimumCost(6, 3, roadsAvailable, 4, costNewRoadsConstruct));
    }
}
