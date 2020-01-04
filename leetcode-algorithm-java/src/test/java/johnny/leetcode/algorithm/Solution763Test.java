package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution763Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("partitionLabels");
        Solution763 instance = new Solution763();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {9,7,8});
        assertEquals(expect1, instance.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
