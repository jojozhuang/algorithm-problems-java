/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

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
public class CavityMapTest {
    
    public CavityMapTest() {
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
     * Test of findCavity method, of class CavityMap.
     */
    @Test
    public void testFindCavity() {
        System.out.println("findCavity");
        String[] grid = null;
        String[] expResult = null;
        String[] result = CavityMap.findCavity(grid);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new String[] {"1112", "1X12", "18X2", "1234"}, CavityMap.findCavity(new String[] {"1112", "1912", "1892", "1234"}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
