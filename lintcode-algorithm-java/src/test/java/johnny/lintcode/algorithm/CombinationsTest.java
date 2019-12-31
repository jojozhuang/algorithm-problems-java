package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.Combinations;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class CombinationsTest {
    
    public CombinationsTest() {
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
     * Test of combine method, of class Combinations.
     */
    @Test
    public void testCombine() {
        System.out.println("combine");
        int n = 0;
        int k = 0;
        Combinations instance = new Combinations();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.combine(n, k);
        assertEquals(expResult, result);
        
        List<Integer> list41 = new ArrayList<Integer>();
        list41.add(1);
        list41.add(2);       
        List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        expResult4.add(list41);
        assertEquals(expResult4,  instance.combine(2, 2));
    }
}
