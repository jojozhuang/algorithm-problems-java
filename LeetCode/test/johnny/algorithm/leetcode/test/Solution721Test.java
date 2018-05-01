package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution721;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution721Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("accountsMerge");
        Solution721 instance = new Solution721();

        List<List<String>> accounts1 = ListUtil.buildList2(new String[][] {{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"}, {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}});
        List<List<String>> expect1 = ListUtil.buildList2(new String[][]{{"John", "johnnybravo@mail.com"}, {"John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"}, {"Mary", "mary@mail.com"}});
        assertEquals(expect1, instance.accountsMerge(accounts1));
    }
}
