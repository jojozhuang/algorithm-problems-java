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
public class Solution118Test {
    
    public Solution118Test() {
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
     * Test of generate method, of class Solution118.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        int numRows = 0;
        Solution118 instance = new Solution118();
        List<List<Integer>> expResult = new ArrayList();
        List<List<Integer>> result = instance.generate(numRows);
        assertEquals(expResult, result);
        
        List<List<Integer>> listpath1 = new ArrayList(); 
        List<Integer> list1 = new ArrayList(); 
        list1.add(1);
        listpath1.add(list1);
        assertEquals(listpath1,  instance.generate(1));
        
        List<List<Integer>> listpath2 = new ArrayList(); 
        List<Integer> list22 = new ArrayList(); 
        list22.add(1);
        list22.add(1);
        listpath2.add(list1);
        listpath2.add(list22);
        assertEquals(listpath2,  instance.generate(2));

        List<List<Integer>> listpath3 = new ArrayList(); 
        List<Integer> list33 = new ArrayList(); 
        list33.add(1);
        list33.add(2);
        list33.add(1);
        listpath3.add(list1);
        listpath3.add(list22);
        listpath3.add(list33);
        assertEquals(listpath3,  instance.generate(3));

        List<List<Integer>> listpath4 = new ArrayList(); 
        List<Integer> list44 = new ArrayList(); 
        list44.add(1);
        list44.add(3);
        list44.add(3);
        list44.add(1);
        listpath4.add(list1);
        listpath4.add(list22);
        listpath4.add(list33);
        listpath4.add(list44);
        assertEquals(listpath4,  instance.generate(4));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
