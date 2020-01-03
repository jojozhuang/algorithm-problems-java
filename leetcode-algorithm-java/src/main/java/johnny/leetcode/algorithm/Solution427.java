package johnny.leetcode.algorithm;

import johnny.algorithm.common.QuadNode;

/**
 * 427. Construct Quad Tree

We want to use quad trees to store an N x N boolean grid. Each cell in the grid can only be true or false. The root node represents the whole grid. For each node, it will be subdivided into four children nodes until the values in the region it represents are all the same.

Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node. The val attribute for a leaf node contains the value of the region it represents.

Your task is to use a quad tree to represent a given grid. The following example may help you understand the problem better:

Given the 8 x 8 grid below, we want to construct the corresponding quad tree:

It can be divided according to the definition above:

The corresponding quad tree should be as following, where each node is represented as a (isLeaf, val) pair.

For the non-leaf nodes, val can be arbitrary, so it is represented as *.

Note:

N is less than 1000 and guaranteened to be a power of 2.
If you want to know more about the quad tree, you can refer to its wiki.

 * @author Johnny
 */
public class Solution427 {
    public QuadNode construct(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return null;
        }
        
        return dfs(grid, 0, 0, grid.length-1, grid[0].length-1);
    }
    
    private QuadNode dfs(int[][] grid, int top, int left, int bottom, int right) {
        if (top > bottom || left > right) {
            return null;
        }
        
        QuadNode node = new QuadNode();
        boolean isLeaf = isLeaf(grid, top, left, bottom, right);
        int val = grid[top][left];
        if (isLeaf) {
            node = new QuadNode(val == 1, true, null, null, null, null);
        } else {
            node.isLeaf = false;
            node.val = false;
            node.topLeft = dfs(grid, top, left, (bottom+top)/2, (right+left)/2);
            node.topRight = dfs(grid, top, (right+left)/2 + 1, (bottom+top)/2,  right);
            node.bottomLeft = dfs(grid, (bottom+top)/2+1, left, bottom, (right+left)/2);
            node.bottomRight = dfs(grid, (bottom+top)/2+1, (right+left)/2 + 1, bottom, right);
        }
        
        return node;
    }
    
    private boolean isLeaf(int[][] grid, int top, int left, int bottom, int right) {
        int first = grid[top][left];

        boolean isLeaf = true;
        for (int i = top; i <= bottom; i++) {
            for (int j = left; j <= right; j++) {
                if (grid[i][j] != first) {
                    isLeaf = false;
                    break;
                }
            }
        }
        return isLeaf;
    }
}
