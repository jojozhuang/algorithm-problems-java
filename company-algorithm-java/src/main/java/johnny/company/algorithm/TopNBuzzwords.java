package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopNBuzzwords {
    public List<String> topToys(int numToys, int topToys, String[] toys, int numQuotes,
                                       String[] quotes) {
        Map<String, int[]> freq = new HashMap<>();
        for (String toy : toys) {
            freq.put(toy, new int[]{0, 0});
        }

        for (String quote : quotes) {
            Set<String> used = new HashSet<>();

            String[] words = quote.toLowerCase().split("\\W+");
            for (String word : words) {
                if (!freq.containsKey(word)) {
                    continue;
                }

                int[] nums = freq.get(word);

                nums[0]++; // total frequency
                if (!used.contains(word)) {
                    nums[1]++; // frequency in unique quote
                }

                used.add(word);
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int[] feqA = freq.get(a);
            int[] feqB = freq.get(b);
            if (feqA[0] == feqB[0]) {         // total frequency are same
                if (feqA[1] == feqB[1]) {     // frequency in unique quotes are same
                    return b.compareTo(a);    // sort by alphabet
                } else {
                    return feqA[1] - feqB[1]; // compare frequency in unique quotes
                }
            } else {
                return feqA[0] - feqB[0];     // compare total frequency
            }
        });

        if (topToys > numToys) {
            for (String toy : freq.keySet()) {
                if (freq.get(toy)[0] > 0) {
                    pq.add(toy);
                }
            }
        } else {
            for (String toy : toys) {
                pq.add(toy);

                if (pq.size() > topToys) {
                    pq.poll();
                }
            }
        }

        List<String> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        Collections.reverse(list);

        return list;
    }
}
