package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution068Test extends JunitBase {

    @Test
    public void testFullJustify() {
        System.out.println("fullJustify");
        Solution068 instance = new Solution068();

        List<String> expect2 = ListUtil.buildList(new String[] {});
        assertEquals(expect2, instance.fullJustify(null, 0));

        List<String> expect3 = ListUtil.buildList(new String[] {"This    is    an","example  of text","justification.  "});
        assertEquals(expect3, instance.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));

        List<String> expect4 = ListUtil.buildList(new String[] {"What must be","shall be.   "});
        assertEquals(expect4, instance.fullJustify(new String[]{"What","must","be","shall","be."}, 12));
    }
}
