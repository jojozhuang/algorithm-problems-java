package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution535;

public class Solution535Test {

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
        System.out.println("encode");
        Solution535 instance = new Solution535();
        
        String url1 = "https://leetcode.com/problems/design-tinyurl";
        assertEquals(url1, instance.decode(instance.encode(url1)));
        
        String url2 = "https://www.google.com";
        assertEquals(url2, instance.decode(instance.encode(url2)));
        
        String url3 = "http://jojozhuang.github.io/";
        assertEquals(url3, instance.decode(instance.encode(url3)));
    }
}
