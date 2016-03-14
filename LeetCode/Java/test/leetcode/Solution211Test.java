/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RZHUANG
 */
public class Solution211Test {
    
    public Solution211Test() {
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
     * Test of addWord method, of class Solution211.
     */
    @Test
    public void testAddWord() {
        System.out.println("addWord");
        String word = "";
        Solution211 instance = new Solution211();
        instance.addWord(word);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Solution211.
     */
    @Test
    public void testSearch() {
        System.out.println("search");        
        Solution211 instance = new Solution211();
        instance.addWord("bad");
        instance.addWord("dad");
        instance.addWord("mad");
        assertEquals(false, instance.search("pad"));
        assertEquals(true, instance.search("bad"));
        assertEquals(true, instance.search(".ad"));
        assertEquals(true, instance.search("b.."));
        assertEquals(false, instance.search(".bd"));
        assertEquals(false, instance.search("ba"));
        assertEquals(false, instance.search("m."));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
