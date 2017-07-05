/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode.common;

/**
 *
 * @author Johnny
 */
public class Point {
    public int x;
    public int y;
    public Point() { x = 0; y = 0; }
    public Point(int a, int b) { x = a; y = b; }
    
    public static Point createInstance(int[] arr) {  
        if (arr == null || arr.length != 2) {
            return null;
        }
        
        return new Point(arr[0], arr[1]);
    }
    
    public static Point[] createList(int[][] arr) {  
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return null;
        }
        
        Point[] res = new Point[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = createInstance(arr[i]);
        }
        
        return res;
    }
    
    public static boolean isSame(Point[] p1, Point[] p2) {
        if (p1 == null && p2 == null) {
            return true;
        }
        if (p1 == null && p2 != null) {
            return false;
        }
        if (p1 != null && p2 == null) {
            return false;
        }
        if (p1.length != p2.length) {
            return false;
        }
        
        for (int i = 0; i < p1.length; i++) {
            if (p1[i].x != p2[i].x || p1[i].y != p2[i].y) {
                return false;
            }
        }
        
        return true;
    }
    
}
