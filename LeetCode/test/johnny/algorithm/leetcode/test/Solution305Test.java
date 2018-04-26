package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution305;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution305Test {
    
    public Solution305Test() {
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
     * Test of numIslands2 method, of class Solution305.
     */
    @Test
    public void testNumIslands2() {
        System.out.println("numIslands2");
        Solution305 instance = new Solution305();
        
        List<Integer> expect1 = new ArrayList<Integer>(); 
        assertEquals(expect1, instance.numIslands2(0, 0, null));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1, 1, 2, 3});
        List<Integer> result2 = instance.numIslands2(3, 3, new int[][]{{0,0},{0,1},{1,2},{2,1}});
        assertEquals(expect2, result2);

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,2,3,4,3,2,1});
        List<Integer> result3 = instance.numIslands2(3, 3, new int[][]{{0,1},{1,2},{2,1},{1,0},{0,2},{0,0},{1,1}});
        assertEquals(expect3, result3);
}
    
}
