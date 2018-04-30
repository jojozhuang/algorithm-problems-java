package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution119;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution119Test {
    
    public Solution119Test() {
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
     * Test of getRow method, of class Solution119.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Solution119 instance = new Solution119();
        
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect1, instance.getRow(-1));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1});
        assertEquals(expect2,  instance.getRow(0));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1,1});
        assertEquals(expect3,  instance.getRow(1));

        List<Integer> expect4 = ListUtil.buildList(new Integer[]{1,2,1});
        assertEquals(expect4,  instance.getRow(2));

        List<Integer> expect5 = ListUtil.buildList(new Integer[]{1,3,3,1});
        assertEquals(expect5,  instance.getRow(3));
    }
}
