package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution736;

public class Solution736Test {

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
        System.out.println("evaluate");
        Solution736 instance = new Solution736();

        assertEquals(3, instance.evaluate("(add 1 2)"));
        assertEquals(15, instance.evaluate("(mult 3 (add 2 3))"));
        assertEquals(10, instance.evaluate("(let x 2 (mult x 5))"));
        assertEquals(14, instance.evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))"));
        assertEquals(2, instance.evaluate("(let x 3 x 2 x)"));
        assertEquals(5, instance.evaluate("(let x 1 y 2 x (add x y) (add x y))"));
        assertEquals(6, instance.evaluate("(let x 2 (add (let x 3 (let x 4 x)) x))"));
        assertEquals(4, instance.evaluate("(let a1 3 b2 (add a1 1) b2)"));
    }

}
