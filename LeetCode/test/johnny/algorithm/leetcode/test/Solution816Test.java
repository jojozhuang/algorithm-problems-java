package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution816;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution816Test {

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
        System.out.println("ambiguousCoordinates");
        
        Solution816 instance = new Solution816();
        
        List<String> coordinates1 = ListUtil.buildList(new String[]{"(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"});
        List<String> result1 = instance.ambiguousCoordinates("(123)");
        assertTrue(ListUtil.equalsIgnoreOrder(coordinates1, result1));
        
        List<String> coordinates2 = ListUtil.buildList(new String[]{"(0.001, 1)", "(0, 0.011)"});
        List<String> result2 = instance.ambiguousCoordinates("(00011)");
        assertTrue(ListUtil.equalsIgnoreOrder(coordinates2, result2));
        
        List<String> coordinates3 = ListUtil.buildList(new String[]{"(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"});
        List<String> result3 = instance.ambiguousCoordinates("(0123)");
        assertTrue(ListUtil.equalsIgnoreOrder(coordinates3, result3));
        
        List<String> coordinates4 = ListUtil.buildList(new String[]{"(10, 0)"});
        List<String> result4 = instance.ambiguousCoordinates("(100)");
        assertTrue(ListUtil.equalsIgnoreOrder(coordinates4, result4));
    }

}
