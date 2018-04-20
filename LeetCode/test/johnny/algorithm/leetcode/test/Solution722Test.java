package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution722;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution722Test {

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
        System.out.println("removeComments");
        Solution722 instance = new Solution722();

        String[] source1 = new String[] {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        List<String> result1 = ListUtil.buildStringList(new String[] {"int main()","{ ","  ","int a, b, c;","a = b + c;","}"});
        assertEquals(result1, instance.removeComments(source1));

        String[] source2 = new String[] {"a/*comment", "line", "more_comment*/b"};
        List<String> result2 = ListUtil.buildStringList(new String[] {"ab"});
        assertEquals(result2, instance.removeComments(source2));
}

}
