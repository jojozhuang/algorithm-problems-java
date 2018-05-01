package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution180;

public class Solution180Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution180 instance = new Solution180();

        assertEquals(0, instance.query());
    }
}
