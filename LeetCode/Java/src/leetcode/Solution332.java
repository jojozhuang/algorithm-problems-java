/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Reconstruct Itinerary.
 * 
 * Given a list of airline tickets represented by pairs of departure and arrival
 * airports [from, to], reconstruct the itinerary in order. All of the tickets 
 * belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.
 * 
 * Note:
 * If there are multiple valid itineraries, you should return the itinerary that
 * has the smallest lexical order when read as a single string. For example, 
 * the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
 * 
 * All airports are represented by three capital letters (IATA code).
 * You may assume all tickets form at least one valid itinerary.
 * Example 1:
 * tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
 * Return ["JFK", "MUC", "LHR", "SFO", "SJC"].
 * Example 2:
 * tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 * Return ["JFK","ATL","JFK","SFO","ATL","SFO"].
 * Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"]. 
 * But it is larger in lexical order.
 *  
 * @author Johnny
 */
public class Solution332 {
    public List<String> findItinerary(String[][] tickets) {
         LinkedList<String> ret = new LinkedList<String>();
        if (tickets == null || tickets.length == 0 || tickets[0].length == 0) {
            return ret;
        }
        
        Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
        for (String[] ticket: tickets) {
            if (!map.containsKey(ticket[0])) {
                map.put(ticket[0], new PriorityQueue<String>());
            } 
            map.get(ticket[0]).offer(ticket[1]);
        }
        dfs("JFK", ret, map);
        return ret;
    }
    
    private void dfs(String airport, LinkedList<String> list, Map<String, PriorityQueue<String>> map) {
        while (map.containsKey(airport) && !map.get(airport).isEmpty()) {
           dfs(map.get(airport).poll(), list, map);
        }
        list.addFirst(airport);
    }
}
