package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ClimbingStairsIITest extends JunitBase {

    /**
     * Test of climbStairs2 method, of class ClimbingStairsII.
     */
    @Test
    public void testClimbStairs2() {
        System.out.println("climbStairs2");
        ClimbingStairsII instance = new ClimbingStairsII();
        assertEquals(1, instance.climbStairs2(0));
        assertEquals(1, instance.climbStairs2(1));
        assertEquals(2, instance.climbStairs2(2));
        assertEquals(4, instance.climbStairs2(3));
        assertEquals(7, instance.climbStairs2(4));
    }
    
}
