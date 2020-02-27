package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author Johnny
 */
public class LetterCasePermutationTest extends JunitBase {

    /**
     * Test of letterCasePermutation method, of class LetterCasePermutation.
     */
    @Test
    public void testLetterCasePermutation() {
        System.out.println("testLetterCasePermutation");
        LetterCasePermutation instance = new LetterCasePermutation();

        List<String> result1 = instance.letterCasePermutation("a1b2");
        List<String> expect1 = ListUtil.buildList(new String[]{"a1b2", "a1B2", "A1b2", "A1B2"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        List<String> result2 = instance.letterCasePermutation("3z4");
        List<String> expect2 = ListUtil.buildList(new String[]{"3z4", "3Z4"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<String> result3 = instance.letterCasePermutation("12345");
        List<String> expect3 = ListUtil.buildList(new String[]{"12345"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
    }
}
