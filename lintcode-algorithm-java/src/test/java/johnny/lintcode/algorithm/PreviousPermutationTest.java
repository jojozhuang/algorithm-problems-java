package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class PreviousPermutationTest extends JunitBase {

    /**
     * Test of previousPermuation method, of class PreviousPermutation.
     */
    @Test
    public void testPreviousPermuation() {
        System.out.println("previousPermuation");
        PreviousPermutation instance = new PreviousPermutation();

        assertEquals(null, instance.previousPermuation(null));
        
        List<Integer> nums2 = ListUtil.buildList(new Integer[]{1});
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1});
        assertEquals(expect2, instance.previousPermuation(nums2));
        
        List<Integer> nums3 = ListUtil.buildList(new Integer[]{1, 2});
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{2, 1});
        assertEquals(expect3, instance.previousPermuation(nums3));

        List<Integer> nums4 = ListUtil.buildList(new Integer[]{2, 1});
        List<Integer> expect4 = ListUtil.buildList(new Integer[]{1, 2});
        assertEquals(expect4, instance.previousPermuation(nums4));

        List<Integer> nums5 = ListUtil.buildList(new Integer[]{1, 2, 3});
        List<Integer> expect5 = ListUtil.buildList(new Integer[]{3, 2, 1});
        assertEquals(expect5, instance.previousPermuation(nums5));

        List<Integer> nums6 =  ListUtil.buildList(new Integer[]{1, 3, 2, 3});
        List<Integer> expect6 =  ListUtil.buildList(new Integer[]{1, 2,3,3});
        assertEquals(expect6, instance.previousPermuation(nums6));

        List<Integer> nums7 =  ListUtil.buildList(new Integer[]{1, 2, 3, 4});
        List<Integer> expect7 =  ListUtil.buildList(new Integer[]{4, 3, 2, 1});
        assertEquals(expect7, instance.previousPermuation(nums7));
    }
}
