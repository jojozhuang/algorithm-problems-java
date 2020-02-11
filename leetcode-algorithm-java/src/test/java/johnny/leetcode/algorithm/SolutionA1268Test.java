package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1268Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("suggestedProducts");
        SolutionA1268 instance = new SolutionA1268();

        String[] products1 = {"mobile","mouse","moneypot","monitor","mousepad"};
        List<String> list11 = Arrays.asList("mobile","moneypot","monitor");
        List<String> list12 = Arrays.asList("mobile","moneypot","monitor");
        List<String> list13 = Arrays.asList("mouse","mousepad");
        List<String> list14 = Arrays.asList("mouse","mousepad");
        List<String> list15 = Arrays.asList("mouse","mousepad");
        List<List<String>> expect1 = new ArrayList<>();
        expect1.add(list11);
        expect1.add(list12);
        expect1.add(list13);
        expect1.add(list14);
        expect1.add(list15);
        List<List<String>> result1 = instance.suggestedProducts(products1, "mouse");
        assertEquals(expect1, result1);

        String[] products2= {"havana"};
        List<String> list21 = Arrays.asList("havana");
        List<String> list22 = Arrays.asList("havana");
        List<String> list23 = Arrays.asList("havana");
        List<String> list24 = Arrays.asList("havana");
        List<String> list25 = Arrays.asList("havana");
        List<String> list26 = Arrays.asList("havana");
        List<List<String>> expect2 = new ArrayList<>();
        expect2.add(list21);
        expect2.add(list22);
        expect2.add(list23);
        expect2.add(list24);
        expect2.add(list25);
        expect2.add(list26);
        List<List<String>> result2 = instance.suggestedProducts(products2, "havana");
        assertEquals(expect2, result2);


        String[] products3 = {"bags","baggage","banner","box","cloths"};
        List<String> list31 = Arrays.asList("baggage","bags","banner");
        List<String> list32 = Arrays.asList("baggage","bags","banner");
        List<String> list33 = Arrays.asList("baggage","bags");
        List<String> list34 = Arrays.asList("bags");
        List<List<String>> expect3 = new ArrayList<>();
        expect3.add(list31);
        expect3.add(list32);
        expect3.add(list33);
        expect3.add(list34);
        List<List<String>> result3 = instance.suggestedProducts(products3, "bags");
        assertEquals(expect3, result3);

        String[] products4 = {"havana"};
        List<List<String>> expect4 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            expect4.add(new ArrayList<>());
        }
        List<List<String>> result4 = instance.suggestedProducts(products4, "tatiana");
        assertEquals(expect4, result4);
    }
}
