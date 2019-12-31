package johnny.cc150.algorithm;

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
