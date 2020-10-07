package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1419Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minNumberOfFrogs");
        SolutionA1419 instance = new SolutionA1419();

        assertEquals(1, instance.minNumberOfFrogs("croakcroak"));
        assertEquals(2, instance.minNumberOfFrogs("crcoakroak"));
        assertEquals(-1, instance.minNumberOfFrogs("croakcrook"));
        assertEquals(-1, instance.minNumberOfFrogs("croakcroa"));
        assertEquals(2, instance.minNumberOfFrogs("crocakcroraoakk"));

    }
}
