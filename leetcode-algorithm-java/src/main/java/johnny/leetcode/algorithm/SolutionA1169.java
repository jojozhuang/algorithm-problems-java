package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 1169. Invalid Transactions
 * A transaction is possibly invalid if:
 * <p>
 * the amount exceeds $1000, or;
 * if it occurs within (and including) 60 minutes of another transaction with the same name in a different city.
 * Each transaction string transactions[i] consists of comma separated values representing the name, time (in minutes), amount, and city of the transaction.
 * <p>
 * Given a list of transactions, return a list of transactions that are possibly invalid.  You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
 * Output: ["alice,20,800,mtv","alice,50,100,beijing"]
 * Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
 * <p>
 * Example 2:
 * Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
 * Output: ["alice,50,1200,mtv"]
 * <p>
 * Example 3:
 * Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
 * Output: ["bob,50,1200,mtv"]
 * <p>
 * Constraints:
 * <pre>{@code
 * transactions.length <= 1000
 * Each transactions[i] takes the form "{name},{time},{amount},{city}"
 * Each {name} and {city} consist of lowercase English letters, and have lengths between 1 and 10.
 * Each {time} consist of digits, and represent an integer between 0 and 1000.
 * Each {amount} consist of digits, and represent an integer between 0 and 2000.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1169 {
    public List<String> invalidTransactions(String[] transactions) {
        Map<String, TreeMap<Integer, Transaction>> map = new HashMap<>();
        for (String t : transactions) {
            String[] details = t.split(",");
            Transaction tran = new Transaction(details[0], Integer.parseInt(details[1]), Integer.parseInt(details[2]), details[3]);
            if (!map.containsKey(tran.name)) {
                map.put(tran.name, new TreeMap<>());
            }
            map.get(tran.name).put(tran.time, tran);
        }

        Set<String> set = new HashSet<>();
        for (Map.Entry<String, TreeMap<Integer, Transaction>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                Transaction t = entry.getValue().firstEntry().getValue();
                if (t.amount > 1000) {
                    set.add(t.toString());
                }
            } else {
                TreeMap<Integer, Transaction> treeMap = entry.getValue();
                ArrayList<Transaction> list = new ArrayList<>(treeMap.values());
                int start = 0;
                if (list.get(start).amount > 1000) {
                    set.add(list.get(start).toString());
                }
                for (int i = 1; i < list.size(); i++) {
                    Transaction t = list.get(i);
                    if (t.amount > 1000) {
                        set.add(t.toString());
                    }

                    while (t.time > list.get(start).time + 60) {
                        start++;
                    }
                    for (int j = start; j < i; j++) {
                        if (!list.get(j).city.equals(t.city)) {
                            set.add(list.get(j).toString());
                            set.add(t.toString());
                        }
                    }
                }
            }
        }

        List<String> ans = new ArrayList<>(set);
        return ans;
    }

    class Transaction {
        public String name;
        public int time;
        public int amount;
        public String city;

        public Transaction(String name, int time, int amount, String city) {
            this.name = name;
            this.time = time;
            this.amount = amount;
            this.city = city;
        }

        public String toString() {
            return name + "," + time + "," + amount + "," + city;
        }
    }
}
