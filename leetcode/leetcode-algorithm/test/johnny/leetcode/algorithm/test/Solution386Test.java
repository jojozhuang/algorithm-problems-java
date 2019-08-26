package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution386;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution386Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lexicalOrder");
        Solution386 instance = new Solution386();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,10,11,12,13,2,3,4,5,6,7,8,9});
        assertEquals(expect1, instance.lexicalOrder(13));
    }
}
