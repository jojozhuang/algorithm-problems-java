package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution006Test extends JunitBase {

    @Test
    public void testConvert() {
        System.out.println("convert");
        Solution006 instance = new Solution006();

        assertEquals("", instance.convert("", 0));
        assertEquals("", instance.convert(null, 0));
        assertEquals("A", instance.convert("A", 0));
        assertEquals("AB", instance.convert("AB", -1));
        assertEquals("ABC", instance.convert("ABC", 1));
        assertEquals("ACB", instance.convert("ABC", 2));
        assertEquals("ACBD", instance.convert("ABCD", 2));
        assertEquals("ABDC", instance.convert("ABCD", 3));
        assertEquals("AEBDFC", instance.convert("ABCDEF", 3));
        assertEquals("PAHNAPLSIIGYIR", instance.convert("PAYPALISHIRING", 3));
        assertEquals("AGBFHCEIKDJ", instance.convert("ABCDEFGHIJK", 4));
        assertEquals("0481357926A", instance.convert("0123456789A", 3));
    }
}
