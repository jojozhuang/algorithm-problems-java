package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution671;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution671Test {

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
        System.out.println("findSecondMinimumValue");
        Solution671 instance = new Solution671();

        TreeNode root1 = TreeNode.createInstance(new String[] {"2","2","5","#","#", "5","7"});
        assertEquals(5, instance.findSecondMinimumValue(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"2","2","2"});
        assertEquals(-1, instance.findSecondMinimumValue(root2));
    }

}
