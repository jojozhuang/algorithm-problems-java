package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution444;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution444Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sequenceReconstruction");
        Solution444 instance = new Solution444();

        List<List<Integer>> seqs1 = ListUtil.buildList2(new Integer[][] {{1,2},{1,3}});
        assertEquals(false, instance.sequenceReconstruction(new int[] {1,2,3}, seqs1));

        List<List<Integer>> seqs2 = ListUtil.buildList2(new Integer[][] {{1,2}});
        assertEquals(false, instance.sequenceReconstruction(new int[] {1,2,3}, seqs2));

        List<List<Integer>> seqs3 = ListUtil.buildList2(new Integer[][] {{1,2},{1,3},{2,3}});
        assertEquals(true, instance.sequenceReconstruction(new int[] {1,2,3}, seqs3));

        List<List<Integer>> seqs4 = ListUtil.buildList2(new Integer[][] {{5,2,6,3},{4,1,5,2}});
        assertEquals(true, instance.sequenceReconstruction(new int[] {4,1,5,2,6,3}, seqs4));
    }
}
