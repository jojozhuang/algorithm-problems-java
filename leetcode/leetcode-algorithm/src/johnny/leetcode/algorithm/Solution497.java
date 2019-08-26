package johnny.leetcode.algorithm;

import java.util.Random;

/**
 * 497. Random Point in Non-overlapping Rectangles
Given a list of non-overlapping axis-aligned rectangles rects, write a function pick which randomly and uniformily picks an integer point in the space covered by the rectangles.

Note:

An integer point is a point that has integer coordinates. 
A point on the perimeter of a rectangle is included in the space covered by the rectangles. 
ith rectangle = rects[i] = [x1,y1,x2,y2], where [x1, y1] are the integer coordinates of the bottom-left corner, and [x2, y2] are the integer coordinates of the top-right corner.
length and width of each rectangle does not exceed 2000.
1 <= rects.length <= 100
pick return a point as an array of integer coordinates [p_x, p_y]
pick is called at most 10000 times.
Example 1:

Input: 
["Solution","pick","pick","pick"]
[[[[1,1,5,5]]],[],[],[]]
Output: 
[null,[4,1],[4,1],[3,3]]
Example 2:

Input: 
["Solution","pick","pick","pick","pick","pick"]
[[[[-2,-2,-1,-1],[1,0,3,0]]],[],[],[],[],[]]
Output: 
[null,[-1,-2],[2,0],[-2,-1],[3,0],[-2,-2]]
Explanation of Input Syntax:

The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array of rectangles rects. pick has no arguments. Arguments are always wrapped with a list, even if there aren't any.

 * @author Johnny
 */
public class Solution497 {
    private int[][] rects;
    public Solution497(int[][] rects) {
        this.rects = rects;
    }
    
    public int[] pick() {
        Random random = new Random();
        int index = random.nextInt(rects.length);
        int width = Math.abs(rects[index][2]-rects[index][0]);
        int height = Math.abs(rects[index][3]-rects[index][1]);
        Random random2 = new Random();
        int x = width == 0 ? 0 : rects[index][0] + random2.nextInt(width + 1);
        int y = height == 0 ? 0 : rects[index][1] + random2.nextInt(height + 1);
        System.out.println("x="+x+",y="+y);
        return new int[] {x,y};
    }
}
