package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Top K Frequent Words II
 * Find top k frequent words in realtime data stream.
 *
 * Implement three methods for Topk Class:
 *
 * TopK(k). The constructor.
 * add(word). Add a new word.
 * topk(). Get the current top k frequent words.
 * If two words have the same frequency, rank them by dictionary order.
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input：
 * TopK(2)
 * add("lint")
 * add("code")
 * add("code")
 * topk()
 * Output：["code", "lint"]
 * Explanation：
 * "code" appears twice and "lint" appears once, they are the two most frequent words.
 * Example 2:
 *
 * Input：
 * TopK(1)
 * add("aa")
 * add("ab")
 * topk()
 * Output：["aa"]
 * Explanation：
 * "aa" and "ab" appear once , but aa's dictionary order is less than ab's.
 *
 * @author Johnny
 */
public class TopKFrequentWords2 {
    PriorityQueue<String> pq;
    Map<String, Integer> map;
    int size;
    /*
     * @param k: An integer
     */public TopKFrequentWords2(int k) {
        size = k;
        pq = new PriorityQueue<>((a, b)->{
            int count1 = map.get(a);
            int count2 = map.get(b);
            if (count1 == count2) {
                return a.compareTo(b);
            } else {
                return count1 - count2;
            }
        });
        map = new HashMap<>();
    }

    /*
     * @param word: A string
     * @return: nothing
     */
    public void add(String word) {
        if (!map.containsKey(word)) {
            map.put(word, 1);
            pq.offer(word);
        } else {
            map.put(word, map.get(word) + 1);
        }
    }

    /*
     * @return: the current top k frequent words.
     */
    public List<String> topk() {
        List<String> list = new ArrayList<>();
        int n = size;
        while (!pq.isEmpty() && n > 0) {
            list.add(pq.poll());
            n--;
        }

        for (String str : list) {
            pq.offer(str);
        }

        return list;
    }
}
