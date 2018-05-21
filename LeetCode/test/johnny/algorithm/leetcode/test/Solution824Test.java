package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution824;

public class Solution824Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumLengthEncoding");
        Solution824 instance = new Solution824();

        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", instance.toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", instance.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
