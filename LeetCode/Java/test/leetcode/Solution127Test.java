/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;
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
public class Solution127Test {
    
    public Solution127Test() {
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
     * Test of ladderLength method, of class Solution127.
     */
    @Test
    public void testLadderLength() {
        System.out.println("ladderLength");
        String beginWord = "";
        String endWord = "";
        Set<String> wordList = null;
        Solution127 instance = new Solution127();
        int expResult = 0;
        int result = instance.ladderLength(beginWord, endWord, wordList);
        assertEquals(expResult, result);
        
        Set<String> wordList2 = new HashSet<String>();
        wordList2.add("hot");
        wordList2.add("dot");
        wordList2.add("dog");
        wordList2.add("lot");
        wordList2.add("log");
        assertEquals(0, instance.ladderLength("hit", "pet", wordList2));
        Set<String> wordList3 = new HashSet<String>();
        wordList3.add("hot");
        wordList3.add("dot");
        wordList3.add("dog");
        wordList3.add("lot");
        wordList3.add("log");
        assertEquals(2, instance.ladderLength("hit", "hot", wordList3));
        Set<String> wordList4 = new HashSet<String>();
        wordList4.add("hot");
        wordList4.add("dot");
        wordList4.add("dog");
        wordList4.add("lot");
        wordList4.add("log");
        assertEquals(3, instance.ladderLength("hit", "dot", wordList4));
        Set<String> wordList5 = new HashSet<String>();
        wordList5.add("hot");
        wordList5.add("dot");
        wordList5.add("dog");
        wordList5.add("lot");
        wordList5.add("log");
        assertEquals(4, instance.ladderLength("hit", "dog", wordList5));
        Set<String> wordList6 = new HashSet<String>();
        wordList6.add("hot");
        wordList6.add("dot");
        wordList6.add("dog");
        wordList6.add("lot");
        wordList6.add("log");
        assertEquals(5, instance.ladderLength("hit", "cog", wordList6));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
