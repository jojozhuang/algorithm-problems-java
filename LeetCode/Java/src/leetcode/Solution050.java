/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Pow(x, n).
 * Implement pow(x, n).
 * 
 * @author Johnny
 */
public class Solution050 {
    public double pow(double x, int n) {
        if (x==0)
            return 0;
        if (x==1)
            return 1;
        if (x==-1)
            return n%2==1?-1:1;
        if (n==0)
            return 1;        
        if (n==1)
            return x;
        if (n==-1)
            return 1/x;
        
        double ret=1;
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        int i=1;
        int absn;
        if (n==Integer.MIN_VALUE)
            absn = Integer.MAX_VALUE;
        else
            absn = Math.abs(n);
        double pow=x;
        map.put(i, pow);
        while(i<absn) {
            i = i<<1; //*2
            if (i<absn) {
                double previous = map.get(i>>1);
                pow = previous * previous;
                map.put(i, pow);
                if (pow==0) {
                    if (n<0)
                        return Double.MAX_VALUE;
                    else
                        return 0;
                }                           
            }
            else if (i>absn) {
                int j=absn;
                int k=i;
                while(j>0) {
                    k = k>>1;
                    if(j>=k) {
                        ret = ret*map.get(k);
                        j = j-k;
                    }                    
                }
                break;
            }
            else {
                ret = map.get(i>>1) * map.get(i>>1);
                break;
            }
        }
        
        if (ret==0)
            return 0;
        else{
            if(n<0)
                return 1/ret;
            else
                return ret;
        }
    }    
}
