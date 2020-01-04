package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution722Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeComments");
        Solution722 instance = new Solution722();

        String[] source1 = new String[] {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        List<String> expect1 = ListUtil.buildList(new String[] {"int main()","{ ","  ","int a, b, c;","a = b + c;","}"});
        assertEquals(expect1, instance.removeComments(source1));

        String[] source2 = new String[] {"a/*comment", "line", "more_comment*/b"};
        List<String> expect2 = ListUtil.buildList(new String[] {"ab"});
        assertEquals(expect2, instance.removeComments(source2));
    }
}
