package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3030Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLeastNumOfUniqueInts");
        SolutionA3030 instance = new SolutionA3030();

        assertEquals('0', instance.findKthBit(1,1));
        assertEquals('1', instance.findKthBit(2,3));
        assertEquals('0', instance.findKthBit(3, 1));
        assertEquals('1', instance.findKthBit(4,11));

    }
}
