package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution273Test extends JunitBase {

    @Test
    public void testNumberToWords() {
        System.out.println("numberToWords");
        Solution273 instance = new Solution273();

        assertEquals("Zero", instance.numberToWords(0));
        assertEquals("One Hundred", instance.numberToWords(100));
        assertEquals("One Thousand", instance.numberToWords(1000));
        assertEquals("Two Thousand", instance.numberToWords(2000));
        assertEquals("One Thousand One Hundred", instance.numberToWords(1100));
        assertEquals("One Million", instance.numberToWords(1000000));
        assertEquals("Two Million", instance.numberToWords(2000000));
        assertEquals("One Billion", instance.numberToWords(1000000000));
        assertEquals("One Hundred Twenty Three", instance.numberToWords(123));
        assertEquals("Twelve Thousand Three Hundred Forty Five", instance.numberToWords(12345));
        assertEquals("Fifty Thousand Eight Hundred Sixty Eight", instance.numberToWords(50868));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", instance.numberToWords(1234567));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred", instance.numberToWords(1234500));
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand One", instance.numberToWords(1234567001));
    }
}
