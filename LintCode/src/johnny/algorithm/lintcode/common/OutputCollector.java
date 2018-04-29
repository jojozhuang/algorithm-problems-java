/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Johnny
 */
public class OutputCollector<K, V> {
    public LinkedHashMap<K, List<V>> map = new LinkedHashMap<K, List<V>>();
    public void collect(K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<V>());
        }
        map.get(key).add(value);
        //map.getOrDefault(key, new ArrayList<V>()).add(value);
    }   
    
    public static <K, V> boolean isSame(OutputCollector<K, V> output1, OutputCollector<K, V> output2) {
        if (output1 == null && output2 == null) {
            return true;
        }
        if (output1 == null && output2 != null) {
            return false;
        }
        if (output1 != null && output2 == null) {
            return false;
        }
        
        if (output1.map.size() != output2.map.size()) {
            return false;
        }
        
        Iterator it1 = output1.map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry entry = (Map.Entry)it1.next();
            if (!output2.map.containsKey(entry.getKey())) {
                return false;
            }
            List list1 = (List)entry.getValue();
            List list2 = (List)output2.map.get(entry.getKey()); 
            
            if(!list1.containsAll(list2) || !list2.containsAll(list1)) {
                return false;
            }
        }
        
        return true;
    }
}
