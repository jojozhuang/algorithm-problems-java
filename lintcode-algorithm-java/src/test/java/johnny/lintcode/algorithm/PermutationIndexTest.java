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
public class PermutationIndexTest {
    
    public PermutationIndexTest() {
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
     * Test of permutationIndex method, of class PermutationIndex.
     */
    @Test
    public void testPermutationIndex() {
        System.out.println("permutationIndex");
        int[] A = null;
        PermutationIndex instance = new PermutationIndex();
        long expResult = 0L;
        long result = instance.permutationIndex(A);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.permutationIndex(new int[]{1,2}));
        assertEquals(2, instance.permutationIndex(new int[]{2,1}));
        assertEquals(1, instance.permutationIndex(new int[]{1,2,3}));
        assertEquals(2, instance.permutationIndex(new int[]{1,3,2}));
        assertEquals(3, instance.permutationIndex(new int[]{2,1,3}));
        assertEquals(4, instance.permutationIndex(new int[]{2,3,1}));
        assertEquals(5, instance.permutationIndex(new int[]{3,1,2}));
        assertEquals(6, instance.permutationIndex(new int[]{3,2,1}));
        assertEquals(12, instance.permutationIndex(new int[]{2,4,3,1}));
        assertEquals(1263957845766L, instance.permutationIndex(new int[]{22,7,15,10,11,12,14,8,9,1,2,3,6,5,4}));
    }
}
