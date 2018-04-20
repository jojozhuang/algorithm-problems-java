package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution726;

public class Solution726Test {

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
        System.out.println("countOfAtoms");
        Solution726 instance = new Solution726();

        assertEquals("H2O", instance.countOfAtoms("H2O"));
        assertEquals("H2MgO2", instance.countOfAtoms("Mg(OH)2"));
        assertEquals("K4N2O14S4", instance.countOfAtoms("K4(ON(SO3)2)2"));
    }

}
