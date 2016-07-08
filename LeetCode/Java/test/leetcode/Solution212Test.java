/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution212Test {
    
    public Solution212Test() {
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
     * Test of findWords method, of class Solution212.
     */
    @Test
    public void testFindWords() {
        System.out.println("findWords");
        char[][] board = null;
        String[] words = null;
        Solution212 instance = new Solution212();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.findWords(board, words);
        assertEquals(expResult, result);
        
        char[][] board2 = new char[][] {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("eat");
        expResult2.add("oath");
        List<String> result2 = instance.findWords(board2, new String[]{"oath","pea","eat","rain"});
        //assertEquals(expResult2, result2);
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
        
        char[][] board3 = new char[][] {
            {'a','a'}
        };
        List<String> expResult3 = new ArrayList<String>();
        expResult3.add("a");
        List<String> result3 = instance.findWords(board3, new String[]{"a"});
        //assertEquals(expResult2, result2);
        assertTrue(expResult3.containsAll(result3) && result3.containsAll(expResult3));
        
        char[][] board4 = new char[][] {
            {'a'}
        };
        List<String> expResult4 = new ArrayList<String>();
        expResult4.add("a");
        expResult4.add("a");
        List<String> result4 = instance.findWords(board4, new String[]{"a", "a"});
        //assertEquals(expResult2, result2);
        assertTrue(expResult4.containsAll(result4) && result4.containsAll(expResult4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
