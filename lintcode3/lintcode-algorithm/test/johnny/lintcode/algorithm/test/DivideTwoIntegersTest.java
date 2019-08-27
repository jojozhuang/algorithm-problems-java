package johnny.lintcode.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.DivideTwoIntegers;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class DivideTwoIntegersTest {
    
    public DivideTwoIntegersTest() {
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
     * Test of divide method, of class DivideTwoIntegers.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int dividend = 0;
        int divisor = 0;
        DivideTwoIntegers instance = new DivideTwoIntegers();
        int expResult = 0;
        int result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
        
        /*assertEquals(3, instance.divide(10, 3));
        assertEquals(2147483647, instance.divide(-2147483648, -1));
        assertEquals(-1, instance.divide(-1, 1));
        assertEquals(-2147483648, instance.divide(-2147483648, 1));
        assertEquals(1073741823, instance.divide(2147483647, 2));*/
        assertEquals(-1073741824, instance.divide(-2147483648, 2));
    }
}
