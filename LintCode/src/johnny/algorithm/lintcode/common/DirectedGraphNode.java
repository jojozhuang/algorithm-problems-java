/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.common;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class DirectedGraphNode {
    public int label;
    public ArrayList<DirectedGraphNode> neighbors;
    public DirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<DirectedGraphNode>();
    }
}
