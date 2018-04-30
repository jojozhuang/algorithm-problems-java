package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution089;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution089Test {
    
    public Solution089Test() {
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
     * Test of grayCode method, of class Solution089.
     */
    @Test
    public void testGrayCode() {
        System.out.println("grayCode");
        Solution089 instance = new Solution089();
        
        List<Integer> expect1 =  ListUtil.buildList(new Integer[] {0});
        assertEquals(expect1, instance.grayCode(0));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0,1});
        assertEquals(expect2, instance.grayCode(1));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {0,1,3,2});
        assertEquals(expect3, instance.grayCode(2));
        
         List<Integer> expect4 = ListUtil.buildList(new Integer[] {0,1,3,2,6,7,5,4});
        assertEquals(expect4, instance.grayCode(3));
    }
}
