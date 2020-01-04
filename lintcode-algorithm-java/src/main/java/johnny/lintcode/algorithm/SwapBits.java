package johnny.lintcode.algorithm;

/**
 * Swap Bits
 * <p>
 * Write a program to swap odd and even bits in an integer with as few
 * instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3
 * are swapped, and so on).
 * <p>
 * Example
 * 5 = (101)2 =&gt; (1010)2 = 10
 *
 * @author Johnny
 */
public class SwapBits {
    public int swapOddEvenBits(int x) {
        int num = x;
        if (num >= 0) {
            int count = 0;
            while (num > 0) {
                count++;
                num = num >> 1;
            }

            if (count % 2 != 0) {
                count++;
            }

            int mask = 1;
            for (int i = 0; i < count; i++) {
                mask = mask * 2;
            }
            mask--;

            return x ^ mask;
        } else {
            int count = 0;
            while (num != -1) {
                count++;
                num = num >> 1;
            }

            if (count % 2 != 0) {
                count++;
            }

            int mask = 1;
            for (int i = 0; i < count; i++) {
                mask = mask * 2;
            }
            mask--;

            return x ^ mask;
        }
    }

    public int swapOddEvenBits2(int x) {
        int len = 0;
        int num = x;
        int res = 0;
        int odd = 0;
        int even = 0;
        while (len < 32) {
            odd = num & 1;
            num = num >> 1;
            even = num & 1;
            num = num >> 1;
            res += even << len;
            res += odd << len + 1;
            len = len + 2;
        }

        return res;
    }
}
