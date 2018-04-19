package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution783;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution783Test {

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
        System.out.println("maxIncreaseKeepingSkyline");
        Solution783 instance = new Solution783();

        TreeNode root1 = TreeNode.createInstance(new String[] {"4","2","6","1","3","#","#"});
        assertEquals(1, instance.minDiffInBST(root1));
    }

}
