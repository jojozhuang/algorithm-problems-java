package johnny.lintcode.algorithm;

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
public class FibonacciTest {
    
    public FibonacciTest() {
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
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int n = 1;
        Fibonacci instance = new Fibonacci();
        int expResult = 0;
        int result = instance.fibonacci(n);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.fibonacci(1));
        assertEquals(1, instance.fibonacci(2));
        assertEquals(1, instance.fibonacci(3));
        assertEquals(2, instance.fibonacci(4));
        assertEquals(3, instance.fibonacci(5));
        assertEquals(5, instance.fibonacci(6));
        assertEquals(8, instance.fibonacci(7));
        assertEquals(13, instance.fibonacci(8));
        assertEquals(21, instance.fibonacci(9));
        assertEquals(34, instance.fibonacci(10));
    }
}
