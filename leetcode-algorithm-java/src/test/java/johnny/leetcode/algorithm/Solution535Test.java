package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution535Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("encode");
        Solution535 instance = new Solution535();

        String url1 = "https://leetcode.com/problems/design-tinyurl";
        assertEquals(url1, instance.decode(instance.encode(url1)));

        String url2 = "https://www.google.com";
        assertEquals(url2, instance.decode(instance.encode(url2)));

        String url3 = "http://jojozhuang.github.io/";
        assertEquals(url3, instance.decode(instance.encode(url3)));
    }
}
