package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution051;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution051Test {
    
    public Solution051Test() {
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
     * Test of solveNQueens method, of class Solution051.
     */
    @Test
    public void testSolveNQueens() {
        System.out.println("solveNQueens");
        int n = 0;
        Solution051 instance = new Solution051();
        List<List<String>> expResult = new ArrayList<>();
        List<List<String>> result = instance.solveNQueens(n);
        assertEquals(expResult, result);
        
        List<List<String>> expResult11 = new ArrayList<>();
        expResult11.add(new ArrayList<String>());
        expResult11.get(0).add("Q");
        assertEquals(expResult11, instance.solveNQueens(1));
        assertEquals(expResult, instance.solveNQueens(2));
        assertEquals(expResult, instance.solveNQueens(3));
        
        List<List<String>> expResult2 = new ArrayList<>();
        expResult2.add(new ArrayList<String>());
        expResult2.add(new ArrayList<String>());
        expResult2.get(0).add(".Q..");
        expResult2.get(0).add("...Q");
        expResult2.get(0).add("Q...");
        expResult2.get(0).add("..Q.");
        expResult2.get(1).add("..Q.");
        expResult2.get(1).add("Q...");
        expResult2.get(1).add("...Q");
        expResult2.get(1).add(".Q..");        
     
        assertEquals(expResult2, instance.solveNQueens(4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
