package johnny.cc150.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.BaseConvertor;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BaseConvertorTest {
    
    public BaseConvertorTest() {
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
     * Test of convertFromBase method, of class BaseConvertor.
     */
    @Test
    public void testConvertFromBase() {
        System.out.println("convertFromBase");
        String str = "";
        int base = 0;
        BaseConvertor instance = new BaseConvertor();
        int expResult = -1;
        int result = instance.convertFromBase(str, base);
        assertEquals(expResult, result);
        
        assertEquals(7, instance.convertFromBase("111", 2));
        assertEquals(11, instance.convertFromBase("1011", 2));
        assertEquals(10, instance.convertFromBase("A", 16));
        assertEquals(26, instance.convertFromBase("1A", 16));
    }
    
}
