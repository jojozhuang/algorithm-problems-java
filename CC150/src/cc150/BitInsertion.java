/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc150;

/**
 *
 * Input:  N = 10000000000, M = 10011, i = 2, j = 6
 * Output: N = 10001001100
 * @author i857285
 */
public class BitInsertion {
    public int insert(int n, int m, int i, int j) {
        int mask = (-1 << j + 1) | ((1 << i + 1) - 1);
        int res = n & mask;
         res = res | (m << i);
        return res;
    }
}
