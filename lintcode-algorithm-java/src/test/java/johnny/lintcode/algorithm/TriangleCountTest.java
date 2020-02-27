package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class TriangleCountTest extends JunitBase {

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
