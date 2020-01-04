package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution591Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isValid");
        Solution591 instance = new Solution591();

        assertEquals(true, instance.isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"));
        assertEquals(true, instance.isValid("<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"));
        assertEquals(false, instance.isValid("<A>  <B> </A>   </B>"));
        assertEquals(false, instance.isValid("<DIV>  div tag is not closed  <DIV>"));
        assertEquals(false, instance.isValid("<DIV>  unmatched <  </DIV>"));
        assertEquals(false, instance.isValid("<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"));
        assertEquals(false, instance.isValid("<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"));
        assertEquals(false, instance.isValid("<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"));
    }
}
