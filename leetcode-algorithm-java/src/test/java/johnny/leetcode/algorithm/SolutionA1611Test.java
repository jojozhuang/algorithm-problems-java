package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1611Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumOneBitOperations");
        SolutionA1611 instance = new SolutionA1611();

        assertEquals(0, instance.minimumOneBitOperations(0));
        assertEquals(2, instance.minimumOneBitOperations(3));
        assertEquals(4, instance.minimumOneBitOperations(6));
        assertEquals(14, instance.minimumOneBitOperations(9));
        assertEquals(393, instance.minimumOneBitOperations(333));

    }
}
