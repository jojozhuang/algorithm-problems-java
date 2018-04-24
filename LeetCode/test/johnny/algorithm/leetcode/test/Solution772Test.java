package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution772;

public class Solution772Test {

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
        System.out.println("calculate");
        Solution772 instance = new Solution772();

        assertEquals(2, instance.calculate("1 + 1"));
        assertEquals(4, instance.calculate(" 6-4 / 2 "));
        assertEquals(21, instance.calculate("2*(5+5*2)/3+(6/2+8)" ));
        assertEquals(-12, instance.calculate("(2+6* 3+5- (3*14/7+2)*5)+3" ));
    }

}
