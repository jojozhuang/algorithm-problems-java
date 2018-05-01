package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution043;

public class Solution043Test extends JunitBase {

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Solution043 instance = new Solution043();

        assertEquals(null,  instance.multiply(null, null));
        assertEquals("", instance.multiply("", ""));
        assertEquals("", instance.multiply("11", ""));
        assertEquals("0", instance.multiply("1", "0"));
        assertEquals("2", instance.multiply("1", "2"));
        assertEquals("81", instance.multiply("9", "9"));
        assertEquals("123", instance.multiply("123", "1"));
        assertEquals("456", instance.multiply("1", "456"));
        assertEquals("1230", instance.multiply("123", "10"));
        assertEquals("246", instance.multiply("123", "2"));
        assertEquals("42435", instance.multiply("123", "345"));
        assertEquals("15241578750190521", instance.multiply("123456789", "123456789"));
        assertEquals("0", instance.multiply("9133", "0"));
    }
}
