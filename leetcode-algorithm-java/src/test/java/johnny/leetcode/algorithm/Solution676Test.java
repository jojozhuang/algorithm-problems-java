package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution676Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("MagicDictionary");
        Solution676 instance = new Solution676();

        instance.buildDict(new String[] {"hello", "leetcode"});
        assertEquals(false, instance.search("hello"));
        assertEquals(true, instance.search("hhllo"));
        assertEquals(false, instance.search("hell"));
        assertEquals(false, instance.search("leetcoded"));
    }
}
