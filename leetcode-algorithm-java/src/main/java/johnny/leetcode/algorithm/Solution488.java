package johnny.leetcode.algorithm;

/**
 * Zuma Game
 * <p>
 * Think about Zuma Game. You have a row of balls on the table, colored red(R),
 * yellow(Y), blue(B), green(G), and white(W). You also have several balls in
 * your hand.
 * <p>
 * Each time, you may choose a ball in your hand, and insert it into the row
 * (including the leftmost place and rightmost place). Then, if there is a
 * group of 3 or more balls in the same color touching, remove these balls.
 * Keep doing this until no more balls can be removed.
 * <p>
 * Find the minimal balls you have to insert to remove all the balls on the
 * table. If you cannot remove all the balls, output -1.
 * <p>
 * Examples:
 * <p>
 * Input: "WRRBBW", "RB"
 * Output: -1
 * Explanation: WRRBBW -> WRR[R]BBW -> WBBW -> WBB[B]W -> WW
 * <p>
 * Input: "WWRRBBWW", "WRBRW"
 * Output: 2
 * Explanation: WWRRBBWW -> WWRR[R]BBWW -> WWBBWW -> WWBB[B]WW -> WWWW -> empty
 * <p>
 * Input:"G", "GGGGG"
 * Output: 2
 * Explanation: G -> G[G] -> GG[G] -> empty
 * <p>
 * Input: "RBYYBBRRB", "YRBGB"
 * Output: 3
 * Explanation: RBYYBBRRB -> RBYY[Y]BBRRB -> RBBBRRB -> RRRB -> B -> B[B]
 * -> BB[B] -> empty
 * <p>
 * Note:
 * You may assume that the initial row of balls on the table won’t have any 3
 * or more consecutive balls with the same color.
 * The number of balls on the table won't exceed 20, and the string represents
 * these balls is called "board" in the input.
 * The number of balls in your hand won't exceed 5, and the string represents
 * these balls is called "hand" in the input.
 * Both input strings will be non-empty and only contain characters 'R','Y',
 * 'B','G','W'.
 *
 * @author Johnny
 */
public class Solution488 {
    public int findMinStep2(String board, String hand) {
        int[] hands = new int[26];
        for (char c : hand.toCharArray()) {
            hands[c - 'A']++;
        }

        return dfs(board, hands);
    }

    private int dfs(String board, int[] hands) {
        int n = board.length();
        if (n == 0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        int i = 0;
        while (i < board.length()) {
            int j = i;
            while (j < n && board.charAt(i) == board.charAt(j)) {
                j++;
            }
            int b = 3 - (j - i);
            if (hands[board.charAt(i) - 'A'] >= b) { // have sufficient balls on hand
                String nb = board.substring(0, i) + board.substring(j);
                nb = shrink(nb);
                hands[board.charAt(i) - 'A'] -= b;
                int next = dfs(nb, hands);
                if (next >= 0) {
                    ans = Math.min(ans, next + b);
                }

                hands[board.charAt(i) - 'A'] += b;
            }
            i = j;
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }

    private String shrink(String board) {
        int i = 0;
        while (i < board.length()) {
            int j = i;
            while (j < board.length() && board.charAt(i) == board.charAt(j)) {
                j++;
            }
            if (j - i >= 3) {
                board = board.substring(0, i) + board.substring(j);
                i = 0;
            } else {
                i = j;
            }
        }

        return board;
    }

    private int aux(String s, int[] c) {
        if ("".equals(s)) return 0;
//worst case, every character needs 2 characters; plus one to make it impossible, ;-)
        int res = 2 * s.length() + 1;
        for (int i = 0; i < s.length(); ) {
            int j = i++;
            while (i < s.length() && s.charAt(i) == s.charAt(j)) i++;
            int inc = 3 - i + j;
            if (c[s.charAt(j)] >= inc) {
                int used = inc <= 0 ? 0 : inc;
                c[s.charAt(j)] -= used;
                int temp = aux(s.substring(0, j) + s.substring(i), c);
                if (temp >= 0) res = Math.min(res, used + temp);
                c[s.charAt(j)] += used;
            }
        }
        return res == 2 * s.length() + 1 ? -1 : res;
    }

    public int findMinStep(String board, String hand) {
        int[] c = new int[128];
        for (char x : hand.toCharArray()) {
            c[x]++;
        }
        return aux(board, c);
    }
}
