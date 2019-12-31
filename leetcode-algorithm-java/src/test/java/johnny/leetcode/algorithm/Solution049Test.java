package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution049;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution049Test extends JunitBase {

    @Test
    public void testGroupAnagrams() {
        System.out.println("groupAnagrams");
        Solution049 instance = new Solution049();

        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect1, instance.groupAnagrams(null));

        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {{"abc"}});
        assertEquals(expect2, instance.groupAnagrams(new String[]{"abc"}));

        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{"abc","cba"}});
        assertEquals(expect3, instance.groupAnagrams(new String[] {"abc","cba"}));

        List<List<String>> expect4 = ListUtil.buildList2(new String[][] {{"abc","cba"},{"def"}});
        assertEquals(expect4, instance.groupAnagrams(new String[] {"abc","def","cba"}));

        List<List<String>> expect5 = ListUtil.buildList2(new String[][] {{"abc"},{"def"},{"eba"}});
        assertEquals(expect5, instance.groupAnagrams(new String[] {"abc","def","eba"}));

        List<List<String>> expect6 = ListUtil.buildList2(new String[][] {{"ate","eat","tea"},{"nat","tan"},{"bat"}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect6, instance.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"})));
    }
}
