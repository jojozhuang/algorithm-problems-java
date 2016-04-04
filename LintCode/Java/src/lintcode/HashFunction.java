/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.math.BigInteger;

/**
 *  Hash Function.
 * 
 * @author Johnny
 */
public class HashFunction {
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        if (key == null || key.length == 0 || HASH_SIZE <= 0) {
            return 0;
        }

        BigInteger res = new BigInteger("0");
        for (int i = key.length - 1; i >= 0; i--) {
            BigInteger mul1 = new BigInteger(String.valueOf((int)key[i]));
            BigInteger mul2 = new BigInteger("33");
            mul2 = mul2.pow(key.length - 1 - i);
            mul1 = mul1.multiply(mul2);
            res = res.add(mul1);
        }
        res = res.mod(new BigInteger(String.valueOf(HASH_SIZE)));

        return res.intValue();
    }
}
