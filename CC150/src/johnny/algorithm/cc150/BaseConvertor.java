/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

/**
 *
 * @author i857285
 */
public class BaseConvertor {
    // convert string with specified base to equivalent decimal value
    public int convertFromBase(String str, int base) {
        if (base < 2 || (base > 10 && base != 16)) {
            return -1;
        }
        
        int res = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = digitToValue(str.charAt(i));
            if (num < 0 || num >= base) {
                return -1;
            }
            int exp = str.length() - 1 - i;
            res += num * Math.pow(base, exp);
        }
        
        return res;
    }
    
    private int digitToValue(char c) {
        if (c >= '0' && c <= '9') {
            return Integer.parseInt(String.valueOf(c));
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else {
            return -1;
        }
    }
}
