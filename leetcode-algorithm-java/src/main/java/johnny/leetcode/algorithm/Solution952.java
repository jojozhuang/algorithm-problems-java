package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 952. Largest Component Size by Common Factor
 * Given a non-empty array of unique positive integers A, consider the following graph:
 * <p>
 * There are A.length nodes, labelled A[0] to A[A.length - 1];
 * There is an edge between A[i] and A[j] if and only if A[i] and A[j] share a common factor greater than 1.
 * Return the size of the largest connected component in the graph.
 * <p>
 * Example 1:
 * Input: [4,6,15,35]
 * Output: 4
 * <p>
 * Example 2:
 * Input: [20,50,9,63]
 * Output: 2
 * <p>
 * Example 3:
 * Input: [2,3,6,7,4,12,21,39]
 * Output: 8
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 20000
 * 1 <= A[i] <= 100000
 * }</pre>
 *
 * @author Johnny
 */
public class Solution952 {
    public int largestComponentSize(int[] A) {
        int N = A.length;

        // factored[i] = a list of unique prime factors of A[i]
        ArrayList<Integer>[] factored = new ArrayList[N];
        for (int i = 0; i < N; ++i) {
            factored[i] = new ArrayList<Integer>();
            int d = 2, x = A[i];
            while (d * d <= x) {
                if (x % d == 0) {
                    while (x % d == 0)
                        x /= d;
                    factored[i].add(d);
                }

                d++;
            }

            if (x > 1 || factored[i].isEmpty())
                factored[i].add(x);
        }

        // primesL : a list of all primes that occur in factored
        Set<Integer> primes = new HashSet<Integer>();
        for (List<Integer> facs : factored)
            for (int x : facs)
                primes.add(x);

        int[] primesL = new int[primes.size()];
        int t = 0;
        for (int x : primes)
            primesL[t++] = x;

        // primeToIndex.get(v) == i  iff  primes[i] = v
        Map<Integer, Integer> primeToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < primesL.length; ++i)
            primeToIndex.put(primesL[i], i);

        DSU dsu = new DSU(primesL.length);
        for (List<Integer> facs : factored)
            for (int x : facs)
                dsu.union(primeToIndex.get(facs.get(0)), primeToIndex.get(x));

        int[] count = new int[primesL.length];
        for (List<Integer> facs : factored)
            count[dsu.find(primeToIndex.get(facs.get(0)))]++;

        int ans = 0;
        for (int x : count)
            if (x > ans)
                ans = x;
        return ans;
    }

    class DSU {
        int[] parent;

        public DSU(int N) {
            parent = new int[N];
            for (int i = 0; i < N; ++i)
                parent[i] = i;
        }

        public int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }

        public void union(int x, int y) {
            parent[find(x)] = find(y);
        }
    }
}
