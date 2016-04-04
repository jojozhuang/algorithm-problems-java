/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;
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
public class SubsetsTest {
    
    public SubsetsTest() {
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
     * Test of subsets method, of class Subsets.
     */
    @Test
    public void testSubsets() {
        System.out.println("subsets");
        int[] S = null;
        Subsets instance = new Subsets();
        ArrayList<ArrayList<Integer>> expResult = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = instance.subsets(S);
        assertEquals(expResult, result);
        
        ArrayList<ArrayList<Integer>> expResult4 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> item4 = new ArrayList<Integer>();
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(2);
        expResult4.add(item4);        
        item4 = new ArrayList<Integer>();
        item4.add(2);
        expResult4.add(item4);
        assertEquals(expResult4, instance.subsets(new int[]{1,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
