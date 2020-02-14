package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MinCostRepairEdgesTest extends JunitBase {

    @Test
    public void testMinCost() {
        System.out.println("minCost");
        MinCostRepairEdges instance = new MinCostRepairEdges();

        List<int[]> edges1 = ListUtil.buildListOfIntArray(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}});
        List<int[]> newEdges1 = ListUtil.buildListOfIntArray(new int[][]{{1, 2, 12}, {3, 4, 30}, {1, 5, 8}});
        assertEquals(20, instance.minCost(5, edges1, newEdges1));

        List<int[]> edges2 = ListUtil.buildListOfIntArray(new int[][]{{1, 2}, {2, 3}, {4, 5}, {3, 5}, {1, 6}, {2, 4}});
        List<int[]> newEdges2 = ListUtil.buildListOfIntArray(new int[][]{{1, 6, 410}, {2, 4, 800}});
        assertEquals(410, instance.minCost(6, edges2, newEdges2));

        List<int[]> edges3 = ListUtil.buildListOfIntArray(new int[][]{{1, 2}, {2, 3}, {4, 5}, {5, 6}, {1, 5}, {2, 4}, {3, 4}});
        List<int[]> newEdges3 = ListUtil.buildListOfIntArray(new int[][]{{1, 5, 110}, {2, 4, 84}, {3, 4, 79}});
        assertEquals(79, instance.minCost(6, edges3, newEdges3));
    }
}
