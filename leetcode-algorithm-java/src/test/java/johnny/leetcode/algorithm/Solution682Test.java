package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution682Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("calPoints");
        Solution682 instance = new Solution682();

        assertEquals(30, instance.calPoints(new String[] {"5","2","C","D","+"}));
        assertEquals(27, instance.calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
    }
}
