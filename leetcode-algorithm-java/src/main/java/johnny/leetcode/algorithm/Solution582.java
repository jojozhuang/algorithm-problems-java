package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Kill Process
 * <p>
 * Given n processes, each process has a unique PID (process id) and its PPID (parent process id).
 * <p>
 * Each process only has one parent process, but may have one or more children
 * processes. This is just like a tree structure. Only one process has PPID
 * that is 0, which means this process has no parent process. All the PIDs will
 * be distinct positive integers.
 * <p>
 * We use two list of integers to represent a list of processes, where the first
 * list contains PID for each process and the second list contains the corresponding PPID.
 * <p>
 * Now given the two lists, and a PID representing a process you want to kill,
 * return a list of PIDs of processes that will be killed in the end. You should
 * assume that when a process is killed, all its children processes will be
 * killed. No order is required for the final answer.
 * <p>
 * Example 1:
 * Input:
 * pid =  [1, 3, 10, 5]
 * ppid = [3, 0, 5, 3]
 * kill = 5
 * Output: [5,10]
 * <p>
 * Explanation:
 * 3
 * /   \
 * 1     5
 * /
 * 10
 * Kill 5 will also kill 10.
 * <p>
 * Note:
 * 1. The given kill id is guaranteed to be one of the given PIDs.
 * 2.{@code  n >= 1}.
 *
 * @author Johnny
 */
public class Solution582 {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < pid.size(); i++) {
            if (!map.containsKey(ppid.get(i))) {
                map.put(ppid.get(i), new ArrayList<Integer>());
            }
            map.get(ppid.get(i)).add(pid.get(i));
        }
        ans.add(kill);
        helper(map, kill, ans);
        return ans;
    }

    private void helper(Map<Integer, List<Integer>> map, int kill, List<Integer> ans) {
        if (!map.containsKey(kill)) {
            return;
        }

        for (Integer process : map.get(kill)) {
            ans.add(process);
            helper(map, process, ans);
        }
    }
}
