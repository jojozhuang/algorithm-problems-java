package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution065;

public class Solution065Test extends JunitBase {

    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        Solution065 instance = new Solution065();

        assertEquals(false, instance.isNumber(""));
        assertEquals(true, instance.isNumber("0"));
        assertEquals(true, instance.isNumber(" 0.1 "));
        assertEquals(false, instance.isNumber("abc"));
        assertEquals(false, instance.isNumber("1 a"));
        assertEquals(false, instance.isNumber("2b10"));
        assertEquals(true, instance.isNumber("023"));
        assertEquals(false, instance.isNumber("."));
        assertEquals(true, instance.isNumber(".2"));
        assertEquals(true, instance.isNumber("3."));
        assertEquals(true, instance.isNumber("3. "));
        assertEquals(false, instance.isNumber(" "));
        assertEquals(false, instance.isNumber(".."));
        assertEquals(true, instance.isNumber("2e0"));
        assertEquals(false, instance.isNumber(". 1"));
        assertEquals(true, instance.isNumber("-1."));
        assertEquals(true, instance.isNumber("+.8"));
        assertEquals(true, instance.isNumber("46.e3"));
        assertEquals(true, instance.isNumber(" 005047e+6"));
        assertEquals(false, instance.isNumber("+-."));
        assertEquals(false, instance.isNumber("4e+"));
        assertEquals(false, instance.isNumber(".-4"));
    }
}
