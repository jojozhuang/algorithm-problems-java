/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;

/**
 * Count Primes.
 * 
 * Description:
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Hint:
 * 
 * Let's start with a isPrime function. To determine if a number is prime, we 
 * need to check if it is not divisible by any number less than n. The runtime 
 * complexity of isPrime function would be O(n) and hence counting the total 
 * prime numbers up to n would be O(n2). Could we do better?
 * 
 * @author Johnny
 */
public class Solution204 {
    public int countPrimes(int n) {
        //n = n - 1;

        ArrayList<Integer> primes = new ArrayList<Integer>();

        if(n <= 1) 
            return 0;
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;

        primes.add(2);
        primes.add(3);

        for(int i = 4; i <= n; i++){
            boolean isPrime = true;
            for(int p: primes){                
                if((i % p) == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primes.add(i);
            }
        }

        return primes.size();
    }
    private int countPrimes2(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        if (n == 2 || n == 3) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
