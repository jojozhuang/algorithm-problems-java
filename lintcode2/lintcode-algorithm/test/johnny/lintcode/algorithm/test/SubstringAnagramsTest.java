package johnny.lintcode.algorithm.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.SubstringAnagrams;
import johnny.lintcode.algorithm.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SubstringAnagramsTest {
    
    public SubstringAnagramsTest() {
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
     * Test of findAnagrams method, of class SubstringAnagrams.
     */
    @Test
    public void testFindAnagrams() {
        System.out.println("findAnagrams");
        SubstringAnagrams instance = new SubstringAnagrams();
        List<Integer> expResult = new ArrayList<Integer>();
        assertEquals(expResult, instance.findAnagrams("ab", ""));
        
        assertEquals(ListUtil.buildIntegerList(new Integer[]{0}), instance.findAnagrams("ab", "ab"));
        assertEquals(ListUtil.buildIntegerList(new Integer[]{2}), instance.findAnagrams("acba", "ab"));
        assertEquals(ListUtil.buildIntegerList(new Integer[]{2,3,4,5}), instance.findAnagrams("abdededf", "de"));
        assertEquals(ListUtil.buildIntegerList(new Integer[]{0,6}), instance.findAnagrams("cbaebabacd", "abc"));
    }
}
