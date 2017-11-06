/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution380;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution380Test {
    
    public Solution380Test() {
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
     * Test of getRandom method, of class Solution380.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        Solution380 randomSet = new Solution380();
        
        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomSet.insert(1);

        // Returns false as 2 does not exist in the set.
        assertFalse(randomSet.remove(2));

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        assertTrue(randomSet.insert(2));

        // getRandom should return either 1 or 2 randomly.
        int random1 = randomSet.getRandom();
        assertTrue(random1 == 1 || random1 == 2);

        // Removes 1 from the set, returns true. Set now contains [2].
        assertTrue(randomSet.remove(1));

        // 2 was already in the set, so return false.
        assertFalse(randomSet.insert(2));

        // Since 2 is the only number in the set, getRandom always return 2.
        assertTrue(randomSet.getRandom() == 2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
