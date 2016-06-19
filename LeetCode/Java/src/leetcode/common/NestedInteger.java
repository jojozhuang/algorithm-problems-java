/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.common;

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
    public Object self;

    // Returns true if this com.sada.linkedin.NestedInteger holds a single integer, rather than a nested list
    public boolean isInteger() {
        if (self instanceof String) {
            return true;
        }
        return false;
    }

    // Returns the single integer that this NestedInteger holds, if it holds a single integer
    // Returns null if this holds a nested list
    public Integer getInteger() {
        return Integer.valueOf(self.toString());
    }

    // Returns the nested list that this NestedInteger holds, if it holds a nested list
    // Returns null if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        if (!isInteger()) {
            return (List<NestedInteger>) self;
        }

        return null;
    }
}
