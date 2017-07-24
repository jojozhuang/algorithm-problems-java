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
 * @author i857285
 */
public class Solution381Test {
    
    public Solution381Test() {
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
     * Test of getRandom method, of class Solution381.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        Solution381 collection = new Solution381();
        
        // Inserts 1 to the collection. Returns true as the collection did not contain 1.
        assertTrue(collection.insert(1));

        // Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
        assertFalse(collection.insert(1));

        // Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
        assertTrue(collection.insert(2));

        // getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
        int random = collection.getRandom();
        assertTrue(random == 1 || random == 2);

        // Removes 1 from the collection, returns true. Collection now contains [1,2].
        assertTrue(collection.remove(1));

        // getRandom should return 1 and 2 both equally likely.
        random = collection.getRandom();
        assertTrue(random == 1 || random == 2);
        
        // extra testing
        assertFalse(collection.remove(3));
        assertTrue(collection.remove(1));
        random = collection.getRandom();
        assertTrue(random == 2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getRandom method, of class Solution381.
     */
    @Test
    public void testGetRandom2() {
        System.out.println("getRandom2");
        Solution381 collection = new Solution381();
        collection.insert(10);
        collection.insert(10);
        collection.insert(20);
        collection.insert(20);
        collection.insert(30);
        collection.insert(30);
        collection.remove(10);
        collection.remove(10);
        collection.remove(30);
        collection.remove(30);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        assertTrue(collection.getRandom() == 20);
        
        
    }
}
