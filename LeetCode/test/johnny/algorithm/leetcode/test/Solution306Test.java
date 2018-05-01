package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution306;

public class Solution306Test extends JunitBase {

    @Test
    public void testIsAdditiveNumber() {
        System.out.println("isAdditiveNumber");
        Solution306 instance = new Solution306();

        assertEquals(false, instance.isAdditiveNumber(""));
        assertEquals(true, instance.isAdditiveNumber("112358"));
        assertEquals(true, instance.isAdditiveNumber("199100199"));
        assertEquals(false, instance.isAdditiveNumber("1233456"));
        assertEquals(true, instance.isAdditiveNumber("198019823962"));
    }
}
