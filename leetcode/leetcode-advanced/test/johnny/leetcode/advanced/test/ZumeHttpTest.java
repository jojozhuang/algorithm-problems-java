package johnny.leetcode.advanced.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.ZumeHttp;
import johnny.leetcode.advanced.common.Product;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class ZumeHttpTest {
    
    public ZumeHttpTest() {
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
    public void testHttp() {
        System.out.println("Http");
        ZumeHttp instance = new ZumeHttp();

        String response = instance.get("http://localhost:3000/products/", "");
        List<Product> list = instance.parse(response);
        for (Product p : list) {
            System.out.println(p);
        }
        
    }
}
