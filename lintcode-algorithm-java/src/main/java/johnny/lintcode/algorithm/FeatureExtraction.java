package johnny.lintcode.algorithm;

import java.util.*;

/**
 * Feature extraction
 * Xiao Ming wants to dig up some cat movement information from the cat video. In order to extract motion information, he needs to extract "cat features" from each frame of the video.
 * The characteristic of a cat is a two-dimensional vector <x, y>. If x_1 = x_2 and y_1 = y_2, then these two are the same feature.
 * If the characteristics of the kitty are consistent, it can be considered that the kitty is in motion. That is, if features <a, b> appear in continuous frames, then it will constitute feature motion. For example, feature <a, b> appears in the 2/3/4/7/8 frame, then the feature will form two feature motions 2-3-4 and 7-8.
 * Now, given the features of each frame, the number of features may be different. Xiaoming expects to find the longest characteristic movement.
 *
 * Each line represents a frame. Among them, the first number is the number of features of the frame, and the next two numbers are a pair of <x, y>
 * The total number of features does not exceed 10^5
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input:
 * features:
 * [[2,1,1,2,2],
 * [2,1,1,1,4],
 * [2,1,1,2,2],
 * [2,2,2,1,4],
 * [0],
 * [0],
 * [1,1,1],
 * [1,1,1]]
 * Output: 3
 * Explanation:Feature <1,1> appears three times in a row in consecutive frames. Compared with other features, the number of consecutive occurrences is greater, so output 3
 *
 */
public class FeatureExtraction {
    /**
     * @param frames: A series of frames
     * @return: Find the longest feature movement
     */
    public int FeatureExtraction(int[][] frames) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < frames.length; i++) {
            for (int j = 1; j < frames[i].length; j+=2) {
                String key = frames[i][j] + "-" + frames[i][j+1];
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(i);
            }
        }

        int count = 1;

        for (String key : map.keySet()) {
            List<Integer> list = map.get(key);
            Collections.sort(list);
            int len = 1;
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j) == list.get(j - 1) + 1) {
                    len++;
                } else {
                    if (len > count) {
                        count = len;
                    }
                    len = 1;
                }
            }
            if (len > count) {
                count = len;
            }
        }

        return count;
    }
}
