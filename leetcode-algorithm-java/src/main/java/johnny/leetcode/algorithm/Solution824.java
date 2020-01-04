package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 824. Goat Latin
 * <p>
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
 * <p>
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
 * <p>
 * The rules of Goat Latin are as follows:
 * <p>
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 * <p>
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 * <p>
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * Example 2:
 * <p>
 * Input: "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 *
 * @author Johnny
 */
public class Solution824 {
    public String toGoatLatin(String S) {
        Set<Character> vowel = new HashSet<Character>();
        for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}) {
            vowel.add(c);
        }

        int t = 1;
        StringBuilder sb = new StringBuilder();
        for (String word : S.split(" ")) {
            char first = word.charAt(0);
            if (vowel.contains(first)) {
                sb.append(word);
            } else {
                sb.append(word.substring(1) + word.substring(0, 1));
            }
            sb.append("ma");
            for (int i = 0; i < t; i++) {
                sb.append("a");
            }

            t++;
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1); // delete the last space.
        return sb.toString();
    }
}
