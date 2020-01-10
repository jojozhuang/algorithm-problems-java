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
public class RotatedDigitsTest {

    public RotatedDigitsTest() {
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
     * Test of rotatedDigits method, of class RotatedDigits.
     */
    @Test
    public void testRotatedDigits() {
        System.out.println("testRotatedDigits");
        RotatedDigits instance = new RotatedDigits();

        assertEquals(4, instance.rotatedDigits(10));
        assertEquals(2, instance.rotatedDigits(5));
    }
}
