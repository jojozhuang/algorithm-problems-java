package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 937. Reorder Log Files
 * You have an array of logs.  Each log is a space delimited string of words.
 * <p>
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 * <p>
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
 * <p>
 * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.
 * <p>
 * Return the final order of the logs.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] is guaranteed to have an identifier, and a word after the identifier.
 *
 * @author Johnny
 */
public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length == 0) {
            return logs;
        }

        Arrays.sort(logs, new LogComparator());

        return logs;
    }

    public String[] reorderLogFiles2(String[] logs) {
        if (logs == null || logs.length == 0) {
            return null;
        }

        List<String> letter = new ArrayList<String>();
        List<String> digit = new ArrayList<String>();

        for (int i = 0; i < logs.length; i++) {
            if (isLetter(logs[i])) {
                letter.add(logs[i]);
            } else {
                digit.add(logs[i]);
            }
        }
        Collections.sort(letter, new LogComparator());

        List<String> res = new ArrayList<String>();
        res.addAll(letter);
        res.addAll(digit);

        String[] arrLog = new String[res.size()];
        return res.toArray(arrLog);
    }

    private boolean isLetter(String log) {
        char ch = log.charAt(log.indexOf(" ") + 1);
        return Character.isLetter(ch);
    }

    private class LogComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            String log1 = s1.substring(s1.indexOf(" ") + 1);
            String log2 = s2.substring(s2.indexOf(" ") + 1);
            boolean isNumber1 = log1.charAt(0) >= '0' && log1.charAt(0) <= '9';
            boolean isNumber2 = log2.charAt(0) >= '0' && log2.charAt(0) <= '9';
            if (isNumber1) {
                if (isNumber2) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                if (isNumber2) {
                    return -1;
                } else {
                    return log1.compareTo(log2);
                }
            }
        }
    }

    private class LogComparator2 implements Comparator<String> {
        public int compare(String s1, String s2) {
            String sub1 = s1.substring(s1.indexOf(" ") + 1, s1.length());
            String sub2 = s2.substring(s2.indexOf(" ") + 1, s2.length());
            return sub1.compareTo(sub2);
        }
    }
}
