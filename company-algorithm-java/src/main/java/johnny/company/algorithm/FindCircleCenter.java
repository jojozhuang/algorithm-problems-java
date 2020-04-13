package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Circle Center
 *
 * Given three points on a circle, find the center of the circle.
 *
 * Example:
 * Input: states = [1,0,0,0,0,1,0,0], days = 1
 * Output: [0,1,0,0,1,0,1,0]
 *
 * Input: states = [1,1,1,0,1,1,1,1], days = 2
 * Output: [0,0,0,0,0,1,1,0]
 */

public class FindCircleCenter {
    /*
    //Suppose the center is (x, y), then we have the following equations.
    (x-x1)^2 + (y-y1)^2 = (x-x2)^2 + (y-y2)^2;
    (x-x1)^2 + (y-y1)^2 = (x-x3)^2 + (y-y3)^2;

    //middle of circle1 and circle2
    int x_mid12 = (x1 + x2)/2;
    int y_mid12 = (y1 + y2)/2;

    //middle of circle1 and circle3
    int x_mid13 = (x1 + x3)/2;
    int y_mid13 = (y1 + y3)/2;

    //slope of point1 and point2
    k1 = x1-x2/y1-y2;
    k2 = x1-x3/y1-y3;

    //slope of circle center and perpendicular
    slopeCP12 = x-x_mid12/y-y_mid12;
    slopeCP13 = x-x_mid13/y-y_mid13;

    // the product of slopes of two perpendicular lines is -1
    k1 * slopeCP12 = -1; => k1 * (x-x_mid12/y-y_mid12) = -1 => k1 *(x-x_mid12) = y_mid12 - y; => k2*k1*(x-x_mid12) = k2(y_mid12 - y)
    k2 * slopeCP13 = -1; => k2 * (x-x_mid13/y-y_mid13) = -1 => k2 *(x-x_mid13) = y_mid13 - y; => k1*k2*(x-x_mid13) = k1(y_mid13 - y)

    k1 *(x-x_mid12) = y_mid12 - y; \
                                     => (k1-k2)*x-k1*x_mid12+k2*x_mid13 = y_mid12-y_mid13 => x=(y_mid12-y_mid13+k1*x_mid12-k2*x_mid13)/k1-k2
    k2 *(x-x_mid13) = y_mid13 - y; /

    k1 *(x-x_mid12) = y_mid12 - y; => k2*k1*(x-x_mid12) = k2(y_mid12 - y)\
                                                                          => k2*k1*(-x_mid12+x_mid13)=k2(y_mid12 - y)-k1(y_mid13 - y)
    k2 *(x-x_mid13) = y_mid13 - y; => k1*k2*(x-x_mid13) = k1(y_mid13 - y)/

    => k2*k1*(x_mid13-x_mid12)=k2*y_mid12 - k2*y-k1*y_mid13 + k1*y => y = k2*k1*(x_mid13-x_mid12)-k2*y_mid12+k1*y_mid13/k1-k2

     */
    public double[] circleCenter2(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double a = 2 * (x2 - x1);
        double b = 2 * (y2 - y1);
        double c = x2 * x2 + y2 * y2 - x1 * x1 - y1 * y1;
        double d = 2 * (x3 - x2);
        double e = 2 * (y3 - y2);
        double f = x3 * x3 + y3 * y3 - x2 * x2 - y2 * y2;
        double x = (b * f - e * c) / (b * d - e * a);
        double y = (d * c - a * f) / (b * d - e * a);
        double t = (x - x1) * (x - x1) + (y - y1) * (y - y1);
        double r = Math.sqrt(t);

        return new double[]{x, y};
    }

    public double[] circleCenter(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        // suppose slope exists
        //middle of circle1 and circle2
        double x_mid12 = (double)(x1 + x2)/2;
        double y_mid12 = (double)(y1 + y2)/2;

        //middle of circle1 and circle3
        double x_mid13 = (double)(x1 + x3)/2;
        double y_mid13 = (double)(y1 + y3)/2;

        //slope of point1 and point2
        double k1 = (double)(x1-x2)/(y1-y2); // suppose y1 != y2
        double k2 = (double)(x1-x3)/(y1-y3);

        //k1 *(x-x_mid12) = y_mid12 - y; => y=y_mid12-k1*(x-x_mid12)
        //k2 *(x-x_mid13) = y_mid13 - y; => y=y_mid13-k2*(x-x_mid13)
        //k1 *(x-x_mid12) = y_mid12 - y; => x=(y_mid12 - y + k1*x_mid12)/k1
        //k2 *(x-x_mid13) = y_mid13 - y; => x=(y_mid13 - y + k2*x_mid13)/k2

        double min_x = Math.min(Math.min(x1, x2),x3);
        double max_x = Math.max(Math.max(x1, x2),x3);
        double min_y = Math.min(Math.min(y1, y2),y3);
        double max_y = Math.max(Math.max(y1, y2),y3);

        double min = Double.MAX_VALUE;
        double[] ans = new double[2];
        for (double x = min_x; x <= max_x; x=x+0.05) {
            double y = y_mid12-k1*(x-x_mid12);
            //double yp2 = y_mid13-k2*(x-x_mid13);

            double r1 = (x-x1)*(x-x1) + (y-y1)*(y-y1);
            double r2 = (x-x2)*(x-x2) + (y-y2)*(y-y2);
            double r3 = (x-x3)*(x-x3) + (y-y3)*(y-y3);
            if (r1 == r2 && r2 == r3) {
                return new double[]{x,y};
            }

            double delta = (Math.abs(r1-r2) + Math.abs(r1-r3) + Math.abs(r2-r3))/3;
            if (delta < min) {
                ans[0] = x;
                ans[1] = y;
                min = delta;
            }
        }

        for (double y = min_y; y <= max_y; y=y+0.05) {
            double x = (y_mid12 - y + k1*x_mid12)/k1;
            //double xp2 = (y_mid13 - y + k2*x_mid13)/k2;

            double r1 = (x-x1)*(x-x1) + (y-y1)*(y-y1);
            double r2 = (x-x2)*(x-x2) + (y-y2)*(y-y2);
            double r3 = (x-x3)*(x-x3) + (y-y3)*(y-y3);
            if (r1 == r2 && r2 == r3) {
                return new double[]{x,y};
            }
            double delta = (Math.abs(r1-r2) + Math.abs(r1-r3) + Math.abs(r2-r3))/3;
            if (delta < min) {
                ans[0] = x;
                ans[1] = y;
                min = delta;
            }
        }

        return ans;
    }

}
