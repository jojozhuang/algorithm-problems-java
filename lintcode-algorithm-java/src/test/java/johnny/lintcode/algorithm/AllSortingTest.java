package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Johnny
 */
public class AllSortingTest {
    
    public AllSortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of BubbleSort method, of class AllSorting.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] nums = null;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.BubbleSort(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.BubbleSort(new int[]{2,4,5,7,1,2,3,6}));
    }

    /**
     * Test of InsertSort method, of class AllSorting.
     */
    @Test
    public void testInsertSort() {
        System.out.println("InsertSort");
        int[] nums = null;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.InsertSort(nums);
        assertArrayEquals(expResult, result);
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.InsertSort(new int[]{2,4,5,7,1,2,3,6}));
    }

    /**
     * Test of MergeSort method, of class AllSorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        int[] nums = null;
        int from = 0;
        int to = 0;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.MergeSort(nums, from, to);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.MergeSort(new int[]{2,4,5,7,1,2,3,6}, 0, 7));
    }

    /**
     * Test of SelectionSort method, of class AllSorting.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("SelectionSort");
        int[] nums = null;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.SelectionSort(nums);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.SelectionSort(new int[]{2,4,5,7,1,2,3,6}));
    }

    /**
     * Test of QuickSort method, of class AllSorting.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort");
        int[] nums = null;
        int from = 0;
        int to = 0;
        AllSorting instance = new AllSorting();
        int[] expResult = null;
        int[] result = instance.QuickSort(nums, from, to);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2,2,3,4,5,6,7}, instance.QuickSort(new int[]{2,4,5,7,1,2,3,6}, 0, 7));
    }
    
}
