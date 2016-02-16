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
    public void testAnagrams() {
        System.out.println("anagrams");
        String[] strs = null;
        Solution049 instance = new Solution049();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.anagrams(strs);
        assertEquals(expResult, result);
        
        assertThat(instance.anagrams(new String[]{""}), is(expResult));
        assertThat(instance.anagrams(new String[]{"abc"}), is(expResult));
        assertThat(instance.anagrams(new String[]{"abc","cba"}), is(Arrays.asList("abc","cba")));
        assertThat(instance.anagrams(new String[]{"abc","def","cba"}), is(Arrays.asList("abc","cba")));
        assertThat(instance.anagrams(new String[]{"abc","def","eba"}), is(expResult));
        assertThat(instance.anagrams(new String[]{"abc","def","cba","fed","cy"}), is(Arrays.asList("abc","cba","def","fed")));
        assertThat(instance.anagrams(new String[]{"ant","ant"}), is(Arrays.asList("ant","ant")));
         
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of groupAnagrams method, of class Solution049.
     */
    @Test
    public void testGroupAnagrams() {
        System.out.println("groupAnagrams");
        String[] strs = null;
        Solution049 instance = new Solution049();
        List<List<String>> expResult = new ArrayList<List<String>>();
        List<List<String>> result = instance.groupAnagrams(strs);
        assertEquals(expResult, result);
        
        
        
        //List<List<String>> result2 = instance.groupAnagrams(new String[]{""});
        //assertEquals(1, result2.size());
        
        assertThat(instance.groupAnagrams(new String[]{""}).get(0), is(Arrays.asList("")));
        assertThat(instance.groupAnagrams(new String[]{"abc"}).get(0), is(Arrays.asList("abc")));
        assertThat(instance.groupAnagrams(new String[]{"abc","cba"}).get(0), is(Arrays.asList("abc","cba")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba"}).get(0), is(Arrays.asList("abc","cba")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba"}).get(1), is(Arrays.asList("def")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","eba"}).get(0), is(Arrays.asList("abc")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","eba"}).get(1), is(Arrays.asList("def")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","eba"}).get(2), is(Arrays.asList("eba")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba","fed","cy"}).get(0), is(Arrays.asList("abc","cba")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba","fed","cy"}).get(1), is(Arrays.asList("def", "fed")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba","fed","cy"}).get(2), is(Arrays.asList("cy")));
        assertThat(instance.groupAnagrams(new String[]{"ant","ant"}).get(0), is(Arrays.asList("ant","ant")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba","fed","cy"}).get(0), is(Arrays.asList("abc","cba")));
        assertThat(instance.groupAnagrams(new String[]{"abc","def","cba","fed","cy"}).get(1), is(Arrays.asList("def", "fed")));
        assertThat(instance.groupAnagrams(new String[]{"tea","and","ate","eat","den"}).get(0), is(Arrays.asList("tea", "ate", "eat")));
        assertThat(instance.groupAnagrams(new String[]{"tea","and","ate","eat","den"}).get(1), is(Arrays.asList("and")));
        assertThat(instance.groupAnagrams(new String[]{"tea","and","ate","eat","den"}).get(2), is(Arrays.asList("den")));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
