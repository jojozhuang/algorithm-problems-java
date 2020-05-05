package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3001Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minNumberOfFrogs");
        SolutionA3001 instance = new SolutionA3001();

        assertEquals(1, instance.minNumberOfFrogs("croakcroak"));
        assertEquals(2, instance.minNumberOfFrogs("crcoakroak"));
        assertEquals(-1, instance.minNumberOfFrogs("croakcrook"));
        assertEquals(-1, instance.minNumberOfFrogs("croakcroa"));
        assertEquals(2, instance.minNumberOfFrogs("crocakcroraoakk"));

    }
}
