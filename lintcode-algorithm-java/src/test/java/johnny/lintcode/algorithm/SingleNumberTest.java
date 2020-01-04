package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SingleNumberTest {
    
    public SingleNumberTest() {
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
     * Test of singleNumber method, of class SingleNumber.
     */
    @Test
    public void testSingleNumber() {
        System.out.println("singleNumber");
        int[] A = null;
        SingleNumber instance = new SingleNumber();
        int expResult = 0;
        int result = instance.singleNumber(A);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.singleNumber(new int[] {1}));
        assertEquals(0, instance.singleNumber(new int[] {1,0,1}));
        assertEquals(2, instance.singleNumber(new int[] {1,3,1,2,3}));
        assertEquals(4, instance.singleNumber(new int[] {1,2,2,1,3,4,3}));
    }
    
}
