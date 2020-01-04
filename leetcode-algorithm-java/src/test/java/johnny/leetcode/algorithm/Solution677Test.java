package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution677Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("MapSum");
        Solution677 instance = new Solution677();

        instance.insert("apple", 3);
        assertEquals(3, instance.sum("ap"));
        instance.insert("app", 2);
        assertEquals(5, instance.sum("ap"));
    }
}
