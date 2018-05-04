package johnny.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

import johnny.algorithm.leetcode.common.Point;

/**
 * Max Points on a Line.
 * Given n points on a 2D plane, find the maximum number of points that lie 
 * on the same straight line.
 * 
 * @author Johnny
 */
public class Solution149 {
    public int maxPoints(Point[] points) {
        if (points==null) return 0;
        if (points.length<=2) return points.length;
        
        Map<Integer,Map<Integer,Integer>> map = new HashMap<Integer,Map<Integer,Integer>>();
        int result=0;
        for (int i=0;i<points.length;i++){ 
            map.clear();
            int overlap=0,max=0;
            for (int j=i+1;j<points.length;j++){
                int x=points[j].x-points[i].x;
                int y=points[j].y-points[i].y;
                if (x==0&&y==0){
                    overlap++;
                    continue;
                }
                int gcd=generateGCD(x,y);
                if (gcd!=0){
                    x/=gcd;
                    y/=gcd;
                }
                
                if (map.containsKey(x)){
                    if (map.get(x).containsKey(y)){
                        map.get(x).put(y, map.get(x).get(y)+1);
                    }else{
                        map.get(x).put(y, 1);
                    }
                }else{
                    Map<Integer,Integer> m = new HashMap<Integer,Integer>();
                    m.put(y, 1);
                    map.put(x, m);
                }
                max=Math.max(max, map.get(x).get(y));
            }
            result=Math.max(result, max+overlap+1);
        }
        return result;
    }
    private int generateGCD(int a,int b){
        if (b==0) return a;
        else return generateGCD(b,a%b);
    }
    //http://fisherlei.blogspot.com/2013/12/leetcode-max-points-on-line-solution.html
    public int maxPoints2(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        
        int max = 0;
        
        for(int i = 0; i < points.length; i++) {
            int duplicated = 1;
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    duplicated++;
                    continue;
                }
                double slope = 0;
                if (points[i].x == points[j].x) {
                    slope = Integer.MAX_VALUE;
                } else {
                    slope = (double)(points[i].y - points[j].y) / (points[i].x - points[j].x) + 0.0;
                }
                if (!map.containsKey(slope)) {
                    map.put(slope, 1);
                } else {
                    map.put(slope, map.get(slope) + 1);
                }
            }
            int localMax = 0;
            for (Integer count : map.values()) {
                localMax = Math.max(localMax, count);
            }
            localMax += duplicated;
            max = Math.max(max, localMax);
        }
        
        return max;
    }
}
