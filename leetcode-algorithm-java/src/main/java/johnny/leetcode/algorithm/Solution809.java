package johnny.leetcode.algorithm;

/**
 * 809. Expressive Words
 * <pre>{@code
 * Sometimes people repeat letters to represent extra feeling, such as "hello" -> "heeellooo", "hi" -> "hiiii".  Here, we have groups, of adjacent letters that are all the same character, and adjacent characters to the group are different.  A group is extended if that group is length 3 or more, so "e" and "o" would be extended in the first example, and "i" would be extended in the second example.  As another example, the groups of "abbcccaaaa" would be "a", "bb", "ccc", and "aaaa"; and "ccc" and "aaaa" are the extended groups of that string.
 * <p>
 * For some given string S, a query word is stretchy if it can be made to be equal to S by extending some groups.  Formally, we are allowed to repeatedly choose a group (as defined above) of characters c, and add some number of the same character c to it so that the length of the group is 3 or more.  Note that we cannot extend a group of size one like "h" to a group of size two like "hh" - all extensions must leave the group extended - ie., at least 3 characters long.
 * <p>
 * Given a list of query words, return the number of words that are stretchy.
 * <p>
 * Example:
 * Input:
 * S = "heeellooo"
 * words = ["hello", "hi", "helo"]
 * Output: 1
 * Explanation:
 * We can extend "e" and "o" in the word "hello" to get "heeellooo".
 * We can't extend "helo" to get "heeellooo" because the group "ll" is not extended.
 * Notes:
 * <p>
 * 0 <= len(S) <= 100.
 * 0 <= len(words) <= 100.
 * 0 <= len(words[i]) <= 100.
 * S and all words in words consist only of lowercase letters
 * }</pre>
 * @author Johnny
 */
public class Solution809 {
    public int expressiveWords(String S, String[] words) {
        int count = 0;
        for (String w : words) {
            int i, j; // S & w's pointers.
            for (i = 0, j = 0; i < S.length(); ++i) {
                if (j < w.length() && S.charAt(i) == w.charAt(j)) { // matches, w pointer j 1 step forward to move together with i.
                    ++j;
                } else if (i > 0 && S.charAt(i - 1) == S.charAt(i) && i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) { // previous, current & next are same.
                    ++i; // S pointer 1 step forward, attempt to traverse the repeated chars.
                } else if (!(i > 1 && S.charAt(i) == S.charAt(i - 1) && S.charAt(i) == S.charAt(i - 2))) { // current & previous 2 are not same.
                    break; // No match.
                }
            }
            if (i == S.length() && j == w.length()) {
                ++count;
            } // both pointers reach ends.
        }
        return count;
    }
}
