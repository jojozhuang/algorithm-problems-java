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
public class Solution009Test {
    
    public Solution009Test() {
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
     * Test of isPalindrome method, of class Solution009.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        int x = 0;
        Solution009 instance = new Solution009();
        boolean expResult = true;
        boolean result = instance.isPalindrome(x);
        assertEquals(expResult, result);
        assertEquals(true, instance.isPalindrome(1));
        assertEquals(true, instance.isPalindrome(99));
        assertEquals(false, instance.isPalindrome(34));
        assertEquals(false, instance.isPalindrome(-1));
        assertEquals(false, instance.isPalindrome(-13));
        assertEquals(false, instance.isPalindrome(-44));
        assertEquals(true, instance.isPalindrome(10001));
        assertEquals(false, instance.isPalindrome(10021));
        assertEquals(false, instance.isPalindrome(100441));
        assertEquals(true, instance.isPalindrome(10044001));
        assertEquals(true, instance.isPalindrome(234565432));
        assertEquals(false, instance.isPalindrome(1000));
        assertEquals(true, instance.isPalindrome(1001));
        assertEquals(false, instance.isPalindrome(-2147483648));
        assertEquals(false, instance.isPalindrome(2147483647));
        assertEquals(false, instance.isPalindrome(2147383412));
        assertEquals(true, instance.isPalindrome(2143883412));
        assertEquals(false, instance.isPalindrome(-2147447412));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
