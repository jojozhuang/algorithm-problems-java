package johnny.lintcode.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.SpaceReplacement;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SpaceReplacementTest {
    
    public SpaceReplacementTest() {
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
    public void testReplaceBlank() {
        System.out.println("replaceBlank");
        char[] string = null;
        int length = 0;
        SpaceReplacement instance = new SpaceReplacement();
        int expResult = 0;
        int result = instance.replaceBlank(string, length);
        assertEquals(expResult, result);
        
        String original3 = "ab ";
        char[] expect3 = original3.replace(" ", "%20").toCharArray();
        char[] string3 = copy(original3.toCharArray(), 3, 5);
        assertEquals(5, instance.replaceBlank(string3, 3));
        assertArrayEquals(expect3, string3);

        String original4 = "Mr John Smith";
        char[] expect4 = original4.replace(" ", "%20").toCharArray();
        char[] string4 = copy(original4.toCharArray(), 13, 17);
        assertEquals(17, instance.replaceBlank(string4, 13));
        assertArrayEquals(expect4, string4);
    }

    private char[] copy(char[] arr1, int len1, int len2) {
        char[] res = new char[len2];
        for (int i = 0; i < len1; i++) {
            res[i] = arr1[i];
        }

        return res;
    }
}
