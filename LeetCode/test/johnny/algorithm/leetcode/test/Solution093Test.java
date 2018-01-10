package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution093;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution093Test {
    
    public Solution093Test() {
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
     * Test of restoreIpAddresses method, of class Solution093.
     */
    @Test
    public void testRestoreIpAddresses() {
        System.out.println("restoreIpAddresses");
        String s = "";
        Solution093 instance = new Solution093();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.restoreIpAddresses(s);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("255.255.11.135");
        expResult2.add("255.255.111.35");
        assertEquals(expResult2, instance.restoreIpAddresses("25525511135"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }        
}
