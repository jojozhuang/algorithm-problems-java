package johnny.algorithm.leetcode;

/**
 * Counting Bits.
 * 
 * Given a non negative integer number num. For every numbers i in the range 
 * 0 ≤ i ≤ num calculate the number of 1's in their binary representation and 
 * return them as an array.
 * 
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * 
 * Follow up:
 * 
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)).
 * But can you do it in linear time O(n) /possibly in a single pass?
 * 
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function 
 * like __builtin_popcount in c++ or in any other language.
* 
 * @author Johnny
 */
public class Solution338 {
    //https://www.hrwhisper.me/leetcode-counting-bits/
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        
        return res;
    }
    public int[] countBits2(int num) {
        int[] res = new int[num + 1];
        int pow2 = 1, before = 1;
        
        for(int i = 1; i <= num; i++){
            if (i == pow2){
                res[i] = 1;
                before = 1;
                pow2 <<= 1;
            } else{
                res[i] = res[before] + 1;
                before += 1;
            }
        }
        return res;
    }
}
