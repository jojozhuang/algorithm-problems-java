package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution208;

public class Solution208Test extends JunitBase {

    @Test
    public void testInsert() {
        System.out.println("insert");
        String word = "";
        Solution208 instance = new Solution208();
        instance.insert(word);
    }

    @Test
    public void testSearch() {
        System.out.println("search");
        Solution208 instance = new Solution208();
        instance.insert("dot");
        instance.insert("dog");
        instance.insert("fat");
        instance.insert("full");
        instance.insert("apple");
        assertEquals(true, instance.search("fat"));
        assertEquals(false, instance.search("fit"));
        assertEquals(true, instance.search("dog"));
        assertEquals(false, instance.search("tog"));
    }

    @Test
    public void testStartsWith() {
        System.out.println("startsWith");
        Solution208 instance = new Solution208();
        instance.insert("dot");
        instance.insert("dog");
        instance.insert("fat");
        instance.insert("full");
        instance.insert("apple");
        assertEquals(true, instance.startsWith("do"));
        assertEquals(false, instance.startsWith("dow"));
        assertEquals(true, instance.startsWith("f"));
        assertEquals(false, instance.startsWith("ac"));
        assertEquals(false, instance.startsWith("apq"));
    }
}
