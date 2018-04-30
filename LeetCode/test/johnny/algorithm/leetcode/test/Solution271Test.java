package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution271;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution271Test {
    
    public Solution271Test() {
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
     * Test of encode method, of class Solution271.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        Solution271 instance = new Solution271();

        assertEquals("", instance.encode(null));
        
        List<String> strs2 = ListUtil.buildList(new String[] {"hello","world","!"});
        assertEquals("5#hello5#world1#!", instance.encode(strs2));
    }

    /**
     * Test of decode method, of class Solution271.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        Solution271 instance = new Solution271();
        
        List<String> expect1 = new ArrayList<String>(); 
        assertEquals(expect1, instance.decode(""));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"hello","world","!"});
        assertEquals(expect2, instance.decode("5#hello5#world1#!"));
    }
}
