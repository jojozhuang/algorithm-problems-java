package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution744;

public class Solution744Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("nextGreatestLetter");
        
        Solution744 instance = new Solution744();
        assertEquals('a', instance.nextGreatestLetter(new char[] {}, 'a'));
        assertEquals('j', instance.nextGreatestLetter(new char[] {'j'}, 'a'));
        assertEquals('c', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'));
        assertEquals('f', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'));
        assertEquals('f', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'));
        assertEquals('j', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'g'));
        assertEquals('c', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'j'));
        assertEquals('c', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'k'));
    }

}
