package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Solution969Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pancakeSort");
        Solution969 instance = new Solution969();

        int[] A1 = new int[]{3,2,4,1};
        int[] A1_original = new int[]{3,2,4,1};
        List<Integer> result1 = instance.pancakeSort(A1);
        assertTrue(result1.size() < 10 * A1.length);
        for (Integer pos : result1) {
            instance.swap(A1_original, 0, pos - 1);
        }
        for (int i = 0; i < A1_original.length; i++) {
            assertEquals(A1_original[i], i + 1);
        }

        
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{});
        assertEquals(expect2, instance.pancakeSort(new int[] {1,2,3}));
    }
}
