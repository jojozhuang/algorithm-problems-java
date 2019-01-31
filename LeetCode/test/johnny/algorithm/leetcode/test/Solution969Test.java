package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution969;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution969Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pancakeSort");
        Solution969 instance = new Solution969();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {4,2,4,3});
        assertEquals(expect1, instance.pancakeSort(new int[]{3,2,4,1}));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{});
        assertEquals(expect2, instance.pancakeSort(new int[] {1,2,3}));
    }
}
