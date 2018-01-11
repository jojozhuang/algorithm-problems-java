package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution690;
import johnny.algorithm.leetcode.common.Employee;

public class Solution690Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("getImportance");
        Solution690 instance = new Solution690();

        assertEquals(0, instance.getImportance(new ArrayList<Employee>(), 1));
        
        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(new Employee(1, 5, new ArrayList<Integer>()));
        assertEquals(5, instance.getImportance(list1, 1));
        assertEquals(0, instance.getImportance(list1, 2));

        List<Employee> list2 = new ArrayList<Employee>();
        List<Integer> sub2 = new ArrayList<Integer>();
        sub2.add(2);
        list2.add(new Employee(1, 5, sub2));
        list2.add(new Employee(2, 3, new ArrayList<Integer>()));
        assertEquals(8, instance.getImportance(list2, 1));
        assertEquals(3, instance.getImportance(list2, 2));
        assertEquals(0, instance.getImportance(list2, 3));
        
        List<Employee> list3 = new ArrayList<Employee>();
        List<Integer> sub3 = new ArrayList<Integer>();
        sub3.add(2);
        sub3.add(3);
        list3.add(new Employee(1, 5, sub3));
        list3.add(new Employee(2, 3, new ArrayList<Integer>()));
        list3.add(new Employee(3, 3, new ArrayList<Integer>()));
        assertEquals(11, instance.getImportance(list3, 1));
        assertEquals(3, instance.getImportance(list3, 2));
        assertEquals(3, instance.getImportance(list3, 3));
        assertEquals(0, instance.getImportance(list3, 4));
    }

}
