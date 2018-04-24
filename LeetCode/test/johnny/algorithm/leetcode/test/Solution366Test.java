package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution366;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution366Test {

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
        System.out.println("findLeaves");
        Solution366 instance = new Solution366();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","3","4","5","#","#"});
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {{4,5,3},{2},{1}});
        assertEquals(expect1, instance.findLeaves(root1));
    }

}
