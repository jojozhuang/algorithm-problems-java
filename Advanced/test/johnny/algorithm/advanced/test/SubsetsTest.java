package johnny.algorithm.advanced.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.advanced.Subsets;
import johnny.algorithm.common.ListUtil;

public class SubsetsTest {

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

    /**
     * Test of subsetsThree method, of class Subsets.
     */
    @Test
    public void testSubsetsThree() {
        
        System.out.println("subsets");
        Subsets instance = new Subsets();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.subsetsThree(null));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{},{1}});
        assertEquals(expect2, instance.subsetsThree(new int[]{1}));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{3}});
        assertEquals(expect3, instance.subsetsThree(new int[]{1,3}));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][]{{},{1},{1,2},{1,2,3},{1,3},{2},{2,3},{3}});
        assertEquals(expect4, instance.subsetsThree(new int[]{1,2,3}));
    }
    
    /**
     * Test of subsets method, of class Subsets.
     */
    @Test
    public void testSubsets() {
        
        System.out.println("subsets");
        Subsets instance = new Subsets();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.subsets(null));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{},{1}});
        assertEquals(expect2, instance.subsets(new int[]{1}));

        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{3}});
        assertEquals(expect3, instance.subsets(new int[]{1,3}));

        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{1,3,8},{1,8},{3},{3,8},{8}});
        assertEquals(expect4, instance.subsets(new int[]{1,3,8}));

    }

}
