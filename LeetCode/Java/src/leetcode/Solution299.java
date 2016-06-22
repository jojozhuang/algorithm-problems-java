/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Bulls and Cows.
 * 
 * You are playing the following Bulls and Cows game with your friend: You write 
 * down a number and ask your friend to guess what the number is. Each time your 
 * friend makes a guess, you provide a hint that indicates how many digits in 
 * said guess match your secret number exactly in both digit and position 
 * (called "bulls") and how many digits match the secret number but locate in the 
 * wrong position (called "cows"). Your friend will use successive guesses and 
 * hints to eventually derive the secret number.
 * 
 * For example:
 * 
 * Secret number:  "1807"
 * Friend's guess: "7810"
 * Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
 * Write a function to return a hint according to the secret number and friend's
 * guess, use A to indicate the bulls and B to indicate the cows. In the above 
 * example, your function should return "1A3B".
 * 
 * 
 * Please note that both secret number and friend's guess may contain duplicate digits, for example:
 * 
 * Secret number:  "1123"
 * Friend's guess: "0111"
 * In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
 * You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 * 
 * @author Johnny
 */
public class Solution299 {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int bulls = 0;
        int cows = 0;
        if (n != 0) {
            int[] counts = new int[10];
            char[] sVal = secret.toCharArray();
            for (char ch : sVal) {
                counts[ch - '0']++;
            }
            char[] gVal = guess.toCharArray();
            for (char ch : gVal) {
                int idx = ch - '0';
                if (counts[idx] > 0) {
                    counts[idx]--;
                    cows++;
                }
            }

            for (int i = 0; i < n; i++) {
                if (sVal[i] == gVal[i]) {
                    cows--;
                    bulls++;
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
    public String getHint2(String secret, String guess) {
        if (secret == null || secret.isEmpty() || guess == null || guess.isEmpty() || secret.length() != guess.length()) {
            return "0A0B";
        }
        
        // Get count of each character
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < guess.length(); i++) {
            if (!map.containsKey(guess.charAt(i))) {
                map.put(guess.charAt(i), 1);
            } else {
                map.put(guess.charAt(i), map.get(guess.charAt(i)) + 1);
            }
        }
        
        // Get bulls
        int bulls = 0;
        Set<Integer> keys = new HashSet<Integer>();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                keys.add(i);
                map.put(secret.charAt(i), map.get(secret.charAt(i)) - 1);
            }        
        }
        
        // Get cows
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (keys.contains(i)) {
                continue;
            }
            if (map.containsKey(secret.charAt(i))) {
                int count = map.get(secret.charAt(i));
                if (count > 0) {
                    cows++;
                    count--;
                    map.put(secret.charAt(i), count);
                }
            }
        }
        
        return String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }
}
