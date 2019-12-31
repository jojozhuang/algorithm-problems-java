package johnny.leetcode.advanced;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.Zume;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class ZumeTest {
    
    public ZumeTest() {
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
    public void testRainDrop() {
        System.out.println("RainDrop");
        Zume instance = new Zume(4, 4);

        for (int i = 0; i < instance.grid.length * instance.grid[0].length; i++) {
            instance.drop();
        }
        
        for (int[] line : instance.grid) {
            System.out.println(Arrays.toString(line));
        }
        
    }
}
