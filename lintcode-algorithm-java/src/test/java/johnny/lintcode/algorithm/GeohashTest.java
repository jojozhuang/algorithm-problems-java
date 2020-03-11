package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class GeohashTest extends JunitBase {

    /**
     * Test of backPack method, of class Backpack.
     */
    @Test
    public void testBackPack() {
        System.out.println("backPack");
        Geohash instance = new Geohash();

        assertEquals("wx4g0s8q3jf9", instance.encode(39.92816697, 116.38954991, 12));
        assertEquals("pbpbpbpbpbpb", instance.encode(-90, 180, 12));

    }
    
}
