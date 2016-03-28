/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.List;
import java.util.ArrayList;
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
public class Solution017Test {
    
    public Solution017Test() {
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
     * Test of letterCombinations method, of class Solution017.
     */
    @Test
    public void testLetterCombinations() {
        System.out.println("letterCombinations");
        String digits = "";
        Solution017 instance = new Solution017();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.letterCombinations(digits);
        assertEquals(expResult, result);
        
        assertEquals(expResult, instance.letterCombinations("1"));
        
        List<String> expResult2 = new ArrayList<String>();        
        expResult2.add("a");
        expResult2.add("b");
        expResult2.add("c");
        assertEquals(expResult2, instance.letterCombinations("2"));
        
        List<String> expResult3 = new ArrayList<String>();        
        expResult3.add("ad");
        expResult3.add("ae");
        expResult3.add("af");
        expResult3.add("bd");
        expResult3.add("be");
        expResult3.add("bf");
        expResult3.add("cd");
        expResult3.add("ce");
        expResult3.add("cf");
        assertEquals(expResult3, instance.letterCombinations("23"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
