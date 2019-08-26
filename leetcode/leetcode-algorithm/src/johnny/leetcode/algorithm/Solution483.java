package johnny.leetcode.algorithm;

import java.math.BigInteger;

/**
 * Smallest Good Base
 * 
 * For an integer n, we call k>=2 a good base of n, if all digits of n base k are 1.
 * 
 * Now given a string representing n, you should return the smallest good base 
 * of n in string format. 
 * 
 * Example 1:
 * Input: "13"
 * Output: "3"
 * Explanation: 13 base 3 is 111.
 * 
 * Example 2:
 * Input: "4681"
 * Output: "8"
 * Explanation: 4681 base 8 is 11111.
 * 
 * Example 3:
 * Input: "1000000000000000000"
 * Output: "999999999999999999"
 * Explanation: 1000000000000000000 base 999999999999999999 is 11.
 * 
 * Note:
 * The range of n is [3, 10^18].
 * The string representing n is always valid and will not have leading zeros.
 * 
 * @author Johnny
 */
public class Solution483 {
    public String smallestGoodBase(String strn) {
        long n = Long.parseLong(strn);
        long res = 0;
        for(int k = 60; k >= 2; k--){
          long s = 2, e = n;
          while(s < e){
              long m = s + (e - s) / 2;   
              
              BigInteger left = BigInteger.valueOf(m);
              left = left.pow(k).subtract(BigInteger.ONE);
              BigInteger right = BigInteger.valueOf(n).multiply(BigInteger.valueOf(m).subtract(BigInteger.ONE));
              int cmr = left.compareTo(right);
              if(cmr == 0){
                  res =  m;
                  break;
              } else if(cmr < 0){
                  s = m + 1;
              } else {
                  e = m;
              }
          }
          
          if(res != 0) break;
        }
        
        return "" + res;
    }
}
