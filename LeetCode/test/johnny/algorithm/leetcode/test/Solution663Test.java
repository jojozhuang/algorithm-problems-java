package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution663;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution663Test {

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
        System.out.println("checkEqualTree");
        Solution663 instance = new Solution663();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","10","10","#","#","2","3"});
        assertEquals(true, instance.checkEqualTree(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","10","#","#","2","20"});
        assertEquals(false, instance.checkEqualTree(root2));
}

}
