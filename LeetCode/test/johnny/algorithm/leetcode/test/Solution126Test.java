package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution126;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution126Test {
    
    public Solution126Test() {
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
     * Test of findLadders method, of class Solution126.
     */
    @Test
    public void testFindLadders() {
        System.out.println("findLadders");
        String beginWord = "";
        String endWord = "";
        List<String> wordList = null;
        Solution126 instance = new Solution126();
        List<List<String>> expResult = new ArrayList<List<String>>();
        List<List<String>> result = instance.findLadders(beginWord, endWord, wordList);
        assertEquals(expResult, result);
        
        List<String> wordList2 = new ArrayList<String>();
        wordList2.add("hot");
        wordList2.add("dot");
        wordList2.add("dog");
        wordList2.add("lot");
        wordList2.add("log");
        List<String> list21 = new ArrayList<String>();
        list21.add("hit");
        list21.add("hot");
        list21.add("dot");
        list21.add("dog");
        list21.add("cog");
        List<String> list22 = new ArrayList<String>();
        list22.add("hit");
        list22.add("hot");
        list22.add("lot");
        list22.add("log");
        list22.add("cog");
        List<List<String>> expResult2 = new ArrayList<List<String>>();
        //expResult2.add(list21);
        //expResult2.add(list22);
        assertEquals(expResult2, instance.findLadders("hit", "cog", wordList2));
        
        List<String> wordList3 = new ArrayList<String>();
        wordList2.add("hot");
        wordList2.add("dot");
        wordList2.add("dog");
        wordList2.add("lot");
        wordList2.add("log");
        wordList2.add("cog");
        List<String> list31 = new ArrayList<String>();
        list21.add("hit");
        list21.add("hot");
        list21.add("dot");
        list21.add("dog");
        list21.add("cog");
        List<String> list32 = new ArrayList<String>();
        list22.add("hit");
        list22.add("hot");
        list22.add("lot");
        list22.add("log");
        list22.add("cog");
        List<List<String>> expResult3 = new ArrayList<List<String>>();
        expResult2.add(list31);
        expResult2.add(list32);
        assertEquals(expResult3, instance.findLadders("hit", "cog", wordList3));
    }
}
