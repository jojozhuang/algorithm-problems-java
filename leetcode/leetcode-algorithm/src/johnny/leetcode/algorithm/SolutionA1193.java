package johnny.leetcode.algorithm;

/**
 *
 * @author Johnny
 */
public class SolutionA1193 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = destination;
            destination = start;
            start = temp;
        }

        int dis = 0;
        int total = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= start && i < destination) {
                dis += distance[i];
            }
        }

        return Math.min(dis, total - dis);
    }
}
