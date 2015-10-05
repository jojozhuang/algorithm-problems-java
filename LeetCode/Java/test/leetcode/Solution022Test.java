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
        int n = 0;
        int i = 0;
        int j = 0;
        Solution022 instance = new Solution022();
        List<String> expResult = new ArrayList();
        List<String> result = instance.generateParenthesis(n);
        assertEquals(expResult, result);
        
        List<String> list1 = new ArrayList<String>();
        list1.add("()");
        assertEquals(list1, instance.generateParenthesis(1));
        
        List<String> list2 = new ArrayList<String>();
        List<String> result2 = instance.generateParenthesis(2);
        list2.add("()()");  
        list2.add("(())");        
        assertEquals(list2.size(), result2.size());
       
        for(i=0; i< list2.size(); i++) {
            for(j=0; j<result2.size(); j++) {
                if (list2.get(i).equals(result2.get(j))) {
                    assertEquals(list2.get(i), result2.get(j));
                    break;
                }
            }
            if (j>=result2.size())
                assertEquals(list2.get(i), result2.get(0));
        }
        
        List<String> list3 = new ArrayList<String>();
        List<String> result3 = instance.generateParenthesis(3);
        list3.add("((()))");
        list3.add("(()())");
        list3.add("(())()");
        list3.add("()(())");
        list3.add("()()()");
        assertEquals(list3.size(), result3.size());
        for(i=0; i< list3.size(); i++) {
            for(j=0; j<result3.size(); j++) {
                if (list3.get(i).equals(result3.get(j))) {
                    assertEquals(list3.get(i), result3.get(j));
                    break;
                }
            }
            if (j>=result3.size())
                assertEquals(list3.get(i), result3.get(0));
        }
        
        List<String> list4 = new ArrayList<String>();
        List<String> result4 = instance.generateParenthesis(4);
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
        assertEquals(list4.size(), result4.size());
        for(i=0; i< list4.size(); i++) {
            for(j=0; j<result4.size(); j++) {
                if (list4.get(i).equals(result4.get(j))) {
                    assertEquals(list4.get(i), result4.get(j));
                    break;
                }
            }
            if (j>=result4.size())
                assertEquals(list4.get(i), result4.get(0));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
