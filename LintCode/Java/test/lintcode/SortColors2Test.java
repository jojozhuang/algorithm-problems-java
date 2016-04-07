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
 * @author RZHUANG
 */
public class SortColors2Test {
    
    public SortColors2Test() {
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
     * Test of sortColors2 method, of class SortColors2.
     */
    @Test
    public void testSortColors2() {
        System.out.println("sortColors2");
        int[] colors = null;
        int k = 0;
        SortColors2 instance = new SortColors2();
        instance.sortColors2(colors, k);
        
        int[] colors2 = new int[]{3,2,2,1,4};
        instance.sortColors2(colors2, 4);
        assertArrayEquals(new int[]{1,2,2,3,4}, colors2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
