package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Cell Compete
 *
 * Eight houses, represented as cells, are arranged in a straight line. Each day every cell competes with its adjacent cells(neighbors). An integer value of 1 represents an active cell and a value of 0 represents an inactive cell. If the neighbors on both the sides of a cell are either active or inactive, the cell becomes inactive on the next day; otherwise the cell becomes active. The two cells on each end have a single adjacent cell, so assume that the unoccupied space on the opposite side is an inactive cell. Even after updating the cell states, consider its previous state when updating the state of other cells. The state information of all cells should be updated simultaneously.
 *
 * Write an algorithm to output the sate of the cells after the given number of days.
 *
 * Input
 * The input to the function/method consists of two arguments:
 * states, a list of integers representing the current sate of cells;
 * days, an integer representing the number of days.
 *
 * Output
 * Return a list of integers representing the state of the cells after the given number of days.
 *
 * Example:
 * Input: states = [1,0,0,0,0,1,0,0], days = 1
 * Output: [0,1,0,0,1,0,1,0]
 *
 * Input: states = [1,1,1,0,1,1,1,1], days = 2
 * Output: [0,0,0,0,0,1,1,0]
 */

public class CellCompete {
    public List<Integer> cellCompete(int[] states, int days)
    {
        List<Integer> ans = new ArrayList<>();
        if (states == null || states.length == 0) {
            return ans;
        }
        if (states.length == 1) {
            ans.add(0);
            return ans;
        }

        int[] arr = new int[states.length];
        for (int i = 0; i < days; i++) {
            arr = new int[states.length];
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    if (states[1] == 1) {
                        arr[j] = 1;
                    }
                } else if (j == states.length - 1) {
                    if (states[states.length - 2] == 1) {
                        arr[j] = 1;
                    }
                } else {
                    if ((states[j - 1] ^ states[j + 1]) == 1) {
                        arr[j] = 1;
                    }
                }
            }
            states = arr;
        }

        for (int num : states) {
            ans.add(num);
        }

        return ans;
    }

}
