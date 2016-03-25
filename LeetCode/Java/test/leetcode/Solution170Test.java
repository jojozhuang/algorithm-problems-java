/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution170Test {
    
    public Solution170Test() {
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
     * Test of add method, of class Solution170.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int number = 0;
        Solution170 instance = new Solution170();
        instance.add(number);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class Solution170.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Solution170 instance = new Solution170();
        instance.add(1);
        instance.add(3);
        instance.add(5);        
        assertEquals(true, instance.find(4));
        assertEquals(false, instance.find(7));
        assertEquals(true, instance.find(8));
        assertEquals(false, instance.find(3));
        instance.add(5);
        assertEquals(true, instance.find(10));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
