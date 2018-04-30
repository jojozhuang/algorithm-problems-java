package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution251;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution251Test {
    
    public Solution251Test() {
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
     * Test of next method, of class Solution251.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        
        List<List<Integer>> vector1 = ListUtil.buildList2(new Integer[][] {{1,2},{3},{4,5,6}});
        Solution251 instance = new Solution251(vector1);
        int[] expect1 = new int[]{1,2,3,4,5,6};
        int[] result1 = new int[6];
        int i = 0;
        while (instance.hasNext()) {
            result1[i] = instance.next();
            i++;
        }
        assertArrayEquals(expect1, result1);
    }
}
