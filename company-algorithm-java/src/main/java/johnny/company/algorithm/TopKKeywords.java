package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Top K Frequently Mentioned Keywords
 *
 * Given a list of reviews, a list of keywords and an integer k. Find the most popular k keywords in order of most to least frequently mentioned.
 *
 * The comparison of strings is case-insensitive. If keywords are mentioned an equal number of times in reviews, sort alphabetically.
 *
 * Example 1:
 *
 * Input:
 * k = 2
 * keywords = ["anacell", "cetracular", "betacellular"]
 * reviews = [
 *   "Anacell provides the best services in the city",
 *   "betacellular has awesome services",
 *   "Best services provided by anacell, everyone should use anacell",
 * ]
 *
 * Output:
 * ["anacell", "betacellular"]
 *
 * Explanation:
 * "anacell" is occuring in 2 different reviews and "betacellular" is only occuring in 1 review.
 * Example 2:
 *
 * Input:
 * k = 2
 * keywords = ["anacell", "betacellular", "cetracular", "deltacellular", "eurocell"]
 * reviews = [
 *   "I love anacell Best services; Best services provided by anacell",
 *   "betacellular has great services",
 *   "deltacellular provides much better services than betacellular",
 *   "cetracular is worse than anacell",
 *   "Betacellular is better than deltacellular.",
 * ]
 *
 * Output:
 * ["betacellular", "anacell"]
 *
 * Explanation:
 * "betacellular" is occuring in 3 different reviews. "anacell" and "deltacellular" are occuring in 2 reviews, but "anacell" is lexicographically smaller.
 * Related problems:
 *
 * https://leetcode.com/problems/top-k-frequent-words/
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * https://leetcode.com/discuss/interview-question/542597/
 */
public class TopKKeywords {
    public String[] topKeyword(int k, String[] keywords, String[] reviews) {
        if (keywords == null || keywords.length == 0 || reviews == null || reviews.length == 0) {
            return new String[]{};
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : keywords) {
            map.put(word, 0); // <key, frequency>
        }

        for (String review : reviews) {
            Set<String> temp = new HashSet<>();
            String[] words = review.toLowerCase().split("\\W+"); // split by whitespace
            for (String word : words) {
                if (map.containsKey(word) && !temp.contains(word)) {
                    map.put(word, map.get(word) + 1);
                    temp.add(word);
                }
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {         // frequency are same
                return a.compareTo(b);    // compare alphabet
            } else {
                return freqB - freqA;     // compare review frequency
            }
        });

        for (String keyword : keywords) {
            if (map.containsKey(keyword) && map.get(keyword) > 0) {
                pq.add(keyword);
            }
        }

        String[] ans = new String[k];
        int i = 0;
        while (!pq.isEmpty() && i < k) {
            ans[i++] = pq.poll();
        }

        return ans;
    }

    public String[] topKeyword2(int k, String[] keywords, String[] reviews) {
        if (keywords == null || keywords.length == 0 || reviews == null || reviews.length == 0) {
            return new String[]{};
        }
        Map<String, int[]> map = new HashMap<>();
        for (String word : keywords) {
            map.put(word, new int[]{0, 0}); // <key, [review frequency, total frequency]>
        }

        for (String review : reviews) {
            Map<String, Integer> temp = new HashMap<>();
            String[] words = review.toLowerCase().split("\\W+"); // split by whitespace
            for (String word : words) {
                if (!map.containsKey(word)) {
                    // not a keyword, skip
                    continue;
                }

                temp.put(word, temp.getOrDefault(word, 0) + 1);
            }

            for (String key : temp.keySet()) {
                int[] freq = map.get(key);

                freq[0]++;              // review frequency is always one
                freq[1]+=temp.get(key); // total frequency
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int[] freqA = map.get(a);
            int[] freqB = map.get(b);
            if (freqA[0] == freqB[0]) {         // review frequency are same
                if (freqA[1] == freqB[1]) {     // total frequency are same
                    return b.compareTo(a);      // compare alphabet
                } else {
                    return freqA[1] - freqB[1]; // compare total frequency
                }
            } else {
                return freqA[0] - freqB[0];     // compare review frequency
            }
        });

        int top = k;
        if (k > keywords.length) {
            top = keywords.length;
        }
        for (String keyword : keywords) {
            if (map.containsKey(keyword) && map.get(keyword)[0] > 0) {
                pq.add(keyword);

                if (pq.size() > top) {
                    pq.poll();
                }
            }
        }

        String[] ans = new String[pq.size()];
        int i = ans.length - 1;
        while (!pq.isEmpty()) {
            ans[i--] = pq.poll();
        }

        return ans;
    }
}
