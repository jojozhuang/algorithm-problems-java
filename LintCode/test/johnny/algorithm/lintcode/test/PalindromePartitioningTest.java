/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.PalindromePartitioning;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class PalindromePartitioningTest {
    
    public PalindromePartitioningTest() {
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
     * Test of partition method, of class PalindromePartitioning.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        String s = "";
        PalindromePartitioning instance = new PalindromePartitioning();
        List<List<String>> expResult = new ArrayList<List<String>>();
        List<List<String>> result = instance.partition(s);
        assertEquals(expResult, result);
        
        List<String> result21 = new ArrayList<String>();
        result21.add("a");
        List<List<String>> expResult2 = new ArrayList<List<String>>();
        expResult2.add(result21);        
        assertEquals(expResult2, instance.partition("a"));
        
        List<String> result31 = new ArrayList<String>();
        result31.add("a");
        result31.add("b");
        List<List<String>> expResult3 = new ArrayList<List<String>>();
        expResult3.add(result31);       
        assertEquals(expResult3, instance.partition("ab"));

        List<String> result41 = new ArrayList<String>();
        result41.add("aa");
        result41.add("b");
        List<String> result42 = new ArrayList<String>();
        result42.add("a");
        result42.add("a");
        result42.add("b");
        List<List<String>> expResult4 = new ArrayList<List<String>>();
        expResult4.add(result42);  
        expResult4.add(result41);   
        assertEquals(expResult4, instance.partition("aab"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
