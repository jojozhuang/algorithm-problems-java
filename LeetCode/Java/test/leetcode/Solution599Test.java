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
public class Solution599Test {
    
    public Solution599Test() {
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
     * Test of findRestaurant method, of class Solution599.
     */
    @Test
    public void testFindRestaurant() {
        System.out.println("findRestaurant");
        Solution599 instance = new Solution599();
        
        assertArrayEquals(new String[]{"abc"}, instance.findRestaurant(new String[]{"abc"}, new String[]{"abc"}));
        assertArrayEquals(new String[]{"cd"}, instance.findRestaurant(new String[]{"abc","cd"}, new String[]{"cd"}));
        assertArrayEquals(new String[]{"ef"}, instance.findRestaurant(new String[]{"ef","cd"}, new String[]{"ef","cd"}));
        assertArrayEquals(new String[]{"ef","wo"}, instance.findRestaurant(new String[]{"ef","wo"}, new String[]{"wo","ef"}));
        assertArrayEquals(new String[]{"Shogun"}, instance.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        assertArrayEquals(new String[]{"Shogun"}, instance.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
