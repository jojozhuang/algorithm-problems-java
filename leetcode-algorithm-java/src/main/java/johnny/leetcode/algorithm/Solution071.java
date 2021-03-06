package johnny.leetcode.algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Simplify Path.
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p>
 * For example,
 * {@code path = "/home/", => "/home"}
 * {@code path = "/a/./b/../../c/", => "/c"}
 * <p>
 * Corner Cases:
 * 1. Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * 2. Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 *
 * @author Johnny
 */
public class Solution071 {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return "";
        }

        Deque<String> deque = new LinkedList<String>();
        String[] list = path.split("/");
        for (String item : list) {
            if (item.equals(".") || item.isEmpty()) {
                continue;
            } else if (item.equals("..")) {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            } else {
                deque.offerLast(item);
            }
        }

        if (deque.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append("/");
            sb.append(deque.pollFirst());
        }

        return sb.toString();
    }
}