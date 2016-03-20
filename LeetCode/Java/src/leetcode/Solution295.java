/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Median from Data Stream.
 * 
 * Median is the middle value in an ordered integer list. If the size of the 
 * list is even, there is no middle value. So the median is the mean of the two 
 * middle value.
 * 
 * Examples: 
 * [2,3,4] , the median is 3
 * 
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * 
 * Design a data structure that supports the following two operations:
 * 
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * For example:
 * 
 * add(1)
 * add(2)
 * findMedian() -> 1.5
 * add(3) 
 * findMedian() -> 2
 * 
 * @author RZHUANG
 */
public class Solution295 {
    List<Integer> list = new ArrayList<Integer>();
    // Adds a number into the data structure.
    public void addNum(int num) {
        list.add(num);
    }

    // Returns the median of current data stream
    public double findMedian() {
        int len = list.size();
        if (len % 2 == 1) {
            return list.get(len / 2);
        } else {
            int num1 = list.get(len / 2 - 1);
            int num2 = list.get(len / 2);
            return num1 + (double)(num2 - num1) / 2;
        }
    }
}
