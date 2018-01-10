package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution247;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution247Test {
    
    public Solution247Test() {
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
     * Test of findStrobogrammatic method, of class Solution247.
     */
    @Test
    public void testFindStrobogrammatic() {
        System.out.println("findStrobogrammatic");

        Solution247 instance = new Solution247();
        List<String> expResult = new ArrayList<String>();
        expResult.add("");
        List<String> result = instance.findStrobogrammatic(0);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>(Arrays.asList("0", "1","8"));
        assertEquals(expResult2, instance.findStrobogrammatic(1));
        
        List<String> expResult3 = new ArrayList<String>(Arrays.asList("11", "69","88", "96"));
        assertEquals(expResult3, instance.findStrobogrammatic(2));
        
        List<String> expResult4 = new ArrayList<String>(Arrays.asList("101", "609","808", "906","111", "619","818", "916", "181", "689","888", "986"));
        assertEquals(expResult4, instance.findStrobogrammatic(3));
        
        List<String> expResult5 = new ArrayList<String>(Arrays.asList("1001", "6009","8008", "9006","1111", "6119","8118", "9116","1691", "6699","8698", "9696","1881", "6889","8888", "9886","1961", "6969","8968", "9966"));
         List<String> result5 = instance.findStrobogrammatic(4);
        assertEquals(expResult5, result5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
