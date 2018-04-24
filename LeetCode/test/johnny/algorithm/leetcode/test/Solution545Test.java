package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution545;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution545Test {

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
        System.out.println("boundaryOfBinaryTree");
        Solution545 instance = new Solution545();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","3","4"});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1, 3, 4, 2});
        assertEquals(expect1, instance.boundaryOfBinaryTree(root1));
    }

}
