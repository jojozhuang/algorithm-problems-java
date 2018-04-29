package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution010;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution010Test {
    
    public Solution010Test() {
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
     * Test of isMatch method, of class Solution010.
     */
    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        Solution010 instance = new Solution010();

        assertEquals(true, instance.isMatch("", ""));
        assertEquals(false, instance.isMatch("aa","a"));
        assertEquals(true, instance.isMatch("aa","aa"));
        assertEquals(false, instance.isMatch("aaa","aa"));
        assertEquals(true, instance.isMatch("aa","a*"));
        assertEquals(true, instance.isMatch("aa",".*"));
        assertEquals(true, instance.isMatch("ab",".*"));
        assertEquals(true, instance.isMatch("aab","c*a*b"));
        assertEquals(true, instance.isMatch("aaa","ab*ac*a"));
        assertEquals(false, instance.isMatch("abcd","d*"));
        assertEquals(false, instance.isMatch("mississippi","mis*is*p*."));
        assertEquals(true, instance.isMatch("missispppppppi","mis*is*p*."));
        assertEquals(true, instance.isMatch("missssssssispppppppi","mis*is*p*."));
    }
    
}
