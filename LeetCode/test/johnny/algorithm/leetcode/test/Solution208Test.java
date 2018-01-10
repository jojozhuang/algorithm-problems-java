package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution208;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution208Test {
    
    public Solution208Test() {
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
     * Test of insert method, of class Solution208.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String word = "";
        Solution208 instance = new Solution208();
        instance.insert(word);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Solution208.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Solution208 instance = new Solution208();
        instance.insert("dot");
        instance.insert("dog");
        instance.insert("fat");
        instance.insert("full");
        instance.insert("apple");
        assertEquals(true, instance.search("fat"));
        assertEquals(false, instance.search("fit"));
        assertEquals(true, instance.search("dog"));
        assertEquals(false, instance.search("tog"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of startsWith method, of class Solution208.
     */
    @Test
    public void testStartsWith() {
        System.out.println("startsWith");
        Solution208 instance = new Solution208();
        instance.insert("dot");
        instance.insert("dog");
        instance.insert("fat");
        instance.insert("full");
        instance.insert("apple");
        assertEquals(true, instance.startsWith("do"));
        assertEquals(false, instance.startsWith("dow"));
        assertEquals(true, instance.startsWith("f"));
        assertEquals(false, instance.startsWith("ac"));
        assertEquals(false, instance.startsWith("apq"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
