package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution412;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution412Test {
    
    public Solution412Test() {
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
     * Test of fizzBuzz method, of class Solution412.
     */
    @Test
    public void testFizzBuzz() {
        System.out.println("fizzBuzz");
        Solution412 instance = new Solution412();
        
        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.fizzBuzz(0));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"1"});
        assertEquals(expect2, instance.fizzBuzz(1));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"1","2","Fizz","4","Buzz"});
        assertEquals(expect3, instance.fizzBuzz(5));
        
        List<String> expect4 = ListUtil.buildList(new String[] {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"});
        assertEquals(expect4, instance.fizzBuzz(15));
    }
}
