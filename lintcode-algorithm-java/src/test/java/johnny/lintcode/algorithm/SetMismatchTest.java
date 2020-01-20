package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SetMismatchTest {

    public SetMismatchTest() {
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
     * Test of replaceBlank method, of class SpaceReplacement.
     */
    @Test
    public void findErrorNums() {
        System.out.println("findErrorNums");
        SetMismatch instance = new SetMismatch();

        int[] result1 = instance.findErrorNums(new int[]{1,2,2,4});
        assertArrayEquals(new int[]{2, 3}, result1);

        int[] result2 = instance.findErrorNums(new int[]{1,3,3,4});
        assertArrayEquals(new int[]{3, 2}, result2);

        int[] result3 = instance.findErrorNums(new int[]{3,2,3,4,6,5});
        assertArrayEquals(new int[]{3, 1}, result3);
    }
}
