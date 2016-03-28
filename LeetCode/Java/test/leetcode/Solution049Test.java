/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution049Test {
    
    public Solution049Test() {
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
     * Test of anagrams method, of class Solution049.
     */
    @Test
    public void testGroupAnagrams() {
        System.out.println("groupAnagrams");
        String[] strs = null;
        Solution049 instance = new Solution049();
        List<List<String>> expResult = new ArrayList();
        List<List<String>> result = instance.groupAnagrams(strs);
        assertEquals(expResult, result);
        
        List<List<String>> expResult2 = new ArrayList();
        List<String> list21 = new ArrayList();
        list21.add("abc");
        expResult2.add(list21);
        assertEquals(expResult2, instance.groupAnagrams(new String[]{"abc"}));
        
        List<List<String>> expResult3 = new ArrayList();
        List<String> list31 = new ArrayList();
        list31.add("abc");
        list31.add("cba");
        expResult3.add(list31);
        assertEquals(expResult3, instance.groupAnagrams(new String[]{"abc","cba"}));
        
        List<List<String>> expResult4 = new ArrayList();
        List<String> list41 = new ArrayList();
        list41.add("abc");
        list41.add("cba");
        List<String> list42 = new ArrayList();
        list42.add("def");
        expResult4.add(list41);
        expResult4.add(list42);
        assertEquals(expResult4, instance.groupAnagrams(new String[]{"abc","def","cba"}));
        
        List<List<String>> expResult5 = new ArrayList();
        List<String> list51 = new ArrayList();
        list51.add("abc");
        List<String> list52 = new ArrayList();
        list52.add("def");
        List<String> list53 = new ArrayList();
        list53.add("eba");
        expResult5.add(list51);
        expResult5.add(list52);
        expResult5.add(list53);
        assertEquals(expResult5, instance.groupAnagrams(new String[]{"abc","def","eba"}));
        
        List<List<String>> expResult6 = new ArrayList();
        List<String> list61 = new ArrayList();
        list61.add("ate");
        list61.add("eat");
        list61.add("tea");
        List<String> list62 = new ArrayList();
        list62.add("nat");
        list62.add("tan");
        List<String> list63 = new ArrayList();
        list63.add("bat");
        expResult6.add(list61);
        expResult6.add(list62);
        expResult6.add(list63);
        List<List<String>> result6 = instance.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertTrue(expResult6.containsAll(result6)&&result6.containsAll(expResult6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
