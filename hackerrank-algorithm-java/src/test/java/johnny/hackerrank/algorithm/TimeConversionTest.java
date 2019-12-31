package johnny.hackerrank.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.TimeConversion;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class TimeConversionTest {
    
    public TimeConversionTest() {
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
     * Test of convertTime method, of class TimeConversion.
     */
    @Test
    public void testConvertTime() {
        System.out.println("convertTime");
        String time = "";
        String expResult = "";
        String result = TimeConversion.convertTime(time);
        assertEquals(expResult, result);
        
        assertEquals("00:00:00", TimeConversion.convertTime("12:00:00AM"));
        assertEquals("00:03:20", TimeConversion.convertTime("0:03:20AM"));
        assertEquals("00:03:20", TimeConversion.convertTime("00:03:20AM"));
        assertEquals("01:03:20", TimeConversion.convertTime("01:03:20AM"));
        assertEquals("06:15:23", TimeConversion.convertTime("6:15:23AM"));
        assertEquals("06:15:23", TimeConversion.convertTime("06:15:23AM"));
        assertEquals("10:15:23", TimeConversion.convertTime("10:15:23AM"));
        assertEquals("11:59:59", TimeConversion.convertTime("11:59:59AM"));
        assertEquals("12:00:00", TimeConversion.convertTime("12:00:00PM"));
        assertEquals("12:03:01", TimeConversion.convertTime("12:03:01PM"));
        assertEquals("12:59:59", TimeConversion.convertTime("12:59:59PM"));
        assertEquals("12:05:01", TimeConversion.convertTime("12:05:01PM"));
        assertEquals("13:02:03", TimeConversion.convertTime("01:02:03PM"));
        assertEquals("19:02:03", TimeConversion.convertTime("7:02:03PM"));
        assertEquals("23:59:59", TimeConversion.convertTime("11:59:59PM"));
        assertEquals("13:02:00", TimeConversion.convertTime("1:02:00PM"));
        assertEquals("00:40:22", TimeConversion.convertTime("12:40:22AM"));
    }
}
