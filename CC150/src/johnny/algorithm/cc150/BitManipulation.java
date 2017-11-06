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
public class BitManipulation {
    // It works for both positive as well as negative numbers
    public int add(int a, int b) {  
        while (b != 0) {
            int c = a & b;  // Find the carry bits
            a = a ^ b;  // Add the bits without considering the carry
            b = c << 1;  // Propagate the carry
        }
        return a;
    }
    
    public int sub(int a, int b) {
        return add(a, -b);
    }
    
    public int multiply(int a, int b) {
        return add(a, -b);
    }

}
