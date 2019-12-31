package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution482;

public class Solution482Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("licenseKeyFormatting");
        Solution482 instance = new Solution482();

        assertEquals("5F3Z-2E9W", instance.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("24-A0R-74K", instance.licenseKeyFormatting("2-4A0r7-4k", 3));
        assertEquals("2-5G-3J", instance.licenseKeyFormatting("2-5g-3-J", 2));
        assertEquals("", instance.licenseKeyFormatting("---", 3));
    }
}
