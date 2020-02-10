package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Top N Buzzwords
 *
 * You work on a team whose job is to understand the most sought after toys for the holiday season. A teammate of yours has built a webcrawler that extracts a list of quotes about toys from different articles. You need to take these quotes and identify which toys are mentioned most frequently. Write an algorithm that identifies the top N toys out of a list of quotes and list of toys.
 *
 * Your algorithm should output the top N toys mentioned most frequently in the quotes.
 *
 * Input:
 * The input to the function/method consists of five arguments:
 *
 * numToys, an integer representing the number of toys
 * topToys, an integer representing the number of top toys your algorithm needs to return;
 * toys, a list of strings representing the toys,
 * numQuotes, an integer representing the number of quotes about toys;
 * quotes, a list of strings that consists of space-sperated words representing articles about toys
 *
 * Output:
 * Return a list of strings of the most popular N toys in order of most to least frequently mentioned
 *
 * Note:
 * The comparison of strings is case-insensitive. If the value of topToys is more than the number of toys, return the names of only the toys mentioned in the quotes. If toys are mentioned an equal number of times in quotes, sort alphabetically.
 *
 * Example 1:
 *
 * Input:
 * numToys = 6
 * topToys = 2
 * toys = ["elmo", "elsa", "legos", "drone", "tablet", "warcraft"]
 * numQuotes = 6
 * quotes = [
 * "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
 * "The new Elmo dolls are super high quality",
 * "Expect the Elsa dolls to be very popular this year, Elsa!",
 * "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
 * "For parents of older kids, look into buying them a drone",
 * "Warcraft is slowly rising in popularity ahead of the holiday season"
 * ];
 *
 * Output:
 * ["elmo", "elsa"]
 *
 * Explanation:
 * elmo - [4,3]
 * elsa - [4,2]
 * "elmo" should be placed before "elsa" in the result because "elmo" appears in 3 different quotes and "elsa" appears in 2 different quotes.
 */
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
