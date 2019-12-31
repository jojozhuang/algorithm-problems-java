package johnny.leetcode.algorithm.common;

import java.util.List;

/**
 *
 * @author Johnny
 */
public class Point implements Comparable<Point> {
    public int x;
    public int y;
    public Point() { x = 0; y = 0; }
    public Point(int a, int b) { x = a; y = b; }
    
    public static Point[] buildArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        

        Point[] points = new Point[arr.length];
        for (int i = 0; i < arr.length; i++) {
            points[i] = new Point(arr[i][0], arr[i][1]);
        }
        
        return points;
    }

    public static List<Point> buildList(int[][] arr) {
        Point[] points = buildArray(arr);
        return ListUtil.buildList(points);
    }

    @Override
    public String toString() {
        return "["+ x + "," + y + "]";
    }
    @Override
    public int compareTo(Point other){
        if (this.x == other.x) {
            return this.y - other.y;
        }
        return this.x - other.x;
    }
    
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of ListNode or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Point)) {
            return false;
        }
         
        // typecast o to ListNode so that we can compare data members 
        Point point = (Point) o;
         
        // Compare the data members and return accordingly 
        return point.x == this.x && point.y == this.y;
    }
}
