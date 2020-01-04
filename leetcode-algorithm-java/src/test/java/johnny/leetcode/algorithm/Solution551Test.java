package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution551Test extends JunitBase {

    @Test
    public void testCheckRecord() {
        System.out.println("checkRecord");
        Solution551 instance = new Solution551();

        //assertEquals(false, instance.checkRecord(""));
        assertEquals(true, instance.checkRecord("A"));
        assertEquals(true, instance.checkRecord("AL"));
        assertEquals(true, instance.checkRecord("ALL"));
        assertEquals(false, instance.checkRecord("ALLL"));
        assertEquals(false, instance.checkRecord("LPAAL"));
        assertEquals(true, instance.checkRecord("APLPL"));
        assertEquals(true, instance.checkRecord("PPALLP"));
        assertEquals(false, instance.checkRecord("PPALLL"));
        assertEquals(false, instance.checkRecord("PPALLA"));
        assertEquals(true, instance.checkRecord("PPALPLPL"));
    }
}
