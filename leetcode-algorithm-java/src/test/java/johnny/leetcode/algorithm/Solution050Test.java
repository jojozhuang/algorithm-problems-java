package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution050Test extends JunitBase {

    @Test
    public void testPow() {
        System.out.println("pow");
        Solution050 instance = new Solution050();
        double delta = 0.00001;

        assertEquals(0, instance.myPow(0.0, 0), delta);
        assertEquals(1, instance.myPow(1, 0), 0.0);
        assertEquals(0, instance.myPow(0, 2323), 0.0);
        assertEquals(3.0, instance.myPow(3.0, 1), delta);
        assertEquals(4.0, instance.myPow(2.0, 2), delta);
        assertEquals(1024.0, instance.myPow(2.0, 10), delta);
        assertEquals(128.0, instance.myPow(2.0, 7), delta);
        assertEquals(-1, instance.myPow(-1, 1), delta);
        assertEquals(9, instance.myPow(-3, 2), delta);
        assertEquals(-27, instance.myPow(-3, 3), delta);
        assertEquals(815730721, instance.myPow(13, 8), delta);
        assertEquals(867302034.69006241, instance.myPow(13.1, 8), delta);
        assertEquals(1053516680.9040651066863722160949, instance.myPow(13.4224, 8), delta);
        assertEquals(0.0, instance.myPow(0.00001, 2147483647), delta);
        assertEquals(1, instance.myPow(1, 2147483647), delta);
        assertEquals(-1, instance.myPow(-1, 2147483647), delta);
        assertEquals(1, instance.myPow(-1, 2147483646), delta);
        assertEquals(0.00003, instance.myPow(34.00515, -3), delta);
    }
}
