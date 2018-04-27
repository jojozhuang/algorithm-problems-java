package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution677;

public class Solution677Test {

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
        System.out.println("MapSum");
        Solution677 instance = new Solution677();
        instance.insert("apple", 3);
        assertEquals(3, instance.sum("ap"));
        instance.insert("app", 2);
        assertEquals(5, instance.sum("ap"));
    }

}
