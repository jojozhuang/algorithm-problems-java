/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java 8.");

        for (String string : strings) {
          System.out.println(string);
        }
        
        //reverse string
        System.out.println(reverse(""));
        System.out.println(reverse("W"));
        System.out.println(reverse("Welcome to coderpad!"));
        
    }
    
    public static String reverse(String str) {
        if (str == null || str.length() == 0) {
          return "";
        }

        int start = 0;
        int end = str.length() - 1;
        char[] chs = str.toCharArray();
        while (start < end) {
          char c = chs[start];
          chs[start] = chs[end];
          chs[end] = c;
          start++;
          end--;
        }

        return new String(chs);
    }  
}
