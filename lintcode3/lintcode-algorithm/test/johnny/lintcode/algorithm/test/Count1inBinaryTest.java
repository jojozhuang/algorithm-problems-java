package johnny.lintcode.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.Count1inBinary;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Count1inBinaryTest {
    
    public Count1inBinaryTest() {
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
     * Test of countOnes method, of class Count1inBinary.
     */
    @Test
    public void testCountOnes() {
        System.out.println("countOnes");
        int num = 0;
        Count1inBinary instance = new Count1inBinary();
        int expResult = 0;
        int result = instance.countOnes(num);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.countOnes(1));
        assertEquals(1, instance.countOnes(2));
        assertEquals(2, instance.countOnes(3));
        assertEquals(1, instance.countOnes(4));
        assertEquals(2, instance.countOnes(5));
        assertEquals(2, instance.countOnes(6));
        assertEquals(3, instance.countOnes(7));
        assertEquals(1, instance.countOnes(8));
        assertEquals(2, instance.countOnes(9));
        assertEquals(2, instance.countOnes(10));
        assertEquals(3, instance.countOnes(11));
        assertEquals(2, instance.countOnes(12));
        assertEquals(3, instance.countOnes(13));
        assertEquals(3, instance.countOnes(14));
        assertEquals(4, instance.countOnes(15));
        assertEquals(1, instance.countOnes(16));
        assertEquals(5, instance.countOnes(31));
        assertEquals(1, instance.countOnes(32));
        assertEquals(6, instance.countOnes(63));
        assertEquals(1, instance.countOnes(64));
        assertEquals(7, instance.countOnes(127));
        assertEquals(1, instance.countOnes(128));
        assertEquals(8, instance.countOnes(255));
        assertEquals(1, instance.countOnes(256));
        assertEquals(9, instance.countOnes(511));
        assertEquals(1, instance.countOnes(512));
        assertEquals(10, instance.countOnes(1023));
        assertEquals(1, instance.countOnes(1024));
        assertEquals(30, instance.countOnes(Integer.MAX_VALUE - 1));
        assertEquals(31, instance.countOnes(Integer.MAX_VALUE));
        assertEquals(32, instance.countOnes(-1));
        assertEquals(31, instance.countOnes(-2));
        assertEquals(31, instance.countOnes(-3));
        assertEquals(30, instance.countOnes(-4));
    }
}
