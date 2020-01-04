package johnny.leetcode.algorithm;

/**
 * 858. Mirror Reflection
 * <p>
 * There is a special square room with mirrors on each of the four walls.  Except for the southwest corner, there are receptors on each of the remaining corners, numbered 0, 1, and 2.
 * <p>
 * The square room has walls of length p, and a laser ray from the southwest corner first meets the east wall at a distance q from the 0th receptor.
 * <p>
 * Return the number of the receptor that the ray meets first.  (It is guaranteed that the ray will meet a receptor eventually.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: p = 2, q = 1
 * Output: 2
 * Explanation: The ray meets receptor 2 the first time it gets reflected back to the left wall.
 * <p>
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= p <= 1000
 * 0 <= q <= p
 *
 * @author Johnny
 */
public class Solution858 {
    double EPS = 1e-6;

    public int mirrorReflection(int p, int q) {
        double x = 0, y = 0;
        double rx = p, ry = q;

        // While it hasn't reached a receptor,...
        while (!(close(x, p) && (close(y, 0) || close(y, p))
                || close(x, 0) && close(y, p))) {
            // Want smallest t so that some x + rx, y + ry is 0 or p
            // x + rxt = 0, then t = -x/rx etc.
            double t = 1e9;
            if ((-x / rx) > EPS) t = Math.min(t, -x / rx);
            if ((-y / ry) > EPS) t = Math.min(t, -y / ry);
            if (((p - x) / rx) > EPS) t = Math.min(t, (p - x) / rx);
            if (((p - y) / ry) > EPS) t = Math.min(t, (p - y) / ry);

            x += rx * t;
            y += ry * t;

            if (close(x, p) || close(x, 0)) rx *= -1;
            if (close(y, p) || close(y, 0)) ry *= -1;
        }

        if (close(x, p) && close(y, p)) return 1;
        return close(x, p) ? 0 : 2;
    }

    public boolean close(double x, double y) {
        return Math.abs(x - y) < EPS;
    }
}
