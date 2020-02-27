package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ConnectingGraphTest extends JunitBase {

    /**
     * Test of connect method, of class ConnectingGraph.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        ConnectingGraph instance = new ConnectingGraph(4);
        //Test loop
        instance.connect(1, 2);
        instance.connect(2, 3);
        instance.connect(1, 3);
        assertEquals(true, instance.query(3, 1));
        assertEquals(false, instance.query(1, 4));
    }

    /**
     * Test of query method, of class ConnectingGraph.
     */
    @Test
    public void testQuery() {
        System.out.println("query");
        ConnectingGraph instance = new ConnectingGraph(5);

        assertEquals(false, instance.query(1, 2));
        instance.connect(1, 2);
        assertEquals(true, instance.query(1, 2));
        assertEquals(false, instance.query(1, 3));
        instance.connect(2, 4);
        assertEquals(true, instance.query(1, 4));
        
        instance = new ConnectingGraph(9);
        instance.connect(5, 9);
        //assertEquals(false, instance.query(8, 9));
        //instance.connect(2, 3);
        assertEquals(true, instance.query(9, 5));
    }
}
