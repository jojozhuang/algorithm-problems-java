package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution187;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution187Test {
    
    public Solution187Test() {
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
     * Test of findRepeatedDnaSequences method, of class Solution187.
     */
    @Test
    public void testFindRepeatedDnaSequences() {
        System.out.println("findRepeatedDnaSequences");
        String s = "";
        Solution187 instance = new Solution187();
        List<String> expResult = new ArrayList<>();
        List<String> result = instance.findRepeatedDnaSequences(s);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<>();
        expResult2.add("AAAAACCCCC");
        expResult2.add("CCCCCAAAAA");        
        assertEquals(expResult2,  instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        
        List<String> expResult3 = new ArrayList<>();
        expResult3.add("AAAAACCCCC");   
        assertEquals(expResult3,  instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCTTTTTGGGTTT"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
