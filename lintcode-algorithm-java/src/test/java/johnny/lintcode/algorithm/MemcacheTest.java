package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemcacheTest extends JunitBase {

    @Test
    public void testMemcache() {
        System.out.println("Memcache");
        Memcache instance = new Memcache();

        assertEquals(2147483647, instance.get(1, 0));
        instance.set(2,1,1,2);
        assertEquals(1, instance.get(3, 1));
        assertEquals(2147483647, instance.get(4, 1));
        assertEquals(2147483647, instance.incr(5,1, 1));
        instance.set(6,1,3,0);
        assertEquals(4, instance.incr(7,1, 1));
        assertEquals(3, instance.decr(8,1, 1));
        assertEquals(3, instance.get(9, 1));
        instance.delete(10,1);
        assertEquals(2147483647, instance.get(11, 1));
        assertEquals(2147483647, instance.incr(12, 1, 1));
    }
    
}
