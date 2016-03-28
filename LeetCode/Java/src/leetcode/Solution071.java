/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
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
        if (path == null || path.length() == 0) {
            return "";
        }
        
        Deque<String> deque = new LinkedList<String>();
        String[] list = path.split("/");
        for(String item: list) {
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
        while(!deque.isEmpty()) {
            sb.append("/");
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}