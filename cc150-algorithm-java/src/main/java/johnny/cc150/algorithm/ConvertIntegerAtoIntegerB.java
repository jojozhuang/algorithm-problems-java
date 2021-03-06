package johnny.cc150.algorithm;

/**
 * Convert Integer A to Integer B.
 * Determine the number of bits required to convert integer A to integer B
 * Example
 * Given n = 31, m = 14,return 2
 * 
 * (31)10=(11111)2
 * 
 * (14)10=(01110)2
 * 
 * @author Johnny
 */
public class ConvertIntegerAtoIntegerB {
    // Relevant to question 'O1 Check Power of 2 '
    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        int xor = a ^ b;
        while (xor != 0) {
            ++count;
            xor &= xor - 1;
        }

        return count;
    }
    public static int bitSwapRequired2(int a, int b) {
        int count = 0;
        int xor = a ^ b;
        while (xor != 0) {
            if ((xor & 1) == 1){
                count++;
            }
            xor = xor >> 1;
        }

        return count;
    }
}
