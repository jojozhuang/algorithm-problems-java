package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution648Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("replaceWords");
        Solution648 instance = new Solution648();

        List<String> dict1 = ListUtil.buildList(new String[] {"cat", "bat", "rat"});
        assertEquals("the cat was rat by the bat", instance.replaceWords(dict1, "the cattle was rattled by the battery"));
    }
}
