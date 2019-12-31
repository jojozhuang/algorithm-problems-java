package johnny.cc150.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.RandomIntegerFromArray;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class RandomIntegerFromArrayTest {
    
    public RandomIntegerFromArrayTest() {
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
     * Test of pickMRandomly method, of class RandomIntegerFromArray.
     */
    @Test
    public void testPickMRandomly() {
        System.out.println("pickMRandomly");
        int[] original = null;
        int m = 0;
        RandomIntegerFromArray instance = new RandomIntegerFromArray();
        int[] expResult = null;
        int[] result = instance.pickMRandomly(original, m);
        assertArrayEquals(expResult, result);
        
        int[] original2 = new int[]{1,3,4,2,6,5};
        int[] result2 = instance.pickMRandomly(original2, 3);
        assertEquals(3, result2.length);
        for (int i = 0; i < result2.length; i++) {
            assertTrue(result2[i] >=1 && result2[i] <= 6);
        }
    }
}
