package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SubstringsKChars2Test extends JunitBase {

    @Test
    public void testSubstringsKDistinctChars() {
        System.out.println("substringsKDistinctChars");
        SubstringsKChars2 instance = new SubstringsKChars2();

        List<String> expect1 = Arrays.asList("bca", "abc", "cab");
        assertEquals(expect1, instance.substringsKDistinctChars("abcabc", 3));

        List<String> expect2 = Arrays.asList("bac", "cab");
        assertEquals(expect2, instance.substringsKDistinctChars("abacab", 3));

        List<String> expect3 = Arrays.asList("wagl", "aglk", "glkn", "lkna", "knag", "gawu", "awun", "wuna", "unag", "nagw", "agwk", "kwag");
        List<String> result3 = instance.substringsKDistinctChars("awaglknagawunagwkwagl", 4);
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));

    }
}
