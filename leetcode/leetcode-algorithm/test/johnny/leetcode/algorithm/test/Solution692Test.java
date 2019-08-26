package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution692;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution692Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("topKFrequent");
        Solution692 instance = new Solution692();

        List<String> result1 = ListUtil.buildList(new String[] {"i", "love"});
        assertEquals(result1, instance.topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2));

        List<String> result2 = ListUtil.buildList(new String[] {"the", "is", "sunny", "day"});
        assertEquals(result2, instance.topKFrequent(new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }
}
