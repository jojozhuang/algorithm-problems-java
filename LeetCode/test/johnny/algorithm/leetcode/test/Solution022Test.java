/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution022;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution022Test {
    
    public Solution022Test() {
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
     * Test of generateParenthesis method, of class Solution022.
     */
    @Test
    public void testGenerateParenthesis() {
        System.out.println("generateParenthesis");
        Solution022 instance = new Solution022();
        List<String> expResult = new ArrayList();
        List<String> result = instance.generateParenthesis(0);
        assertEquals(expResult, result);
        
        List<String> list1 = new ArrayList<String>();
        list1.add("()");
        assertEquals(list1, instance.generateParenthesis(1));
        
        List<String> list2 = new ArrayList<String>();        
        list2.add("()()");
        list2.add("(())");
        List<String> result2 = instance.generateParenthesis(2);
        assertTrue(result2.containsAll(list2) && list2.containsAll(result2));
              
        List<String> list3 = new ArrayList<String>();        
        list3.add("((()))");
        list3.add("(()())");
        list3.add("(())()");
        list3.add("()(())");
        list3.add("()()()");
        List<String> result3 = instance.generateParenthesis(3);
        assertTrue(result3.containsAll(list3) && list3.containsAll(result3));
        
        List<String> list4 = new ArrayList<String>();        
        list4.add("()()()()");
        list4.add("(()()())");
        list4.add("()(()())");
        list4.add("((()()))");
        list4.add("(()())()");
        list4.add("()()(())");
        list4.add("(()(()))");
        list4.add("()(())()");
        list4.add("()((()))");
        list4.add("(((())))");
        list4.add("((()))()");
        list4.add("((())())");
        list4.add("(())()()");
        list4.add("(())(())");
        List<String> result4 = instance.generateParenthesis(4);
        assertTrue(result4.containsAll(list4) && list4.containsAll(result4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
