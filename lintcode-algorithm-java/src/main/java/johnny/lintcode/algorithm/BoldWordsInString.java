package johnny.lintcode.algorithm;

/**
 * Bold Words in String
 * Given a set of keywords words and a string S, make all appearances of all keywords in S bold. Any letters between <b> and </b> tags become bold.
 * The returned string should use the least number of tags possible, and of course the tags should form a valid combination.
 *
 * words has length in range [0, 50].
 * words[i] has length in range [1, 10].
 * S has length in range [0, 500].
 * All characters in words[i] and S are lowercase letters.
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input:
 * ["ab", "bc"]
 * "aabcd"
 * Output:
 * "a<b>abc</b>d"
 *
 * Explanation:
 * Note that returning "a<b>a<b>b</b>c</b>d" would use more tags, so it is incorrect.
 * Example 2:
 *
 * Input:
 * ["bcccaeb","b","eedcbda","aeebebebd","ccd","eabbbdcde","deaaea","aea","accebbb","d"]
 * "ceaaabbbedabbecbcced"
 * Output:
 * "ceaaa<b>bbb</b>e<b>d</b>a<b>bb</b>ec<b>b</b>cce<b>d</b>"
 */
public class BoldWordsInString {
    /**
     * @param words: the words
     * @param S: the string
     * @return: the string with least number of tags
     */
    public String boldWords(String[] words, String S) {
        int[] arr = new int[S.length()];
        for (String word : words) {
            int index = S.indexOf(word);
            while (index >= 0) {
                for (int i = index; i < index + word.length(); i++) {
                    arr[i] = 1;
                }
                index = S.indexOf(word, index + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int index = 0;
        int start = -1;
        while (index < arr.length) {
            if (arr[index] == 1) {
                if (start == -1) {
                    start = index;
                } else {
                    //index++;
                }
            } else {
                if (start == -1) {
                    sb.append(S.charAt(index));
                } else {
                    sb.append("<b>");
                    sb.append(S.substring(start, index));
                    sb.append("</b>");
                    start = -1;
                    sb.append(S.charAt(index));
                }
            }
            index++;
        }

        if (start >=0) {
            sb.append("<b>");
            sb.append(S.substring(start, arr.length));
            sb.append("</b>");
        }

        return sb.toString();
    }
}
