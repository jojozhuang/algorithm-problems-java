package johnny.lintcode.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Find The Rank.
 * Give a two-dimensional array of scores to indicate the scores of each student's subjects, and find the index of the K-th grade of the students' total scores.
 *
 * Example
 * Example：
 * Input:
 * scores: [[90, 80, 70], [90, 90, 90], [60, 60, 60]]
 * k: 2
 * Output: 0
 * Explanation:
 * The second in the total score is the student with index 0.
 *
 * @author Johnny
 */
public class FindTheRank {
    /**
     * @param scores: two dimensional array
     * @param K: a integer
     * @return: return a integer
     */
    public int FindTheRank(int[][] scores, int K) {
        int[][] sorted = scores.clone();
        Arrays.sort(sorted, new ScoreCompare());
        int[] score = sorted[K- 1];
        for (int i = 0; i < scores.length; i++) {
            int[] s = scores[i];
            if (s[0] == score[0] && s[1] == score[1] && s[2] == score[2]) {
                return i;
            }
        }

        return -1;
    }

    public class ScoreCompare implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return (Arrays.stream(b).sum() - Arrays.stream(a).sum());
        }
    }
}
