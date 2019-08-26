package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution599;

public class Solution599Test extends JunitBase {

    @Test
    public void testFindRestaurant() {
        System.out.println("findRestaurant");
        Solution599 instance = new Solution599();

        assertArrayEquals(new String[]{"abc"}, instance.findRestaurant(new String[]{"abc"}, new String[]{"abc"}));
        assertArrayEquals(new String[]{"cd"}, instance.findRestaurant(new String[]{"abc","cd"}, new String[]{"cd"}));
        assertArrayEquals(new String[]{"ef"}, instance.findRestaurant(new String[]{"ef","cd"}, new String[]{"ef","cd"}));
        assertArrayEquals(new String[]{"ef","wo"}, instance.findRestaurant(new String[]{"ef","wo"}, new String[]{"wo","ef"}));
        assertArrayEquals(new String[]{"Shogun"}, instance.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        assertArrayEquals(new String[]{"Shogun"}, instance.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}));
    }
}
