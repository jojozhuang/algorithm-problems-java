/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.WordSearch;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class WordSearchTest {
    
    public WordSearchTest() {
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
     * Test of exist method, of class WordSearch.
     */
    @Test
    public void testExist() {
        System.out.println("exist");
        char[][] board = null;
        String word = "";
        WordSearch instance = new WordSearch();
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
