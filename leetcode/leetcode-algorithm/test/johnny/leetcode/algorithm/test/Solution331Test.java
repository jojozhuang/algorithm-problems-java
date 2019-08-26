package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution331;

public class Solution331Test extends JunitBase {

    @Test
    public void testIsValidSerialization() {
        System.out.println("isValidSerialization");
        Solution331 instance = new Solution331();

        assertEquals(false, instance.isValidSerialization(""));
        assertEquals(true, instance.isValidSerialization("#"));
        assertEquals(false, instance.isValidSerialization("1,#"));
        assertEquals(false, instance.isValidSerialization("9,#,#,1"));
        assertEquals(true, instance.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        assertEquals(false, instance.isValidSerialization("1,#,#,#,#"));
        assertEquals(true, instance.isValidSerialization("9,#,92,#,#"));
        assertEquals(false, instance.isValidSerialization("#,8,8,3,#,#,0,4,4,#,#,#,#,#,3,7,8,#,7,#,#"));
    }
}
