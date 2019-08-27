package johnny.cc150.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.BitInsertion;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BitInsertionTest {
    
    public BitInsertionTest() {
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
     * Test of insert method, of class BitInsertion.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int n = 0;
        int m = 0;
        int i = 0;
        int j = 0;
        BitInsertion instance = new BitInsertion();
        int expResult = 0;
        int result = instance.insert(n, m, i, j);
        assertEquals(expResult, result);
        
        assertEquals(1100, instance.insert(1024, 19, 2, 6));
    }
    
}
