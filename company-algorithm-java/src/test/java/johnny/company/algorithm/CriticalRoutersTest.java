package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CriticalRoutersTest extends JunitBase {

    @Test
    public void testCriticalRouters() {
        System.out.println("criticalRouters");
        CriticalRouters instance = new CriticalRouters();

        List<int[]> edges1 = ListUtil.buildListOfIntArray(new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}});
        List<Integer> expect1 = ListUtil.buildList(new Integer[]{2,3,5});
        List<Integer> result1 = instance.getCriticalNodes(7, 7, edges1);

        assertEquals(expect1, result1);

    }
}
