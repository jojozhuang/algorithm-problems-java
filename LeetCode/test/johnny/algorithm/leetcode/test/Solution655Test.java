package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution655;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution655Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("printTree");
        Solution655 instance = new Solution655();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","#"});
        List<List<String>> result1 = ListUtil.buildStringList2(new String[][] {{"", "1", ""}, {"2", "", ""}});
        assertEquals(result1, instance.printTree(root1));
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3","#","4","#","#"});
        List<List<String>> result2 = ListUtil.buildStringList2(new String[][] {{"", "", "", "1", "", "", ""},
            {"", "2", "", "", "", "3", ""},
            {"", "", "4", "", "", "", ""}});
        assertEquals(result2, instance.printTree(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","5","3","#","#","#","4","#"});
        List<List<String>> result3 = ListUtil.buildStringList2(new String[][] {{"",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""},
        {"",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""},
        {"",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""},
        {"4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""}});
        assertEquals(result3, instance.printTree(root3));
    }

}
