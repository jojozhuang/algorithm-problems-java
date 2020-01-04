package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution728Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("selfDividingNumbers");
        Solution728 instance = new Solution728();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,2,3,4,5,6,7,8,9});
        List<Integer> result = instance.selfDividingNumbers(1,9);
        assertEquals(expect1, result);

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22});
        List<Integer> result2 = instance.selfDividingNumbers(1,22);
        assertEquals(expect2, result2);
    }
}
