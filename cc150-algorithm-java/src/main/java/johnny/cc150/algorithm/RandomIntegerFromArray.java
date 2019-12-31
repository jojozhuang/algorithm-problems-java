package johnny.cc150.algorithm;

import java.util.Random;

/**
 * Write a method to randomly generate a set of m integers from an array of 
 * size n Each element must have equal probability of being chosen.
 * 
 * @author Johnny
 */
public class RandomIntegerFromArray {
    public int[] pickMRandomly(int[] original, int m) {
        if (original == null || original.length == 0 || m <= 0 || m > original.length) {
            return null;
        }
        
        int[] res = new int[m];
        for (int i = 0; i < res.length; i++) {
            int index = getRandomByRange(i, original.length);
            res[i] = original[index];
            original[index] = original[i];
        }
        
        return res;
    }
    
    // low, inclusive,
    // high, exclusive
    private int getRandomByRange(int low, int high) {
        return new Random().nextInt(high - low) + low;
    }
}
