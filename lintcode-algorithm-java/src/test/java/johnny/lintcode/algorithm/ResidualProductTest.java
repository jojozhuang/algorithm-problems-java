package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ResidualProductTest extends JunitBase {

    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        ResidualProduct instance = new ResidualProduct();

        //assertArrayEquals(new int[]{}, instance.getProduct(null));


        assertArrayEquals(new int[]{1,0}, instance.getProduct(new int[]{0,1}));
        assertArrayEquals(new int[]{0}, instance.getProduct(new int[]{0}));
        assertArrayEquals(new int[]{12,8,6,24}, instance.getProduct(new int[]{2,3,4,1}));
        assertArrayEquals(new int[]{2,1}, instance.getProduct(new int[]{1,2}));
        assertArrayEquals(new int[]{0}, instance.getProduct(new int[]{1}));
        assertArrayEquals(new int[]{362880,0,0,0,0,0,0,0,0,0}, instance.getProduct(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }
}
