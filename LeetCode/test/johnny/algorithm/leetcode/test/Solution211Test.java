package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution211;

public class Solution211Test extends JunitBase {

    @Test
    public void testAddWord() {
        System.out.println("addWord");
        String word = "";
        Solution211 instance = new Solution211();
        instance.addWord(word);
    }

    @Test
    public void testSearch() {
        System.out.println("search");
        Solution211 instance = new Solution211();

        instance.addWord("bad");
        instance.addWord("dad");
        instance.addWord("mad");
        assertEquals(false, instance.search("pad"));
        assertEquals(true, instance.search("bad"));
        assertEquals(true, instance.search(".ad"));
        assertEquals(true, instance.search("b.."));
        assertEquals(false, instance.search(".bd"));
        assertEquals(false, instance.search("ba"));
        assertEquals(false, instance.search("m."));

        Solution211 instance2 = new Solution211();
        assertEquals(false, instance2.search("."));

        Solution211 instance3 = new Solution211();
        instance3.addWord("a");
        assertEquals(true, instance3.search("."));

        Solution211 instance4 = new Solution211();
        instance4.addWord("a");
        instance4.addWord("a");
        assertEquals(true, instance4.search("."));
        assertEquals(true, instance4.search("a"));
        assertEquals(false, instance4.search("aa"));
        assertEquals(true, instance4.search("a"));
        assertEquals(false, instance4.search(".a"));
        assertEquals(false, instance4.search("a."));
    }
}
