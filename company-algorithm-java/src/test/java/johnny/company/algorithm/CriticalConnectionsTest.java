package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CriticalConnectionsTest extends JunitBase {

    @Test
    public void testCriticalConnections() {
        System.out.println("criticalConnections");
        CriticalConnections instance = new CriticalConnections();

        List<int[]> edges1 = ListUtil.buildListOfIntArray(new int[][]{{1, 2}, {1, 3}, {3, 4}, {1, 4}, {4, 5}});
        List<int[]> expect1 = ListUtil.buildListOfIntArray(new int[][]{{1, 2}, {4, 5}});
        List<int[]> result1 = instance.criticalConnections(5, edges1);

        assertEquals(expect1.size(), result1.size());

        for (int i = 0; i < expect1.size(); i++) {
            assertArrayEquals(expect1.get(i), result1.get(i));
        }

    }
}
