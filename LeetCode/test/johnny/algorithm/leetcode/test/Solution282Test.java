package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution282;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution282Test {
    
    public Solution282Test() {
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
     * Test of addOperators method, of class Solution282.
     */
    @Test
    public void testAddOperators() {
        System.out.println("addOperators");
        Solution282 instance = new Solution282();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.addOperators("", 0));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"1+2+3","1*2*3"});
        assertEquals(expect2, instance.addOperators("123", 6));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"2+3*2","2*3+2"});
        assertEquals(expect3, instance.addOperators("232", 8));
        
        List<String> expect4 = ListUtil.buildList(new String[] {"1*0+5","10-5"});
        assertEquals(expect4, instance.addOperators("105", 5));
        
        List<String> expect5 = ListUtil.buildList(new String[] {"0+0","0-0","0*0"});
        assertEquals(expect5, instance.addOperators("00", 0));
        
        List<String> expect6 = new ArrayList<String>();
        assertEquals(expect6, instance.addOperators("3456237490", 9191));
    }
}
