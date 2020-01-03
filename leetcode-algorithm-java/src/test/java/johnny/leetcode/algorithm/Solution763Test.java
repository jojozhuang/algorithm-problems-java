package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution763;
import johnny.algorithm.common.ListUtil;

public class Solution763Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("partitionLabels");
        Solution763 instance = new Solution763();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {9,7,8});
        assertEquals(expect1, instance.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
