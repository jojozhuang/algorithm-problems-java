package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MonochromeScreenTest extends JunitBase {

    @Test
    public void testRrawHorizontalLine() {
        System.out.println("drawHorizontalLine");
        MonochromeScreen instance = new MonochromeScreen();

        int[] screen1 = new int[]{0};
        int[] expect1 = new int[]{255};
        instance.drawHorizontalLine(screen1, 8, 0,7,0);
        assertArrayEquals(expect1, screen1);

        int[] screen2 = new int[]{0,0,0,0};
        int[] expect2 = new int[]{0,0,7,240};
        instance.drawHorizontalLine(screen2, 16, 5,11,1);
        assertArrayEquals(expect2, screen2);

        int[] screen3 = new int[]{0,0,0,0,0,0,0,0};
        int[] expect3 = new int[]{1,255,255,224,0,0,0,0};
        instance.drawHorizontalLine(screen3, 32, 7,26,0);
        assertArrayEquals(expect3, screen3);

        int[] screen4 = new int[]{0,0,0,0,0,0};
        int[] expect4 = new int[]{0,28,0,0,0,0};
        instance.drawHorizontalLine(screen4, 24, 11,13,0);
        assertArrayEquals(expect4, screen4);

        int[] screen5 = new int[]{8,19,129,198,31,128,254,245,199,63,64,99,12,14,55,122,133,144,166,178,199,255,245,11,31,31,205,155,0,0,0,64,0,0,0,133,0,0,0,0};
        int[] expect5 = new int[]{8,19,129,198,31,128,254,245,199,63,64,99,12,14,55,122,133,144,166,178,199,255,245,11,31,31,255,255,255,255,255,192,0,0,0,133,0,0,0,0};
        instance.drawHorizontalLine(screen5, 64, 13,57,3);
        assertArrayEquals(expect5, screen5);

    }
}
