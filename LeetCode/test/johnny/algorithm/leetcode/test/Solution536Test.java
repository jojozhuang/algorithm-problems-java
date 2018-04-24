package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution536;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution536Test {

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
        System.out.println("str2tree");
        Solution536 instance = new Solution536();

        TreeNode expect1 = TreeNode.createInstance(new String[] {"4","2","6","3","1","5","#"});
        assertTrue(TreeNode.isSame(expect1, instance.str2tree("4(2(3)(1))(6(5))")));
    }

}
