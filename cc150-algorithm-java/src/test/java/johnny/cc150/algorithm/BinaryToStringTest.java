package johnny.cc150.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.BinaryToString;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BinaryToStringTest {
    
    public BinaryToStringTest() {
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
     * Test of printBinary method, of class BinaryToString.
     */
    @Test
    public void testPrintBinary() {
        System.out.println("printBinary");
        double num = 0.0;
        BinaryToString instance = new BinaryToString();
        String expResult = "ERROR";
        String result = instance.printBinary(num);
        assertEquals(expResult, result);
        
        assertEquals(".1011100001010001111010111000010", instance.printBinary(0.72));
    }
    
}
