package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import johnny.algorithm.leetcode.common.Employee;

/**
 *690. Employee Importance

You are given a data structure of employee information, which includes the employee's unique id, his importance value and his direct subordinates' id.

For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.

Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all his subordinates.

Example 1:
Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
Output: 11
Explanation:
Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3. They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.
Note:
One employee has at most one direct leader and may have several subordinates.
The maximum number of employees won't exceed 2000.

 * @author Johnny
 */
public class Solution690 {
 // bfs
    public int getImportance(List<Employee> employees, int id) {
        if (employees == null || employees.size() == 0) {
            return 0;
        }
        
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        
        if (!map.containsKey(id)) {
            return 0;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(id);
        int sum = 0;
        while (!queue.isEmpty()) {
            Employee emp = map.get(queue.poll());
            sum += emp.importance;
            for (Integer i : emp.subordinates) {
                queue.offer(i);
            }
        }
        
        return sum;
    }
    // dfs
    public int getImportance2(List<Employee> employees, int id) {
        if (employees == null || employees.size() == 0) {
            return 0;
        }
        
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        
        return dfs(map, id);
    }
    
    private int dfs(Map<Integer, Employee> map, int id) {
        if (!map.containsKey(id)) {
            return 0;
        }
        
        Employee emp = map.get(id);
        int sum = emp.importance;
        for (Integer subid : emp.subordinates) {
            sum += dfs(map, subid);
        }
        
        return sum;
    }
}
    