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
public class ReverseIntegerTest {

    public ReverseIntegerTest() {
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
     * Test of reverseInteger method, of class ReverseInteger.
     */
    @Test
    public void testReverseInteger() {
        System.out.println("ReverseInteger");
        ReverseInteger instance = new ReverseInteger();

        assertEquals(321, instance.reverseInteger(123));
        assertEquals(-321, instance.reverseInteger(-123));

    }
}
