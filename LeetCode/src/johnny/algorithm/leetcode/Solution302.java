/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Smallest Rectangle Enclosing Black Pixels.
 * 
 * An image is represented by a binary matrix with 0 as a white pixel and 1 as 
 * a black pixel. The black pixels are connected, i.e., there is only one black 
 * region. Pixels are connected horizontally and vertically. Given the location
 * (x, y) of one of the black pixels, return the area of the smallest 
 * (axis-aligned) rectangle that encloses all black pixels.
 * 
 * For example, given the following image:
 * 
 * [
 *   "0010",
 *   "0110",
 *   "0100"
 * ]
 * and x = 0, y = 2, Return 6.
 * 
 * @author Johnny
 */
public class Solution302 {
    //http://www.cnblogs.com/yrbbest/p/5050022.html
    public int minArea(char[][] image, int x, int y) {
        if (image == null || image.length == 0 || image[0].length == 0) {
            return 0;
        }
        
        int m = image.length;
        int n = image[0].length;
        if (x < 0 || x >=m || y < 0 || y >= n) {
            return 0;
        }
        
        int left = searchHorizontal(image, 0, y, true); // find the first 1;
        int right = searchHorizontal(image, y + 1, n, false); // find the last 1;
        int top = searchVertical(image, 0, x, true); // find the first 1;
        int bottom = searchVertical(image, x + 1, m, false); // find the last 1;
        
        //no need to minus 1, because right and bottom is one more large.
        return (right - left) * (bottom - top);
    }
    
    private int searchHorizontal(char[][] image, int low, int high, boolean firstlast) {
        int m = image.length;
        int n = image[0].length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            boolean found = false;
            for (int i = 0; i < m; i++) {
                if (image[i][mid] == '1') {
                    found = true;
                    break;
                }
            }
            if (firstlast) {// search first
                if (found) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            } else {
                if (found) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        // for left, image[i][low] = 1;  for right, image[i][low] = 0;
        return low; 
    }
    private int searchVertical(char[][] image, int low, int high, boolean firstlast) {
        int m = image.length;
        int n = image[0].length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (image[mid][j] == '1') {
                    found = true;
                    break;
                }
            }
            if (firstlast) {// search first
                if (found) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            } else {
                if (found) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        // for top, image[low][j] = 1;  for bottom, image[low][j] = 0;
        return low; 
    }
}
