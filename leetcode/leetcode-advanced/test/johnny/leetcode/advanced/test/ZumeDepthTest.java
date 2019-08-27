package johnny.leetcode.advanced.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.ZumeDepth;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class ZumeDepthTest {
    
    public ZumeDepthTest() {
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
     * Test of drop method, of class Zume.
     */
    @Test
    public void testRainDropWithDepth() {
        System.out.println("RainDropWithDepth");
        int[][] grid = new int[][] {
            {-1,-3,0,-4},
            {-2,0,-1,-3},
            {-5,-4,0,-1},
            {0,-2,-1,-1},
        };
        ZumeDepth instance = new ZumeDepth(grid);

        for (int i = 0; i < instance.total; i++) {
            instance.drop();
        }
        
        for (int[] line : instance.print) {
            System.out.println(Arrays.toString(line));
        }
        
    }
}
