/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

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
public class AddandSearchWordTest {
    
    public AddandSearchWordTest() {
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
     * Test of addWord method, of class AddandSearchWord.
     */
    @Test
    public void testAddWord() {
        System.out.println("addWord");
        String word = "";
        AddandSearchWord instance = new AddandSearchWord();
        instance.addWord(word);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class AddandSearchWord.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String word = "";
       
        AddandSearchWord instance = new AddandSearchWord();
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
        
        AddandSearchWord instance2 = new AddandSearchWord();
        instance2.addWord("a");
        assertEquals(true, instance2.search("."));
        
        AddandSearchWord instance3 = new AddandSearchWord();
        assertEquals(false, instance3.search("."));
        
        AddandSearchWord instance4 = new AddandSearchWord();
        instance4.addWord("a");
        instance4.addWord("a");
        assertEquals(true, instance4.search("."));
        assertEquals(true, instance4.search("a"));
        assertEquals(false, instance4.search("aa"));
        assertEquals(true, instance4.search("a"));
        assertEquals(false, instance4.search(".a"));
        assertEquals(false, instance4.search("a."));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
