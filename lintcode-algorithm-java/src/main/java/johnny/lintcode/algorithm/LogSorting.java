package johnny.lintcode.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Log Sorting
 * Given a list of string logs, in which each element representing a log. Each log can be separated into two parts by the first space. The first part is the ID of the log, while the second part is the content of the log. (The content may contain spaces as well.) The content is composed of only letters and spaces, or only numbers and spaces.
 *
 * Now you need to sort logs by following rules:
 *
 * Logs whose content is letter should be ahead of logs whose content is number.
 * Logs whose content is letter should be sorted by their content in lexicographic order. And when two logs have same content, sort them by ID in lexicographic order.
 * Logs whose content is number should be in their input order.
 * The total number of logs will not exceed 5000
 * The length of each log will not exceed 100
 * Each log's ID is unique.
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input:
 *     logs = [
 *         "zo4 4 7",
 *         "a100 Act zoo",
 *         "a1 9 2 3 1",
 *         "g9 act car"
 *     ]
 * Output:
 *     [
 *         "a100 Act zoo",
 *         "g9 act car",
 *         "zo4 4 7",
 *         "a1 9 2 3 1"
 *     ]
 * Explanation: "Act zoo" < "act car", so the output is as above.
 * Example 2:
 *
 * Input:
 *     logs = [
 *         "zo4 4 7",
 *         "a100 Actzoo",
 *         "a100 Act zoo",
 *         "Tac Bctzoo",
 *         "Tab Bctzoo",
 *         "g9 act car"
 *     ]
 * Output:
 *     [
 *         "a100 Act zoo",
 *         "a100 Actzoo",
 *         "Tab Bctzoo",
 *         "Tac Bctzoo",
 *         "g9 act car",
 *         "zo4 4 7"
 *     ]
 * Explanation:
 *     Because "Bctzoo" == "Bctzoo", the comparison "Tab" and "Tac" have "Tab" < Tac ", so" Tab Bctzoo "< Tac Bctzoo".
 *     Because ' '<'z', so "A100 Act zoo" < A100 Actzoo".
 *
 * @author Johnny
 */
public class LogSorting {
    /**
     * @param logs: the logs
     * @return: the log after sorting
     */
    public String[] logSort(String[] logs) {
        Arrays.sort(logs, new LogComparator());
        return logs;
    }

    public class LogComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            int index1 = s1.indexOf(" ");
            int index2 = s2.indexOf(" ");
            String[] log1 = new String[]{s1.substring(0, index1), s1.substring(index1 + 1, s1.length())};
            String[] log2 = new String[]{s2.substring(0, index2), s2.substring(index2 + 1, s2.length())};

            char c1 = log1[1].charAt(0);
            char c2 = log2[1].charAt(0);
            if (Character.isDigit(c1) && Character.isDigit(c2)) {
                return 1;
            } else if (Character.isDigit(c1) && !Character.isDigit(c2)) {
                return 1;
            } else if (!Character.isDigit(c1) && Character.isDigit(c2)) {
                return -1;
            } else {
                if (log1[1].equals(log2[1])) {
                    return log1[0].compareTo(log2[0]);
                } else {
                    return log1[1].compareTo(log2[1]);
                }
            }
        }
    }
}
