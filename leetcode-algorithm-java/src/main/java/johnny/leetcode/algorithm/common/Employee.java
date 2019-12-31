package johnny.leetcode.algorithm.common;

import java.util.List;

//Employee info
public class Employee {
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
    
    public Employee(int id, int importance, List<Integer> subordinates) { 
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
