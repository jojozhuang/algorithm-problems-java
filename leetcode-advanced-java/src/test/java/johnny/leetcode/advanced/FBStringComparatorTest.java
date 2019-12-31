package johnny.leetcode.advanced;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.FBStringComparator;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class FBStringComparatorTest {
    
    public FBStringComparatorTest() {
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
     * Test of longestPalindrome method, of class LongestPalindrome.
     */
    @Test
    public void testComparator() {
        System.out.println("FBStringComparator");
        FBStringComparator comparator = new FBStringComparator();
        
        String[] list1 = new String[] {"photo1","photo10","photo2"};
        Arrays.sort(list1, comparator);
        String[] expect1 = new String[] {"photo1","photo2","photo10"};
        assertArrayEquals(expect1, list1);
    }
}
