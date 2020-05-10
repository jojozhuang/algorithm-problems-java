package johnny.lintcode.algorithm;

/**
 * Monochrome Screen.
 * A monochrome screen is stored as a single array of bytes, allowing eight consecutive pixels to be sorted in one byte. The screen has width w, where w is divisible by 8 (that is, no byte will be split across rows). The height of the screen, of course, can be derived from the length of the array and the width. Implement a function drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y) which draws a horizontal line from (x1, y) to (x2, y).
 *
 * Example
 * Example1
 *
 * Input:
 * screen = [0]
 * width = 8
 * x1 = 0
 * x2 = 7
 * y = 0
 * Output: [255]
 * Explanation:
 * [0] means 00000000 at first.You need to change screen to [255](11111111)
 * Example2
 *
 * Input:
 * screen = [0,0,0,0]
 * width = 16
 * x1 = 5
 * x2 = 11
 * y = 1
 * Output: [0,0,7,240]
 * Explanation:
 * [0,0,0,0] means 00000000,00000000 at the first line and 00000000,00000000 at the second line.You need to change screen to [0,0,7,240](00000000,00000000,00000111,11110000)
 *
 * @author Johnny
 */
public class MonochromeScreen {
    public void drawHorizontalLine(int[] screen, int width, int x1, int x2, int y) {
        // get row index;
        int start = (width / 8) * y;
        // get column
        int val = 0;
        int i = start + x1 / 8;
        for (int j = x1; j <= x2; j++) {
            val += 1 << (7 - j%8);
            if (j > 0 && j%8 == 7) {
                screen[i] = screen[i] | val;
                i++;
                val = 0;
            }
        }
        if (val != 0) {
            screen[i] = screen[i] | val;
        }
    }
}
