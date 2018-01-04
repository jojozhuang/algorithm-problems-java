package johnny.algorithm.leetcode.common;

public class Employee {
    public int id;
    public int importance;
    public int[] subordinates;
    
    public Employee(int id, int importance, int[] subordinates) { 
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
