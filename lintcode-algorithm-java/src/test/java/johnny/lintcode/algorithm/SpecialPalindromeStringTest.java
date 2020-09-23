package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpecialPalindromeStringTest extends JunitBase {

    @Test
    public void testReformatString() {
        System.out.println("testReformatString");
        SpecialPalindromeString instance = new SpecialPalindromeString();

        List<String> ambigram1 = ListUtil.buildList(new String[]{"at", "by", "yh", "hn", "mw", "ww"});
        assertEquals(true, instance.ispalindrome(ambigram1, "swims"));

        assertEquals(true, instance.ispalindrome(ambigram1, "hob"));
        assertEquals(false, instance.ispalindrome(ambigram1, "ban"));

        List<String> ambigram2 = ListUtil.buildList(new String[]{"ab", "bc", "cd", "de", "ef"});
        assertEquals(true, instance.ispalindrome(ambigram2, "abcdefedcb"));
    }
}
