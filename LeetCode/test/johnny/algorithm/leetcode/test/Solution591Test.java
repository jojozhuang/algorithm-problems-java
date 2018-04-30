package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution591;

public class Solution591Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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
