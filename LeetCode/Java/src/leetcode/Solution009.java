/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Palindrome Number 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author Johnny
 */
public class Solution009 {
    public boolean isPalindrome(int x) {
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
   
        if(x<0) {
            return false;
        }
        
        if (x < 10)
            return true;
        else if (x<100) {
            if (x /10 == x % 10)
                return true;
            else
                return false;
        }
        else {
            int first = x / getUnit(getLength(x));
            int last = getRemainder(x);
            if (first != last)
                return false;

            int next = x % getUnit(getLength(x));
            //check in case 0 existing, eg.10041
             int gap = getLength(x) - getLength(next);
            if (gap == 1) { //first number is not followed by zero, eg. 121
                next = next - last;
                next = next /10;
                return isPalindrome(next);
            }
            else { // gap > 1, 2=>0, 3=>00, 4=000, ...               
                if (next < 10) //eg. 1001
                    return isPalindrome(next);
                else { //eg. 10041, 1004001
                    next = next - last; //eg. next = 41-1
                    if (next % getUnit(gap) == 0)
                        return isPalindrome(next/getUnit(gap));
                    else
                        return false;
                }
            }
        }
    }
    
    private int getLength(int org) {
        if (org >= 1000000000)
            return 9;
        else if (org >= 100000000)
            return 8;
        else if (org >= 10000000)
            return 7;
        else if (org >= 1000000)
            return 6;
        else if (org >= 100000)
            return 5;
        else if (org >= 10000)
            return 4;
        else if (org >= 1000)
            return 3;
        else if (org >= 100)
            return 2;
        else if (org >= 10)
            return 1;
        else
            return 0;
    }
    private int getUnit(int length) {
        int num = 1;
        for(int i=0; i<length; i++) {
            num = num * 10;
        }
        return num;
    }
            
    private int getRemainder(int org){
        int remainder = org;
        do {
            remainder = remainder % getUnit(getLength(remainder));
        }while(getLength(remainder)>0);
        return remainder;        
    }
}
