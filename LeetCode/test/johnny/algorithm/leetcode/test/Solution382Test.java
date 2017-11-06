/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import johnny.algorithm.leetcode.Solution382;
import johnny.algorithm.leetcode.common.ListNode;
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
public class Solution382Test {
    
    public Solution382Test() {
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
     * Test of getRandom method, of class Solution382.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        
        ListNode head1 = ListNode.createInstance(new int[]{1,2,3});
        Solution382 instance = new Solution382(head1);
        int result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        result1 = instance.getRandom();
        assertTrue(1 <= result1 && result1 <= 3);
        
        ListNode head2 = ListNode.createInstance(new int[]{100,101,102});
        Solution382 instance2 = new Solution382(head2);
        int result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        result2 = instance2.getRandom();
        assertTrue(100 <= result2 && result2 <= 102);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
