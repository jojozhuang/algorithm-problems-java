package johnny.company.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Turn-Based Game
 *
 * QW is a player of a turn-based game, and today he decided to kill monsters.
 *
 * QW will fight with n monsters in a battle. Each monster has an attack power atk[i]. If the i-th monster is still alive at the end of each round, it will cause atk[i] damage to the QW. QW can only kill one monster at the beginning of each round. Please calculate how much damage he needs to suffer at least after QW kill all the monsters.
 *
 * n, atk[i] <= 100000
 * The answer may exceed the range of int
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input: atk = [19,3]
 * Output: 3
 * Example 2:
 *
 * Input: atk = [1,3,2,5]
 * Output: 10
 *
 * Input: atk = [13,11,4,19,4,0]
 * Output: 63
 *
 * https://www.lintcode.com/problem/turn-based-game/description
 *
 * Input: atk = [1,3,2,5]
 * Sorted in reverse order: [5,3,2,1]
 * Kill largest in each round.
 * Round 1: kill 5, sum = 3 + 2 + 1 = 6
 * Round 2: kill 3, sum = 2 + 1 + 6 = 9
 * Round 3: kill 2, sum = 1 + 9 = 10
 */
public class TurnBasedGame {
    public long getAns(int[] atk) {
        if (atk == null || atk.length < 2) {
            return 0;
        }

        Integer[] arr = new Integer[atk.length];
        for (int i = 0; i < atk.length; i++) {
            arr[i] = atk[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i * (long)arr[i];
        }

        return sum;
    }
}
