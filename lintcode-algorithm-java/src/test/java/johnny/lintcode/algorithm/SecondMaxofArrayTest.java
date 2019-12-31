package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.SecondMaxofArray;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SecondMaxofArrayTest {
    
    public SecondMaxofArrayTest() {
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
     * Test of secondMax method, of class SecondMaxofArray.
     */
    @Test
    public void testSecondMax() {
        System.out.println("secondMax");
        SecondMaxofArray instance = new SecondMaxofArray();
        
        assertEquals(Integer.MIN_VALUE, instance.secondMax(null));
        assertEquals(1, instance.secondMax(new int[]{1}));
        assertEquals(3, instance.secondMax(new int[]{1,3,2,4}));
        assertEquals(1, instance.secondMax(new int[]{1,2}));
    }
}
