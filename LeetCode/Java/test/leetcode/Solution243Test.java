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
public class Solution243Test {
    
    public Solution243Test() {
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
     * Test of shortestDistance method, of class Solution243.
     */
    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        List<String> words = null;
        String word1 = "";
        String word2 = "";
        Solution243 instance = new Solution243();
        int expResult = 0;
        int result = instance.shortestDistance(words, word1, word2);
        assertEquals(expResult, result);
        
        List<String> words2 = new ArrayList<String>();
        words2.add("practice");
        words2.add("makes");
        words2.add("perfect");
        words2.add("coding");
        words2.add("makes");
        assertEquals(3, instance.shortestDistance(words2, "coding", "practice"));
        assertEquals(1, instance.shortestDistance(words2, "makes", "coding"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
