/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author Johnny
 */
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int len = s1.length();
            int x=sc.nextInt();
            
            for (int j = 0; j < 15 - len; j++) {
                s1 += " ";
            }
            System.out.print(s1);
            if (x < 10) {
                System.out.print("00");                
            } else if (x < 100) {
                System.out.print("0");
            }
            System.out.print(x);
            System.out.println();
        }
        System.out.println("================================");
                */
        
        Deque<String> stack = new ArrayDeque<String>();
        Deque<String> queue = new ArrayDeque<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        while (!stack.isEmpty())
          System.out.println(stack.pop() + " ");

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty())
          System.out.println(queue.remove() + " ");
      }
    }
