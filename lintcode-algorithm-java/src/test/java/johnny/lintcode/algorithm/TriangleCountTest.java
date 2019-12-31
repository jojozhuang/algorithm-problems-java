package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.TriangleCount;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class TriangleCountTest {
    
    public TriangleCountTest() {
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
     * Test of triangleCount method, of class TriangleCount.
     */
    @Test
    public void testTriangleCount() {
        System.out.println("triangleCount");
        int[] S = null;
        TriangleCount instance = new TriangleCount();
        int expResult = 0;
        int result = instance.triangleCount(S);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.triangleCount(new int[]{3,4,6,7}));
        assertEquals(4, instance.triangleCount(new int[]{4,4,4,4}));
    }
}
