/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Find the Celebrity.
 * Suppose you are at a party with n people (labeled from 0 to n - 1) and among 
 * them, there may exist one celebrity. The definition of a celebrity is that 
 * all the other n - 1 people know him/her but he/she does not know any of them.
 * 
 * Now you want to find out who the celebrity is or verify that there is not one. 
 * The only thing you are allowed to do is to ask questions like: 
 * "Hi, A. Do you know B?" to get information of whether A knows B. 
 * You need to find out the celebrity (or verify there is not one) by asking as
 * few questions as possible (in the asymptotic sense).
 * 
 * You are given a helper function bool knows(a, b) which tells you whether 
 * A knows B. Implement a function int findCelebrity(n), your function should 
 * minimize the number of calls to knows.
 * 
 * Note: There will be exactly one celebrity if he/she is in the party. Return 
 * the celebrity's label if there is a celebrity in the party. If there is no 
 * celebrity, return -1.
 * 
 * @author Johnny
 */
public class Solution277 {
    /* The knows API is defined in the parent class Relation. 
      boolean knows(int a, int b); */  
    //http://blog.csdn.net/xudli/article/details/48749295
    //http://www.cnblogs.com/jcliBlogger/p/4787588.html
    public int findCelebrity(int n) {
        // Consider this problem as digraph problem, peoples are vertex, their 
        // know relation as edge.
        if (n <= 0) {
            return 0;
        }
        
        // elimination
        int c = 0; // candidates from 0 to n - 1
        for (int i = 1; i < n; i++) {
            if (knows(c, i)) {
                c = i;
            }
        }
        // verify
        for (int i = 0; i < n; i++) {
            if (i == c) {
                continue;
            }
            if (!knows(i, c) || knows(c, i)){
                return -1;
            }
        }
        return c;
    }
    public int findCelebrity2(int n) {
        if (n <= 0) {
            return 0;
        }        
        
        int[] counts = new int[n];
        // count for each candidate how many people he/she knows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                
                if (counts[j] >= 0) {
                    if (knows(i, j)) {
                        counts[i] = -1;
                        counts[j]++;
                    } else {
                        counts[j] = -1;
                    }
                }
            }
        }
        
        // verify the candidate does not know others.
        for (int i = 0; i < n; i++) {
            if (counts[i] == n - 1) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }                    
                    if (knows(i, j)) {
                        return -1;
                    }
                }
                return i;
            }
        }
        
        return -1;
    }
    
    private boolean knows(int a, int b) {
        return false;
    }
}
