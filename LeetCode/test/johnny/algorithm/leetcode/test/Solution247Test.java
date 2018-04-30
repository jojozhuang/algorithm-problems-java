package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution247;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution247Test {
    
    public Solution247Test() {
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
     * Test of findStrobogrammatic method, of class Solution247.
     */
    @Test
    public void testFindStrobogrammatic() {
        System.out.println("findStrobogrammatic");
        Solution247 instance = new Solution247();
        
        List<String> expect1 = ListUtil.buildList(new String[] {""});
        List<String> result = instance.findStrobogrammatic(0);
        assertEquals(expect1, result);
        
        List<String> expect2 = new ArrayList<String>(Arrays.asList("0", "1","8"));
        assertEquals(expect2, instance.findStrobogrammatic(1));
        
        List<String> expect3 = new ArrayList<String>(Arrays.asList("11", "69","88", "96"));
        assertEquals(expect3, instance.findStrobogrammatic(2));
        
        List<String> expect4 = new ArrayList<String>(Arrays.asList("101", "609","808", "906","111", "619","818", "916", "181", "689","888", "986"));
        assertEquals(expect4, instance.findStrobogrammatic(3));
        
        List<String> expect5 = new ArrayList<String>(Arrays.asList("1001", "6009","8008", "9006","1111", "6119","8118", "9116","1691", "6699","8698", "9696","1881", "6889","8888", "9886","1961", "6969","8968", "9966"));
        assertEquals(expect5, instance.findStrobogrammatic(4));
    }
}
