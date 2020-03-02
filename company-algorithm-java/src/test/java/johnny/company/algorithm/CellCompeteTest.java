package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CellCompeteTest extends JunitBase {

    @Test
    public void test() {
        System.out.println("cellCompete");
        CellCompete instance = new CellCompete();

        int[] states1 = new int[]{1,0,0,0,0,1,0,0};
        List<Integer> expect1 = ListUtil.buildList(new Integer[]{0,1,0,0,1,0,1,0});
        assertEquals(expect1, instance.cellCompete(states1, 1));

        int[] states2 = new int[]{1,1,1,0,1,1,1,1};
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{0,0,0,0,0,1,1,0});
        assertEquals(expect2, instance.cellCompete(states2, 2));

        int[] states3 = new int[]{1};
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{0});
        assertEquals(expect3, instance.cellCompete(states3, 1));

        int[] states4 = new int[]{0,1};
        List<Integer> expect4 = ListUtil.buildList(new Integer[]{1,0});
        assertEquals(expect4, instance.cellCompete(states4, 1));

    }
}
