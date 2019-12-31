package johnny.lintcode.algorithm;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.ProductofArrayExcludeItself;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class ProductofArrayExcludeItselfTest {
    
    public ProductofArrayExcludeItselfTest() {
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
     * Test of productExcludeItself method, of class ProductofArrayExcludeItself.
     */
    @Test
    public void testProductExcludeItself() {
        System.out.println("productExcludeItself");
        ArrayList<Integer> A = null;
        ProductofArrayExcludeItself instance = new ProductofArrayExcludeItself();
        ArrayList<Long> expResult = null;
        ArrayList<Long> result = instance.productExcludeItself(A);
        assertEquals(expResult, result);
        
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        A2.add(1);
        A2.add(2);
        A2.add(3);
        ArrayList<Long> expResult2 = new ArrayList<Long>();
        expResult2.add((long)6);
        expResult2.add((long)3);
        expResult2.add((long)2);
        assertEquals(expResult2, instance.productExcludeItself(A2));
        
        ArrayList<Integer> A3 = new ArrayList<Integer>();
        A3.add(1);
        A3.add(2);
        ArrayList<Long> expResult3 = new ArrayList<Long>();
        expResult3.add((long)2);
        expResult3.add((long)1);
        assertEquals(expResult3, instance.productExcludeItself(A3));
    }
}
