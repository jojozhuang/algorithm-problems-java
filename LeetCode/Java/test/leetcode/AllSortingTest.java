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
public class AllSortingTest {
    
    public AllSortingTest() {
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
     * Test of BubbleSort method, of class AllSorting.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] nums = null;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.BubbleSort(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.BubbleSort(new int[]{2,4,5,7,1,2,3,6}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InsertSort method, of class AllSorting.
     */
    @Test
    public void testInsertSort() {
        System.out.println("InsertSort");
        int[] nums = null;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.InsertSort(nums);
        assertArrayEquals(expResult, result);
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.InsertSort(new int[]{2,4,5,7,1,2,3,6}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MergeSort method, of class AllSorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        int[] nums = null;
        int from = 0;
        int to = 0;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.MergeSort(nums, from, to);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.MergeSort(new int[]{2,4,5,7,1,2,3,6}, 0, 7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SelectionSort method, of class AllSorting.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("SelectionSort");
        int[] nums = null;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.SelectionSort(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.SelectionSort(new int[]{2,4,5,7,1,2,3,6}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of QuickSort method, of class AllSorting.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort");
        int[] nums = null;
        int from = 0;
        int to = 0;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.QuickSort(nums, from, to);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.QuickSort(new int[]{2,4,5,7,1,2,3,6}, 0, 7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BucketSort method, of class AllSorting.
     */
    @Test
    public void testBucketSort() {
        System.out.println("BucketSort");
        int[] nums = null;
        int maxVal = 0;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.BucketSort(nums, maxVal);
        assertArrayEquals(expResult, result);
       
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, instance.BucketSort(new int[]{5,3,0,2,4,1,0,5,2,3,1,4}, 5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
