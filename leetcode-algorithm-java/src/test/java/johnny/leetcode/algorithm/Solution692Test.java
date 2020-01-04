package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
