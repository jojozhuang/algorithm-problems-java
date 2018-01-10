package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution385;
import johnny.algorithm.leetcode.common.NestedInteger;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution385Test {
    
    public Solution385Test() {
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
     * Test of deserialize method, of class Solution385.
     */
    @Test
    public void testDeserialize() {
        System.out.println("deserialize");
        String s = "";
        Solution385 instance = new Solution385();
        NestedInteger expResult = null;
        NestedInteger result = instance.deserialize(s);
        assertEquals(expResult, result);
        
        NestedInteger expect2 = new NestedInteger(234);
        NestedInteger result2 = instance.deserialize("234");
        assertTrue(NestedInteger.isSame(expect2, result2));
        
        NestedInteger expect3 = new NestedInteger();
        expect3.list.add(new NestedInteger(123));
        expect3.list.add(new NestedInteger());
        expect3.list.get(1).list.add(new NestedInteger(456));
        expect3.list.get(1).list.add(new NestedInteger());
        expect3.list.get(1).list.get(1).list.add(new NestedInteger(789));
        NestedInteger result3 = instance.deserialize("[123,[456,[789]]]");
        assertTrue(NestedInteger.isSame(expect3, result3));
        
        NestedInteger expect4 = new NestedInteger();
        expect4.list.add(new NestedInteger());
        NestedInteger result4 = instance.deserialize("[[]]");
        assertTrue(NestedInteger.isSame(expect4, result4));
        
        NestedInteger expect5 = new NestedInteger();
        expect5.list.add(new NestedInteger());
        expect5.list.get(0).add(new NestedInteger(0));
        NestedInteger result5 = instance.deserialize("[[0]]");
        assertTrue(NestedInteger.isSame(expect5, result5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
