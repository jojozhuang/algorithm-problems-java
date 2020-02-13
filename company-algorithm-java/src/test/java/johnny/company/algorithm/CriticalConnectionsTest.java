package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CriticalConnectionsTest extends JunitBase {

    @Test
    public void testCriticalConnections() {
        System.out.println("criticalConnections");
        CriticalConnections instance = new CriticalConnections();

        /*
        List<int[]> edges1 = ListUtil.buildList2([[1, 2], [1, 3], [3, 4], [1, 4], [4, 5]])
        a1.add(new int[]{1,2});
        a1.add(new int[]{2,4});
        a1.add(new int[]{3,6});

        List<int[]> b1 = new ArrayList<>();
        b1.add(new int[]{1,2});

        List<int[]> expect1 = new ArrayList<>();
        expect1.add(new int[]{2,1});

        List<int[]> result1 = instance.criticalConnections(5, b1,7);

        assertEquals(expect1.size(), result1.size());

        for (int i = 0; i < expect1.size(); i++) {
            assertArrayEquals(expect1.get(i), result1.get(i));
        }*/

    }
}
