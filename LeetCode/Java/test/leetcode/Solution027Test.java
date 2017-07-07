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
public class Solution027Test {
    
    public Solution027Test() {
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
     * Test of removeElement method, of class Solution027.
     */
    @Test
    public void testRemoveElement() {
        System.out.println("removeElement");
        Solution027 instance = new Solution027();

        assertEquals(0, instance.removeElement(null, 0));
        
        assertEquals(1, instance.removeElement(new int[]{1}, 0));
        assertEquals(0, instance.removeElement(new int[]{1}, 1));
        assertEquals(2, instance.removeElement(new int[]{1,2,3}, 1));
        assertEquals(0, instance.removeElement(new int[]{1,1,1}, 1));
        assertEquals(2, instance.removeElement(new int[]{1,3,1,2}, 1));
        
        assertEquals(1, instance.removeElement(new int[]{4,5}, 4));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
