package johnny.lintcode.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.UglyNumber2;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class UglyNumber2Test {
    
    public UglyNumber2Test() {
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
     * Test of nthUglyNumber method, of class UglyNumber2.
     */
    @Test
    public void testNthUglyNumber() {
        System.out.println("nthUglyNumber");
        int n = 0;
        UglyNumber2 instance = new UglyNumber2();
        int expResult = 1;
        int result = instance.nthUglyNumber(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.nthUglyNumber(1));
        assertEquals(2, instance.nthUglyNumber(2));
        assertEquals(5, instance.nthUglyNumber(5));
        assertEquals(10, instance.nthUglyNumber(9));
        assertEquals(150, instance.nthUglyNumber(41));
    }
}
