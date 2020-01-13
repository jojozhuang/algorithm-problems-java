package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * Letter Case Permutation
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string. Return a list of all possible strings we could create.
 *
 * Example
 * Example 1:
 *
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * Example 2:
 *
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * Example 3:
 *
 * Input: S = "12345"
 * Output: ["12345"]
 *
 * @author Johnny
 */
public class LetterCasePermutation {
    /**
     * @param S: a string
     * @return: return a list of strings
     */
    // BFS with Queue
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        if (S == null) {
            return list;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(S);
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                continue;
            }
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String str = queue.poll();
                char[] letters = str.toCharArray();
                letters[i] = Character.toLowerCase(letters[i]);
                queue.offer(new String(letters));

                letters[i] = Character.toUpperCase(letters[i]);
                queue.offer(new String(letters));
            }
        }

        return new LinkedList<>(queue);
    }

    // DFS, similar like subset
    public List<String> letterCasePermutation2(String S) {
        List<String> list = new ArrayList<>();
        if (S == null) {
            return list;
        }

        List<Character> letters = new ArrayList<>();
        helper(S, 0, letters, list);
        return list;
    }

    private void helper(String s, int pos, List<Character> letters, List<String> result) {
        if (pos >= s.length()) {
            if (letters.size() == s.length()) {
                String str = letters.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining());
                result.add(str);
            }
            return;
        }

        char c = s.charAt(pos);
        if (c >= '0'&& c <= '9') {
            letters.add(c);
            helper(s, pos + 1, letters, result);
            letters.remove(letters.size() - 1);
        } else {
            letters.add(Character.toLowerCase(c));
            helper(s, pos + 1, letters, result);
            letters.remove(letters.size() - 1);

            letters.add(Character.toUpperCase(c));
            helper(s, pos + 1, letters, result);
            letters.remove(letters.size() - 1);
        }
    }
}
