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
public class BitManipulation2 {
    
    public static void main(String[] args) {
        // output 0, shift 0, since it is positive, finally becomes to 00000000 00000000 00000000 00000000
        System.out.println(repeatArithmeticShift(34543,40));
        // output 0, logical shift always append a zero into the most significant bit repeatedly.
        System.out.println(repeatLogicShift(34543,40));
        // output -1, shift 1, since it is negative, finally becomes to 11111111 11111111 11111111 11111111
        System.out.println(repeatArithmeticShift(-34543,40));
        // output 0, logical shift always append a zero into the most significant bit repeatedly.
        System.out.println(repeatLogicShift(-34543,40));
    }

    public static int repeatArithmeticShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>= 1; //Arithmetic shift by 1
        }
        return x;
    }

    public static int repeatLogicShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>>= 1; //Logical shift by 1
        }
        return x;
    }
}
