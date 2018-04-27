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

import johnny.algorithm.lintcode.BuildingOutline;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BuildingOutlineTest {
    
    public BuildingOutlineTest() {
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
     * Test of buildingOutline method, of class BuildingOutline.
     */
    @Test
    public void testBuildingOutline() {
        System.out.println("buildingOutline");
        int[][] buildings = null;
        BuildingOutline instance = new BuildingOutline();
        ArrayList<ArrayList<Integer>> expResult = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = instance.buildingOutline(buildings);
        assertEquals(expResult, result);
        
        int[][] buildings2 = new int[][] {
            {2, 9, 10},
            {3, 7, 15}, 
            {5, 12, 12}, 
            {15, 20, 10}, 
            {19, 24, 8}
        };
        ArrayList<ArrayList<Integer>> expResult2 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list21 = new ArrayList<Integer>();
        list21.add(2);
        list21.add(3);
        list21.add(10);
        expResult2.add(list21);
        ArrayList<Integer> list22 = new ArrayList<Integer>();
        list22.add(3);
        list22.add(7);
        list22.add(15);
        expResult2.add(list22);
        ArrayList<Integer> list23 = new ArrayList<Integer>();
        list23.add(7);
        list23.add(12);
        list23.add(12);
        expResult2.add(list23);
        ArrayList<Integer> list24 = new ArrayList<Integer>();
        list24.add(15);
        list24.add(20);
        list24.add(10);
        expResult2.add(list24);
        ArrayList<Integer> list25 = new ArrayList<Integer>();
        list25.add(20);
        list25.add(24);
        list25.add(8);
        expResult2.add(list25);
        ArrayList<ArrayList<Integer>> result2 = instance.buildingOutline(buildings2);
        assertEquals(expResult2.size(), result2.size());
        assertTrue(expResult2.containsAll(result2));
                
        int[][] buildings3 = new int[][] {
            {0,2, 3},
            {2, 5, 3}
        };
        ArrayList<ArrayList<Integer>> expResult3 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list31 = new ArrayList<Integer>();
        list31.add(0);
        list31.add(5);
        list31.add(3);
        expResult3.add(list31);
        ArrayList<ArrayList<Integer>> result3 = instance.buildingOutline(buildings3);
        assertEquals(expResult3.size(), result3.size());
        assertTrue(expResult3.containsAll(result3));
        
        int[][] buildings4 = new int[][] {
            {1, 2, 1},
            {1, 2, 2},
            {1, 2, 3}
        };
        ArrayList<ArrayList<Integer>> expResult4 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list41 = new ArrayList<Integer>();
        list41.add(1);
        list41.add(2);
        list41.add(3);
        expResult4.add(list41);
        ArrayList<ArrayList<Integer>> result4 = instance.buildingOutline(buildings4);
        assertEquals(expResult4.size(), result4.size());
        assertTrue(expResult4.containsAll(result4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
