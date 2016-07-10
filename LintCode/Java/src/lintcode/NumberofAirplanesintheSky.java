/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lintcode.common.Interval;

/**
 * Number of Airplanes in the Sky.
 * Given an interval list which are flying and landing time of the flight. 
 * How many airplanes are on the sky at most?
 * 
 * Example
 * For interval list
 * 
 * [
 *   [1,10],
 *   [2,3],
 *   [5,8],
 *   [4,7]
 * ]
 * Return 3
 *  
 * @author Johnny
 */
public class NumberofAirplanesintheSky {
    public int countOfAirplanes(List<Interval> airplanes) {
        if (airplanes == null || airplanes.size() == 0) {
            return 0;
        }
        
        List<Point> points = new ArrayList<Point>();
        for (Interval itl: airplanes) {
            points.add(new Point(itl.start, 1));
            points.add(new Point(itl.end, 0));
        }
        Collections.sort(points, new PointComparator());
        
        int max = 0;
        int count = 0;
        for (Point p: points) {
            if (p.flag == 1) {
                count++;
            } else {
                count--;
            }
            max = Math.max(max, count);
        }
        
        return max;
    }
    
    private class Point {
        int time;
        int flag;
        public Point(int time, int flag) {
            this.time = time;
            this.flag = flag;
        }
    }
    
    private class PointComparator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if (p1.time == p2.time) {
                return p1.flag - p2.flag; //end prior to start
            } else {
                return p1.time - p2.time;
            }
        }
    }
}
