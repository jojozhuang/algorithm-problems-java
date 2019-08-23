package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1089;

public class SolutionA1089Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("duplicateZeros");
        SolutionA1089 instance = new SolutionA1089();

        int[] arr1 = new int[] {1,0,2,3,0,4,5,0};
        instance.duplicateZeros(arr1);
        assertArrayEquals(new int[] {1,0,0,2,3,0,0,4}, arr1);

        int[] arr2 = new int[] {1,2,3};
        instance.duplicateZeros(arr2);
        assertArrayEquals(new int[] {1,2,3}, arr2);
        
        int[] arr3 = new int[] {8,4,5,0,0,0,0,7};
        instance.duplicateZeros(arr3);
        assertArrayEquals(new int[] {8,4,5,0,0,0,0,0}, arr3);
        
        int[] arr4 = new int[] {1,5,2,0,6,8,0,6,0};
        instance.duplicateZeros(arr4);
        System.out.println(Arrays.toString(arr4));
        assertArrayEquals(new int[] {1,5,2,0,0,6,8,0,0}, arr4);
    }
}
