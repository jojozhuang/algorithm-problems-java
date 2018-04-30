package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution093;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution093Test {
    
    public Solution093Test() {
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
     * Test of restoreIpAddresses method, of class Solution093.
     */
    @Test
    public void testRestoreIpAddresses() {
        System.out.println("restoreIpAddresses");
        Solution093 instance = new Solution093();

        List<String> expect1 = ListUtil.buildList(new String[] {});
        assertEquals(expect1, instance.restoreIpAddresses(""));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"255.255.11.135","255.255.111.35"});
        assertEquals(expect2, instance.restoreIpAddresses("25525511135"));
    }
}
