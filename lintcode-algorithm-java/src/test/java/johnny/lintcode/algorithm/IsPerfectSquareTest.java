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
public class IsPerfectSquareTest {

    public IsPerfectSquareTest() {
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
     * Test of isPerfectSquare method, of class IsPerfectSquare.
     */
    @Test
    public void testIsPerfectSquare() {
        System.out.println("testIsPerfectSquare");

        IsPerfectSquare instance = new IsPerfectSquare();
        assertEquals(true, instance.isPerfectSquare(16));
        assertEquals(false, instance.isPerfectSquare(15));
        assertEquals(true, instance.isPerfectSquare(1));
        assertEquals(true, instance.isPerfectSquare(100));
        assertEquals(false, instance.isPerfectSquare(1000));
        assertEquals(true, instance.isPerfectSquare(1000000));
    }
}
