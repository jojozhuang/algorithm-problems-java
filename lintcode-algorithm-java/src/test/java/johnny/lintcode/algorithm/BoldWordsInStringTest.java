package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class BoldWordsInStringTest extends JunitBase {

    /**
     * Test of boldWords method, of class BoldWordsInString.
     */
    @Test
    public void testBoldWords() {
        System.out.println("combine");
        BoldWordsInString instance = new BoldWordsInString();

        String[] words1 = new String[]{"ab", "bc"};
        String s1 = "aabcd";
        String expect1 = "a<b>abc</b>d";
        assertEquals(expect1, instance.boldWords(words1, s1));

        String[] words2 = new String[]{"ccb","b","d","cba","dc"};
        String s2 = "eeaadadadc";
        String expect2 = "eeaa<b>d</b>a<b>d</b>a<b>dc</b>";
        assertEquals(expect2, instance.boldWords(words2, s2));


        String[] words3 = new String[]{"bcccaeb","b","eedcbda","aeebebebd","ccd","eabbbdcde","deaaea","aea","accebbb","d"};
        String s3 = "ceaaabbbedabbecbcced";
        String expect3 = "ceaaa<b>bbb</b>e<b>d</b>a<b>bb</b>ec<b>b</b>cce<b>d</b>";
        assertEquals(expect3, instance.boldWords(words3, s3));
    }
}
