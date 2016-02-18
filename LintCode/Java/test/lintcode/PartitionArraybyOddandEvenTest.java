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
public class PartitionArraybyOddandEvenTest {
    
    public PartitionArraybyOddandEvenTest() {
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
     * Test of partitionArray method, of class PartitionArraybyOddandEven.
     */
    @Test
    public void testPartitionArray() {
        System.out.println("partitionArray");
        int[] nums = null;
        PartitionArraybyOddandEven instance = new PartitionArraybyOddandEven();
        instance.partitionArray(nums);
        assertEquals(null, nums);
        
        int[] nums2 = new int[]{1};
        instance.partitionArray(nums2);        
        assertArrayEquals(new int[]{1}, nums2);

        int[] nums3 = new int[]{1,2};
        instance.partitionArray(nums3);        
        assertArrayEquals(new int[]{1,2}, nums3);

        int[] nums4 = new int[]{2,1};
        instance.partitionArray(nums4);        
        assertArrayEquals(new int[]{1,2}, nums4);
        
        int[] nums5 = new int[]{1, 2, 3, 4};
        instance.partitionArray(nums5);        
        assertArrayEquals(new int[]{1, 3, 2, 4}, nums5);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
