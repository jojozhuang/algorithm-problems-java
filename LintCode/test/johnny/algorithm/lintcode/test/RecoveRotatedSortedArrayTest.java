/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.RecoveRotatedSortedArray;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class RecoveRotatedSortedArrayTest {
    
    public RecoveRotatedSortedArrayTest() {
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
     * Test of recoverRotatedSortedArray method, of class RecoveRotatedSortedArray.
     */
    @Test
    public void testRecoverRotatedSortedArray() {
        System.out.println("recoverRotatedSortedArray");
        ArrayList<Integer> nums = null;
        RecoveRotatedSortedArray instance = new RecoveRotatedSortedArray();
        instance.recoverRotatedSortedArray(nums);
        
       /* nums = new ArrayList<Integer>();
        nums.add(1);
        instance.recoverRotatedSortedArray(nums);
        assertEquals(1, (int)nums.get(0));
        
        nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(1);
        instance.recoverRotatedSortedArray(nums);
        ArrayList<Integer> expect = new ArrayList<Integer>();
        expect.add(1);
        expect.add(2);
        assertArrayEquals(expect.toArray(), nums.toArray());
        
        nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        instance.recoverRotatedSortedArray(nums);
        ArrayList<Integer> expect2 = new ArrayList<Integer>();
        expect2.add(1);
        expect2.add(2);
        expect2.add(3);
        expect2.add(4);
        expect2.add(5);        
        assertArrayEquals(expect2.toArray(), nums.toArray());*/
        
        nums = new ArrayList<Integer>();
        nums.add(1);
        /*nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);*/
        nums.add(-1);
        /*nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);*/
        nums.add(1);
        nums.add(1);
        nums.add(1);
        instance.recoverRotatedSortedArray(nums);
        ArrayList<Integer> expect3 = new ArrayList<Integer>();
        expect3.add(-1);
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);     
        /*expect3.add(1);   
        expect3.add(1); 
        expect3.add(1); 
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);     
        expect3.add(1);   
        expect3.add(1); 
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);
        expect3.add(1);     
        expect3.add(1);   
        expect3.add(1); */
        assertArrayEquals(expect3.toArray(), nums.toArray());
    }
    
}
