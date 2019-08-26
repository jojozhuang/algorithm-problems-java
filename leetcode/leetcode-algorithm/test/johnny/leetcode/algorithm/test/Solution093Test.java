package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution093;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution093Test extends JunitBase {

    @Test
    public void testRestoreIpAddresses() {
        System.out.println("restoreIpAddresses");
        Solution093 instance = new Solution093();

        List<String> expect1 = ListUtil.buildList(new String[] {});
        assertEquals(expect1, instance.restoreIpAddresses(""));

        List<String> expect2 = ListUtil.buildList(new String[] {"255.255.11.135","255.255.111.35"});
        assertEquals(expect2, instance.restoreIpAddresses("25525511135"));
    }
}
