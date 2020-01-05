package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Occurrences After Bigram
 * Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.
 * <p>
 * For each such occurrence, add "third" to the answer, and return the answer.
 * <p>
 * Example 1:
 * Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
 * Output: ["girl","student"]
 * <p>
 * Example 2:
 * Input: text = "we will we will rock you", first = "we", second = "will"
 * Output: ["we","rock"]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= text.length <= 1000
 * text consists of space separated words, where each word consists of lowercase English letters.
 * 1 <= first.length, second.length <= 10
 * first and second consist of lowercase English letters.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length - 2; i++) {
            if (!words[i].isEmpty() && words[i].equals(first)) {
                if (words[i + 1].equals(second)) {
                    ans.add(words[i + 2]);
                }
            }
        }

        return ans.stream().toArray(String[]::new);
    }
}
