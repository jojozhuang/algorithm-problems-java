package johnny.algorithm.leetcode.common;

import java.util.ArrayList;
import java.util.List;

/** 
* This is the interface that represents nested lists. 
* You should not implement it, or speculate about its implementation. 
*/ 
/*
public interface NestedInteger 
{ 
    // Returns true if this NestedInteger holds a single integer, rather than a nested list 
    public boolean isInteger(); 

    // Returns the single integer that this NestedInteger holds, if it holds a single integer 
    // Returns null if this NestedInteger holds a nested list 
    public Integer getInteger(); 

    // Returns the nested list that this NestedInteger holds, if it holds a nested list 
    // Returns null if this NestedInteger holds a single integer 
    public List<NestedInteger> getList(); 
}*/

public class NestedInteger {
    public List<NestedInteger> list = new ArrayList<NestedInteger>();
    public Integer i;

    // Constructor initializes an empty nested list.
    public NestedInteger() {
        
    }

    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        i = value;
    }
 
 
    // Returns true if this com.sada.linkedin.NestedInteger holds a single integer, rather than a nested list
    public boolean isInteger() {
        if (i == null) {
            return false;
        }
        return true;
    }

    // Returns the single integer that this NestedInteger holds, if it holds a single integer
    // Returns null if this holds a nested list
    public Integer getInteger() {
        if (isInteger()) {
            return i;
        } 
        return null;
    }

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value) {
        i = value;
    }

     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
     public void add(NestedInteger ni) {
         list.add(ni);
     }
 
    // Returns the nested list that this NestedInteger holds, if it holds a nested list
    // Returns null if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        if (!isInteger()) {
            return list;
        }

        return null;
    }
    
    public static boolean isSame(NestedInteger ni1, NestedInteger ni2) {
        if (ni1 == null && ni2 == null) {
            return true;
        }
        if (ni1 == null && ni2 != null) {
            return false;
        }
        if (ni1 != null && ni2 == null) {
            return false;
        }
        
        if (ni1.isInteger() != ni2.isInteger()) {
            return false;
        }
        
        if (ni1.isInteger() == true) {
            if (ni1.i.compareTo(ni2.i) != 0) {
                return false;
            }
        } else {
            if (ni1.list.size() != ni2.list.size()) {
                return false;
            }
            for (int i = 0; i < ni1.list.size(); i++) {
                if (!isSame(ni1.list.get(i), ni2.list.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
