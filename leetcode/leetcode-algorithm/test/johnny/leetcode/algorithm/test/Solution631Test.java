package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution631;

public class Solution631Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Excel");
        Solution631 instance = new Solution631(3,'C');

        instance.set(1, 'A', 2);
        assertEquals(2, instance.get(1,'A'));
        assertEquals(4, instance.sum(3, 'C', new String[] {"A1", "A1:B2"}));
        instance.set(2, 'B', 2);
        assertEquals(6, instance.sum(3, 'C', new String[] {"A1", "A1:B2"}));
    }
}
