package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution632;
import johnny.algorithm.leetcode.common.ListUtil;

/**
 *
 * @author Johnny
 */
public class Solution632Test {
    
    public Solution632Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findErrorNums method, of class Solution632.
     */
    @Test
    public void testFindErrorNums() {
        System.out.println("judgeSquareSum");
        Solution632 instance = new Solution632();

        List<List<Integer>> nums1 = ListUtil.buildList2(new Integer[][] {{4,10,15,24,26}, {0,9,12,20}, {5,18,22,30}});
        assertArrayEquals(new int[] {20,24}, instance.smallestRange(nums1));
    }
    
}
