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
public class AplusBProblemTest {
    
    public AplusBProblemTest() {
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
