package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution653;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution653Test {

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
        System.out.println("findTarget");
        Solution653 instance = new Solution653();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        assertEquals(true, instance.findTarget(root1, 9));
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"5","3","6","2","4","#","7"});
        assertEquals(false, instance.findTarget(root2, 28));
    }
}
