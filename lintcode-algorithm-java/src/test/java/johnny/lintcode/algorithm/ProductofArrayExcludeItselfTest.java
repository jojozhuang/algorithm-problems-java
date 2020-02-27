package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ProductofArrayExcludeItselfTest extends JunitBase {

    /**
     * Test of productExcludeItself method, of class ProductofArrayExcludeItself.
     */
    @Test
    public void testProductExcludeItself() {
        System.out.println("productExcludeItself");
        ProductofArrayExcludeItself instance = new ProductofArrayExcludeItself();

        assertEquals(null, instance.productExcludeItself(null));
        
        List<Integer> A2 = ListUtil.buildList(new Integer[]{1,2,3});
        List<Long> expect2 = ListUtil.buildList(new Long[]{6L,3L,2L});
        assertEquals(expect2, instance.productExcludeItself(A2));

        List<Integer> A3 = ListUtil.buildList(new Integer[]{1,2});
        List<Long> expect3 = ListUtil.buildList(new Long[]{2L,1L});
        assertEquals(expect3, instance.productExcludeItself(A3));
    }
}
