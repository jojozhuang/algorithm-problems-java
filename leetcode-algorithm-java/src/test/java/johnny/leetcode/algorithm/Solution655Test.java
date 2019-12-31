package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution655;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution655Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("printTree");
        Solution655 instance = new Solution655();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","#"});
        List<List<String>> result1 = ListUtil.buildList2(new String[][] {{"", "1", ""}, {"2", "", ""}});
        assertEquals(result1, instance.printTree(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3","#","4","#","#"});
        List<List<String>> result2 = ListUtil.buildList2(new String[][] {{"", "", "", "1", "", "", ""},
            {"", "2", "", "", "", "3", ""},
            {"", "", "4", "", "", "", ""}});
        assertEquals(result2, instance.printTree(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","5","3","#","#","#","4","#"});
        List<List<String>> result3 = ListUtil.buildList2(new String[][] {{"",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""},
        {"",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""},
        {"",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""},
        {"4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""}});
        assertEquals(result3, instance.printTree(root3));
    }
}
