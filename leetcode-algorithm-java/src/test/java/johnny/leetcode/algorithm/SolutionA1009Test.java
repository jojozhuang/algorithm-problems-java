package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1009Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("bitwiseComplement");
        SolutionA1009 instance = new SolutionA1009();

        //assertEquals(1, instance.bitwiseComplement(0));
        assertEquals(0, instance.bitwiseComplement(1));
        assertEquals(2, instance.bitwiseComplement(5));
        assertEquals(0, instance.bitwiseComplement(7));
        assertEquals(5, instance.bitwiseComplement(10));

    }
}
