package johnny.lintcode.algorithm;

/**
 * Fast Power.
 * Calculate the a^n % b where a, b and n are all 32bit integers.
 * Example
 * <p>
 * For 2^31 % 3 = 2
 * <p>
 * For 100^1000 % 1000 = 0
 * <p>
 * Challenge
 * O(logn)
 *
 * @author Johnny
 */
public class FastPower {
    public int fastPower(int a, int b, int n) {
        if (n == 1) {
            return a % b;
        } else if (n == 0) {
            return 1 % b;
        } else if (n < 0) {
            return -1;
        }

        // (a * b) % p = ((a % p) * (b % p)) % p
        // use long to prevent overflow
        long product = fastPower(a, b, n / 2);
        product = (product * product) % b;
        if (n % 2 == 1) {
            product = (product * a) % b;
        }

        // cast long to int
        return (int) product;
    }
}
