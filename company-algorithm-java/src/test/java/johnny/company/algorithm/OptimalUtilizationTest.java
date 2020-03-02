package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OptimalUtilizationTest extends JunitBase {

    @Test
    public void testGetPairs() {
        System.out.println("getPairs");
        OptimalUtilization instance = new OptimalUtilization();

        List<int[]> a1 = ListUtil.buildListOfIntArray(new int[][]{{1,2},{2,4},{3,6}});
        List<int[]> b1 = ListUtil.buildListOfIntArray(new int[][]{{1,2}});
        List<int[]> result1 = instance.getPairs(a1, b1,7);
        List<int[]> expect1 = ListUtil.buildListOfIntArray(new int[][]{{2,1}});

        assertEquals(expect1.size(), result1.size());

        for (int i = 0; i < expect1.size(); i++) {
            assertArrayEquals(expect1.get(i), result1.get(i));
        }

        List<int[]> a2 = ListUtil.buildListOfIntArray(new int[][]{{1, 3}, {2, 5}, {3, 7}, {4, 10}});
        List<int[]> b2 = ListUtil.buildListOfIntArray(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}});
        List<int[]> result2 = instance.getPairs(a2, b2,10);
        List<int[]> expect2 = ListUtil.buildListOfIntArray(new int[][]{{2, 4}, {3, 2}});

        assertEquals(expect2.size(), result2.size());

        for (int i = 0; i < expect2.size(); i++) {
            assertArrayEquals(expect2.get(i), result2.get(i));
        }

        List<int[]> a3 = ListUtil.buildListOfIntArray(new int[][]{{1, 8}, {2, 7}, {3, 14}});
        List<int[]> b3 = ListUtil.buildListOfIntArray(new int[][]{{1, 5}, {2, 10}, {3, 14}});
        List<int[]> result3 = instance.getPairs(a3, b3,20);
        List<int[]> expect3 = ListUtil.buildListOfIntArray(new int[][]{{3, 1}});

        assertEquals(expect3.size(), result3.size());

        for (int i = 0; i < expect3.size(); i++) {
            assertArrayEquals(expect3.get(i), result3.get(i));
        }

        List<int[]> a4 = ListUtil.buildListOfIntArray(new int[][]{{1, 8}, {2, 15}, {3, 9}});
        List<int[]> b4 = ListUtil.buildListOfIntArray(new int[][]{{1, 8}, {2, 11}, {3, 12}});
        List<int[]> result4 = instance.getPairs(a4, b4,20);
        List<int[]> expect4 = ListUtil.buildListOfIntArray(new int[][]{{1, 3}, {3, 2}});

        assertEquals(expect4.size(), result4.size());

        for (int i = 0; i < expect4.size(); i++) {
            assertArrayEquals(expect4.get(i), result4.get(i));
        }

    }
}
