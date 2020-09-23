package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 1032. Stream of Characters
 * Implement the StreamChecker class as follows:
 * <p>
 * StreamChecker(words): Constructor, init the data structure with the given words.
 * query(letter): returns true if and only if for some {@code k >= 1}, the last k characters queried (in order from oldest to newest, including this letter just queried) spell one of the words in the given list.
 * <p>
 * Example:
 * StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // init the dictionary.
 * streamChecker.query('a');          // return false
 * streamChecker.query('b');          // return false
 * streamChecker.query('c');          // return false
 * streamChecker.query('d');          // return true, because 'cd' is in the wordlist
 * streamChecker.query('e');          // return false
 * streamChecker.query('f');          // return true, because 'f' is in the wordlist
 * streamChecker.query('g');          // return false
 * streamChecker.query('h');          // return false
 * streamChecker.query('i');          // return false
 * streamChecker.query('j');          // return false
 * streamChecker.query('k');          // return false
 * streamChecker.query('l');          // return true, because 'kl' is in the wordlist
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= words.length <= 2000
 * 1 <= words[i].length <= 2000
 * Words will only consist of lowercase English letters.
 * Queries will only consist of lowercase English letters.
 * The number of queries is at most 40000.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1032 {
    // TLC
    Set<String> set;
    int max_len;
    Stack<Character> stack;
    public SolutionA1032(String[] words) {
        set = new HashSet<>();
        for (String word : words) {
            set.add(word);
            if (word.length() > max_len) {
                max_len = word.length();
            }
        }
        stack = new Stack<>();
    }

    public boolean query(char letter) {
        if (set.contains(String.valueOf(letter))) {
            return true;
        }

        boolean found = false;
        if (stack.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(letter);
            int i = max_len - 1;
            while (!stack.isEmpty() && i > 0) {
                sb.insert(0, stack.pop());
                if (set.contains(sb.toString())) {
                    found = true;
                    break;
                }
                i--;
            }
            for (Character c : sb.toString().toCharArray()) {
                stack.push(c);
            }
        } else {
            stack.push(letter);
        }

        return found;
    }
}
