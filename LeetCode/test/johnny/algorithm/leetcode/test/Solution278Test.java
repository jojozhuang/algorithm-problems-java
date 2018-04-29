package johnny.algorithm.leetcode.test;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution278;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution278Test {
    
    public Solution278Test() {
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
     * Test of firstBadVersion method, of class Solution278.
     */
    @Test
    public void testFirstBadVersion() {
        System.out.println("firstBadVersion");
        int n = 0;
        Solution278 instance = new Solution278();
        int expResult = 0;
        int result = instance.firstBadVersion(n);
        assertEquals(expResult, result);
        
        HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
        map1.put(1, true);
        map1.put(2, true);
        instance.setMap(map1);
        assertEquals(1, instance.firstBadVersion(2));
        
        HashMap<Integer, Boolean> map2 = new HashMap<Integer, Boolean>();
        map2.put(1, false);
        map2.put(2, true);
        instance.setMap(map2);
        assertEquals(2, instance.firstBadVersion(2));
        
        HashMap<Integer, Boolean> map3 = new HashMap<Integer, Boolean>();
        map3.put(1, false);
        map3.put(2, false);
        map3.put(3, false);
        map3.put(4, true);
        map3.put(5, true);
        map3.put(6, true);
        map3.put(7, true);
        map3.put(8, true);
        instance.setMap(map3);
        assertEquals(4, instance.firstBadVersion(8));
    }
}
