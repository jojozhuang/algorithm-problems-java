package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ZeroSubarraySumTest extends JunitBase {

    /**
     * Test of subarraySum method, of class ZeroSubarraySum.
     */
    @Test
    public void testSubarraySum() {
        System.out.println("subarraySum");
        ZeroSubarraySum instance = new ZeroSubarraySum();

        List<Integer> expect1 = ListUtil.buildList(new Integer[]{0,0});
        assertEquals(expect1, instance.subarraySum(null));

        List<Integer> expect2 = ListUtil.buildList(new Integer[]{0,2});
        assertEquals(expect2, instance.subarraySum(new int[] { -3, 1, 2, -3, 4}));

        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1,3});
        assertEquals(expect3, instance.subarraySum(new int[] { 5, -1, 2, -1, 2}));

        List<Integer> expect4 = ListUtil.buildList(new Integer[]{0,0});
        assertEquals(expect4, instance.subarraySum(new int[] {0}));
    }
}
