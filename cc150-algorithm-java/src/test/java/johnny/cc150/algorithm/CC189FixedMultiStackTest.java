package johnny.cc150.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.CC189FixedMultiStack;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class CC189FixedMultiStackTest {
    
    public CC189FixedMultiStackTest() {
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
     * Test of push method, of class CC189FixedMultiStack.
     */
    @Test
    public void testPush() throws Exception {
        System.out.println("CC189FixedMultiStack");
        CC189FixedMultiStack instance = new CC189FixedMultiStack(100);
        instance.push(0, 2);
        instance.push(1, 0);
        instance.push(2, 1);
        assertEquals(2, instance.peek(0));
        assertEquals(0, instance.peek(1));
        assertEquals(1, instance.peek(2));
        instance.push(0, 5);
        instance.push(1, 4);
        instance.push(2, 3);
        assertEquals(5, instance.pop(0));
        assertEquals(4, instance.pop(1));
        assertEquals(3, instance.pop(2));
    }
}
