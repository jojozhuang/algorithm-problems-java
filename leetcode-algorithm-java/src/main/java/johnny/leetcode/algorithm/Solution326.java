package johnny.leetcode.algorithm;

/**
 * Power of Three.
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * Follow up:
 * Could you do it without using any loop / recursion?
 * 
 * @author Johnny
 */
public class Solution326 {
    //http://blog.csdn.net/ebowtang/article/details/50485622
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        //return (1162261467 % n) == 0; //1162261467 is the bigest power of 3 in integer
        return (Math.pow(3, 19) % n) == 0;
    }
    
    public boolean isPowerOfThree2(int n) {
        if (n <= 0) {
            return false;
        }

        while (n >= 3) {
            if((n % 3) != 0) {
                return false;
            }
            n = n / 3;
        }
        return n == 1;
    }
    public boolean isPowerOfThree3(int n) {
        if (n <= 0) {
            return false;
        }

        for (int i = 1; i <= Integer.MAX_VALUE; i = i * 3) {
            if (i == n) {
                return true;
            } else if (i > n) {
                return false;
            } else if (i < 0) { //overflow
                return false;
            }
        }
        return false;
    }    
}
