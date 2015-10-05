/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 * Simplify Path.
 * Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * 
 * Corner Cases:
 * 1. Did you consider the case where path = "/../"?
 *    In this case, you should return "/".
 * 2. Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 *    In this case, you should ignore redundant slashes and return "/home/foo".
 * 
 * @author Johnny
 */
public class Solution071 {
    public String simplifyPath(String path) {
        if (path==null||path.length()==0)
            return "";
        
        Stack st = new Stack();
        String[] list = path.split("/");
        for(String item: list) {
            if (item.equals(".")||item.isEmpty())
                continue;
            else if (item.equals("..")) {
                if (!st.empty())
                    st.pop();
            }
            else {
                st.push(item);
            }                
        }
        
        if (st.empty())
            return "/";
        else {
            Stack st2 = new Stack();
            while(!st.empty()) {
                st2.push(st.pop());
            }
            StringBuilder sb = new StringBuilder();
            while(!st2.empty()) {
                sb.append("/");
                sb.append(st2.pop());
            }
            return sb.toString();
        }
    }
}
