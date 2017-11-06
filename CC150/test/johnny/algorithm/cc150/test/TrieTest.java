/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.cc150.Trie;

import static org.junit.Assert.*;

/**
 *
 * @author i857285
 */
public class TrieTest {
    
    public TrieTest() {
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
     * Test of insert method, of class Trie.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String word = "";
        Trie instance = new Trie();
        instance.insert(word);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Trie.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Trie trie = new Trie();
        trie.insert("dot");
        trie.insert("dog");
        trie.insert("fat");
        trie.insert("full");
        trie.insert("apple");
        assertEquals(true, trie.search("fat"));
        assertEquals(false, trie.search("fit"));
        assertEquals(true, trie.search("dog"));
        assertEquals(false, trie.search("tog"));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of startsWith method, of class Trie.
     */
    @Test
    public void testStartsWith() {
        System.out.println("startsWith");
        Trie trie = new Trie();
        trie.insert("dot");
        trie.insert("dog");
        trie.insert("fat");
        trie.insert("full");
        trie.insert("apple");
        assertEquals(true, trie.startsWith("do"));
        assertEquals(false, trie.startsWith("dow"));
        assertEquals(true, trie.startsWith("f"));
        assertEquals(false, trie.startsWith("ac"));
        assertEquals(false, trie.startsWith("apq"));
        assertEquals(true, trie.startsWith("full"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
