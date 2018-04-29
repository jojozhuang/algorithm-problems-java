package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution079;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution079Test {
    
    public Solution079Test() {
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
     * Test of exist method, of class Solution079.
     */
    @Test
    public void testExist() {
        System.out.println("exist");
        char[][] board = null;
        String word = "";
        Solution079 instance = new Solution079();
        boolean expResult = false;
        boolean result = instance.exist(board, word);
        assertEquals(expResult, result);
        
        char[][] board2 = new char[][] {
            "ABCE".toCharArray(),"SFCS".toCharArray(), "ADEE".toCharArray()
        };        
        assertEquals(true, instance.exist(board2, "ABCCED"));
        assertEquals(true, instance.exist(board2, "SEE"));
        assertEquals(false, instance.exist(board2, "ABCB"));
        
        char[][] board3 = new char[][] {
            "ABCE".toCharArray(),"SFES".toCharArray(), "ADEE".toCharArray()
        };
        assertEquals(true, instance.exist(board3, "ABCESEEEFS"));
    }
}
