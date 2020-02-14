package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MinCostConnectAllNodesTest extends JunitBase {

    @Test
    public void testMinCost() {
        System.out.println("minCost");
        MinCostConnectAllNodes instance = new MinCostConnectAllNodes();

        List<int[]> edges1 = ListUtil.buildListOfIntArray(new int[][]{{1, 4}, {4, 5}, {2, 3}});
        List<int[]> newEdges1 = ListUtil.buildListOfIntArray(new int[][]{{1, 2, 5}, {1, 3, 10}, {1, 6, 2}, {5, 6, 5}});
        assertEquals(7, instance.minCost(5, edges1, newEdges1));
    }
}
