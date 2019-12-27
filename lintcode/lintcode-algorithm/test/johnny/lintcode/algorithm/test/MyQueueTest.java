package johnny.lintcode.algorithm.test;

import johnny.lintcode.algorithm.MyQueue;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class MyQueueTest {

    public MyQueueTest() {
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
     * Test of queue method.
     */
    @Test
    public void testMyQueue1() {
        System.out.println("MyQueue");
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        queue.enqueue(4);
        assertEquals(2, queue.dequeue());
    }

    @Test
    public void testMyQueue2() {
        System.out.println("MyQueue");
        MyQueue queue = new MyQueue();
        queue.enqueue(438);
        assertEquals(438, queue.dequeue());
        queue.enqueue(452);
        queue.enqueue(379);
        queue.enqueue(884);
        queue.enqueue(332);
        queue.enqueue(55);
        assertEquals(452, queue.dequeue());
        queue.enqueue(825);
        assertEquals(379, queue.dequeue());
        assertEquals(884, queue.dequeue());
        assertEquals(332, queue.dequeue());
        assertEquals(55, queue.dequeue());
        queue.enqueue(983);
        assertEquals(825, queue.dequeue());
        assertEquals(983, queue.dequeue());
        queue.enqueue(616);
        queue.enqueue(66);
    }
}
