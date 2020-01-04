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
public class UpdateBitsTest {
    
    public UpdateBitsTest() {
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
     * Test of updateBits method, of class UpdateBits.
     */
    @Test
    public void testUpdateBits() {
        System.out.println("updateBits");
        int n = 0;
        int m = 0;
        int i = 0;
        int j = 0;
        UpdateBits instance = new UpdateBits();
        int expResult = 0;
        int result = instance.updateBits(n, m, i, j);
        assertEquals(expResult, result);
        
        assertEquals(1108, instance.updateBits(1024, 21, 2, 6));
        assertEquals(331, instance.updateBits(35,41,3,9));
        assertEquals(2147483127, instance.updateBits(-521,0,31,31));
    }
}
