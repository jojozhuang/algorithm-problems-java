/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

/**
 *
 * @author Johnny
 */
public class BSTNode {
    public int val;
    public BSTNode left, right;
    private int size = 0;

    public BSTNode(int value) {
        this.val = value;
        this.size = 1;
    }

    public void insert(int value) {

    }

    public BSTNode find(int value) {
        return null;
    }

    public int size() {
        return this.size;
    }
}
