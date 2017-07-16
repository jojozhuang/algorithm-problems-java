/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

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
public class PartitionArrayTest {
    
    public PartitionArrayTest() {
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
     * Test of partitionArray method, of class PartitionArray.
     */
    @Test
    public void testPartitionArray() {
        System.out.println("partitionArray");
        int[] nums = null;
        int k = 0;
        PartitionArray instance = new PartitionArray();
        int expResult = 0;
        int result = instance.partitionArray(nums, k);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.partitionArray(new int[] {1,2}, 2));
        assertEquals(1, instance.partitionArray(new int[] {3,2,2,1}, 2));
        assertEquals(2, instance.partitionArray(new int[] {3,4,2,1}, 3));
        assertEquals(2, instance.partitionArray(new int[] {3,3,2,1}, 3));
        assertEquals(10, instance.partitionArray(new int[] {9,9,9,8,9,8,7,9,8,8,8,9,8,9,8,8,6,9}, 9));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
