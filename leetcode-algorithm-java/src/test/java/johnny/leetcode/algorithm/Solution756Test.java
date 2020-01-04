package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution756Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pyramidTransition");
        Solution756 instance = new Solution756();

        List<String> allowed1 = ListUtil.buildList(new String[] {"XXX", "XXY", "XYX", "XYY", "YXZ"});
        assertEquals(false, instance.pyramidTransition("XXYX", allowed1));
    }
}
