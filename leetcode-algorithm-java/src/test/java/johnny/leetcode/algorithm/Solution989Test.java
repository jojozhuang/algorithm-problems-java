package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution989;
import johnny.algorithm.common.ListUtil;

public class Solution989Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("addToArrayForm");
        Solution989 instance = new Solution989();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,2,3,4});
        assertEquals(expect1, instance.addToArrayForm(new int[] {1,2,0,0}, 34));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {4,5,5});
        assertEquals(expect2, instance.addToArrayForm(new int[] {2,7,4}, 181));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,0,2,1});
        assertEquals(expect3, instance.addToArrayForm(new int[] {2,1,5}, 806));
        
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {1,0,0,0,0,0,0,0,0,0,0});
        assertEquals(expect4, instance.addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9}, 1));
    }
}
