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
public class MajorityNumber3Test extends JunitBase {

    /**
     * Test of majorityNumber method, of class MajorityNumber3.
     */
    @Test
    public void testMajorityNumber() {
        System.out.println("majorityNumber");
        MajorityNumber3 instance = new MajorityNumber3();

        assertEquals(0, instance.majorityNumber(null, 0));
        
        List<Integer> nums2 = ListUtil.buildList(new Integer[]{1,2,2,3});
        assertEquals(2, instance.majorityNumber(nums2, 3));

        List<Integer> nums3 = ListUtil.buildList(new Integer[]{1,2,2,3,3,3});
        assertEquals(3, instance.majorityNumber(nums3, 3));
        
        List<Integer> nums4 = ListUtil.buildList(new Integer[]{3,1,2,3,2,3,3,4});
        assertEquals(3, instance.majorityNumber(nums4, 3));
    }
}
