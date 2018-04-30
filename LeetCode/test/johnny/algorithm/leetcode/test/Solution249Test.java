package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution249;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution249Test {
    
    public Solution249Test() {
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
     * Test of groupStrings method, of class Solution249.
     */
    @Test
    public void testGroupStrings() {
        System.out.println("groupStrings");
        Solution249 instance = new Solution249();
        
        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect1, instance.groupStrings(null));
        
        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {
            {"abc","bcd","xyz"},
            {"az","ba"},
            {"acef"},
            {"a","z"}
          });
        List<List<String>> result2 = instance.groupStrings(new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2,  result2));
    }
}
