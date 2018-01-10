package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution282;

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
        String num = "";
        int target = 0;
        Solution282 instance = new Solution282();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.addOperators(num, target);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("1+2+3");
        expResult2.add("1*2*3");
        assertEquals(expResult2, instance.addOperators("123", 6));
        
        List<String> expResult3 = new ArrayList<String>();
        expResult3.add("2+3*2");
        expResult3.add("2*3+2");        
        assertEquals(expResult3, instance.addOperators("232", 8));
        
        List<String> expResult4 = new ArrayList<String>();
        expResult4.add("1*0+5");
        expResult4.add("10-5");
        assertEquals(expResult4, instance.addOperators("105", 5));
        
        List<String> expResult5 = new ArrayList<String>();
        expResult5.add("0+0");
        expResult5.add("0-0");
        expResult5.add("0*0");
        assertEquals(expResult5, instance.addOperators("00", 0));
        
        List<String> expResult6 = new ArrayList<String>();
        assertEquals(expResult6, instance.addOperators("3456237490", 9191));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
