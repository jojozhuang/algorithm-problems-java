package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.KClosestPoints;
import johnny.lintcode.algorithm.common.Point;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class KClosestPointsTest {
    
    public KClosestPointsTest() {
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
     * Test of kClosest method, of class KClosestPoints.
     */
    @Test
    public void testKClosest() {
        System.out.println("kClosest");
        KClosestPoints instance = new KClosestPoints();
        Point[] expResult = new Point[0];
        assertArrayEquals(expResult, instance.kClosest(null, null, 0));
        
        Point[] points2 = Point.createList(new int[][]{{4,6},{4,7},{4,4},{2,5},{1,1}});
        Point[] expect2 = Point.createList(new int[][]{{1,1},{2,5},{4,4}});
        Point[] result2 = instance.kClosest(points2, new Point(0,0), 3);
        assertTrue(Point.isSame(expect2, result2));
        
        Point[] points3 = Point.createList(new int[][]{{40,-23},{9,138},{429,115},{50,-17},{-3,80},{-10,33},{5,-21},{-3,80},{-6,-65},{-18,26},{-6,-65},{5,72},{0,77},{-9,86},{10,-2},{-8,85},{21,130},{18,-6},{-18,26},{-1,-15},{10,-2},{8,69},{-4,63},{0,3},{-4,40},{-7,84},{-8,7},{30,154},{16,-5},{6,90},{18,-6},{5,77},{-4,77},{7,-13},{-1,-45},{16,-5},{-9,86},{-16,11},{-7,84},{1,76},{3,77},{10,67},{1,-37},{-10,-81},{4,-11},{-20,13},{-10,77},{6,-17},{-27,2},{-10,-81},{10,-1},{-9,1},{-8,43},{2,2},{2,-21},{3,82},{8,-1},{10,-1},{-9,1},{-12,42},{16,-5},{-5,-61},{20,-7},{9,-35},{10,6},{12,106},{5,-21},{-5,82},{6,71},{-15,34},{-10,87},{-14,-12},{12,106},{-5,82},{-46,-45},{-4,63},{16,-5},{4,1},{-3,-53},{0,-17},{9,98},{-18,26},{-9,86},{2,77},{-2,-49},{1,76},{-3,-38},{-8,7},{-17,-37},{5,72},{10,-37},{-4,-57},{-3,-53},{3,74},{-3,-11},{-8,7},{1,88},{-12,42},{1,-37},{2,77},{-6,77},{5,72},{-4,-57},{-18,-33},{-12,42},{-9,86},{2,77},{-8,77},{-3,77},{9,-42},{16,41},{-29,-37},{0,-41},{-21,18},{-27,-34},{0,77},{3,74},{-7,-69},{-21,18},{27,146},{-20,13},{21,130},{-6,-65},{14,-4},{0,3},{9,-5},{6,-29},{-2,73},{-1,-15},{1,76},{-4,77},{6,-29}});
        Point[] expect3 = Point.createList(new int[][]{{9,98},{6,90},{1,88},{12,106},{12,106},{-10,87},{-9,86},{-9,86},{-9,86},{-9,86},{-8,85},{-7,84},{-7,84},{3,82},{-5,82},{-5,82},{-3,80},{-3,80},{0,77},{0,77},{2,77},{2,77},{2,77},{3,77},{-3,77},{5,77},{-4,77},{-4,77},{1,76},{1,76},{1,76},{-6,77},{-8,77},{-10,77},{3,74},{3,74},{-2,73},{5,72},{5,72},{5,72},{6,71},{8,69},{10,67},{-4,63},{-4,63},{21,130},{21,130},{9,138},{27,146},{-8,43},{-12,42}});
        Point[] result3 = instance.kClosest(points3, new Point(1,99), 51);
        assertTrue(Point.isSame(expect3, result3));
    }
}
