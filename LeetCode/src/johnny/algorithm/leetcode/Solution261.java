/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph Valid Tree.
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each 
 * edge is a pair of nodes), write a function to check whether these edges make
 * up a valid tree.
 * 
 * For example:
 * Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.
 * Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.
 * Hint:
 * Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], what should your return? 
 * Is this case a valid tree?
 * According to the definition of tree on Wikipedia: "a tree is an undirected 
 * graph in which any two vertices are connected by exactly one path. In other 
 * words, any connected graph without simple cycles is a tree."
 * 
 * Note: you can assume that no duplicate edges will appear in edges. Since all
 * edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear 
 * together inedges.
 * 
 * Understand the problem:
 * A classic graph search problem. The key is first to transform from the edge 
 * list to the adjecent list. The problem is equivalent to whether the graph 
 * exists a circle. We could solve the problem by using either DFS or BFS. 
 * 
 * @author Johnny
 */
public class Solution261 {
    //http://blog.csdn.net/pointbreak1/article/details/48796691
    public boolean validTree(int n, int[][] edges) {
        if (n <= 0 || edges == null) {
            return false;
        }
        int[] root = new int[n];  
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {  
            int root1 = find(root, edges[i][0]);  
            int root2 = find(root, edges[i][1]);  
            if(root1 == root2) { // both connect to the same node, triangle exists
                return false;  
            }
            root[root2] = root1;  
        }  
        return edges.length == n - 1; // all nodes are connected
    }  
      
    private int find(int[] root, int e) {  
        if(root[e] == e)  
            return e;  
        else  
            return find(root, root[e]);  
    }  
}
