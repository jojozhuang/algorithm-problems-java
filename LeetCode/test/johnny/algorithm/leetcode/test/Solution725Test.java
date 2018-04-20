package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution725;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution725Test {

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
        System.out.println("splitListToParts");
        Solution725 instance = new Solution725();

        ListNode root1 = ListNode.createInstance(new int[] {1, 2, 3});
        ListNode[] result1 = ListNode.createList(new int[][]{{1},{2},{3},{},{}});
        assertArrayEquals(result1, instance.splitListToParts(root1, 5));

        ListNode root2 = ListNode.createInstance(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListNode[] result2 = ListNode.createList(new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}});
        assertArrayEquals(result2, instance.splitListToParts(root2, 3));
    }

}
