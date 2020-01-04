package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution970Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("powerfulIntegers");
        Solution970 instance = new Solution970();

        List<Integer> expect1 = ListUtil.buildList(new Integer[]{2,3,4,5,7,9,10});
        assertEquals(expect1, instance.powerfulIntegers(2,3,10));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{2,4,6,8,10,14});
        assertEquals(expect2, instance.powerfulIntegers(3,5,15));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{2,3,5,9,17,33,65});
        List<Integer> result3 = instance.powerfulIntegers(1,2,100);
        assertEquals(true, expect3.containsAll(result3) && result3.containsAll(expect3));
    }
}
