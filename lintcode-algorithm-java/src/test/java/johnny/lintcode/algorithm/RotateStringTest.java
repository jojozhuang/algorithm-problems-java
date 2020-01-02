package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class RotateStringTest {
    
    public RotateStringTest() {
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
     * Test of rotateString method, of class RotateString.
     */
    @Test
    public void testRotateString() {
        System.out.println("rotateString");
        char[] str = null;
        int offset = 0;
        RotateString instance = new RotateString();
        instance.rotateString(str, offset);
        assertEquals(null, str);
        
        str = "1".toCharArray();
        instance.rotateString(str, -1);
        assertEquals('1', str[0]);
        
        str = "312".toCharArray();
        instance.rotateString(str, -1);
        assertEquals('3', str[0]);
        assertEquals('1', str[1]);
        assertEquals('2', str[2]);
        
        str = "312".toCharArray();
        instance.rotateString(str, 0);
        assertEquals('3', str[0]);
        assertEquals('1', str[1]);
        assertEquals('2', str[2]);
        
        str = "312".toCharArray();
        instance.rotateString(str, 1);
        assertEquals('2', str[0]);
        assertEquals('3', str[1]);
        assertEquals('1', str[2]);
        
        str = "312".toCharArray();
        instance.rotateString(str, 2);
        assertEquals('1', str[0]);
        assertEquals('2', str[1]);
        assertEquals('3', str[2]);
        
        str = "312".toCharArray();
        instance.rotateString(str, 3);
        assertEquals('3', str[0]);
        assertEquals('1', str[1]);
        assertEquals('2', str[2]);
        
        str = "abcdefg".toCharArray();
        instance.rotateString(str, 0);
        assertEquals("abcdefg", String.valueOf(str));
        
        str = "abcdefg".toCharArray();
        instance.rotateString(str, 1);
        assertEquals("gabcdef", String.valueOf(str));
        
        str = "abcdefg".toCharArray();
        instance.rotateString(str, 2);
        assertEquals("fgabcde", String.valueOf(str));
        
        str = "abcdefg".toCharArray();
        instance.rotateString(str, 3);
        assertEquals("efgabcd", String.valueOf(str));
        
        str = "cppjavapy".toCharArray();
        instance.rotateString(str, 25);
        assertEquals("pjavapycp", String.valueOf(str));
    }
}
