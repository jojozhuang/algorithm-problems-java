package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1410Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("entityParser");
        SolutionA1410 instance = new SolutionA1410();

        assertEquals("& is an HTML entity but &ambassador; is not.", instance.entityParser("&amp; is an HTML entity but &ambassador; is not."));
        assertEquals("and I quote: \"...\"", instance.entityParser("and I quote: &quot;...&quot;"));
        assertEquals("Stay home! Practice on Leetcode :)", instance.entityParser("Stay home! Practice on Leetcode :)"));
        assertEquals("x > y && x < y is always false", instance.entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));
        assertEquals("leetcode.com/problemset/all", instance.entityParser("leetcode.com&frasl;problemset&frasl;all"));
    }
}
