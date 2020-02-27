package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class AplusBProblemTest extends JunitBase {

    /**
     * Test of aplusb method, of class AplusBProblem.
     */
    @Test
    public void testAplusb() {
        System.out.println("aplusb");
        int a = 0;
        int b = 0;
        AplusBProblem instance = new AplusBProblem();
        int expResult = 0;
        int result = instance.aplusb(a, b);
        assertEquals(expResult, result);
        assertEquals(3, instance.aplusb(1, 2));
        assertEquals(9, instance.aplusb(4, 5));
        assertEquals(133, instance.aplusb(111, 22));
    }
    
}
