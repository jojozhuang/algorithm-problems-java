/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.advanced.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.advanced.FBStringComparator;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class FBStringComparatorTest {
    
    public FBStringComparatorTest() {
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
     * Test of longestPalindrome method, of class LongestPalindrome.
     */
    @Test
    public void testComparator() {
        System.out.println("FBStringComparator");
        String s = "";
        FBStringComparator comparator = new FBStringComparator();
        
        String[] list1 = new String[] {"photo1","photo10","photo2"};
        Arrays.sort(list1, comparator);
        String[] expect1 = new String[] {"photo1","photo2","photo10"};
        assertArrayEquals(expect1, list1);
    }
}
