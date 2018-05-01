package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution636;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution636Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("exclusiveTime");
        Solution636 instance = new Solution636();

        List<String> logs1 = ListUtil.buildList(new String[] {"0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6"});
        assertArrayEquals(new int[] {3, 4}, instance.exclusiveTime(2, logs1));
    }
}
