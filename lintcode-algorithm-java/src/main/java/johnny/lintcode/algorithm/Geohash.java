package johnny.lintcode.algorithm;

/**
 * Geohash.
 *
 * Geohash is a hash function that convert a location coordinate pair into a base32 string.
 *
 * Check how to generate geohash on wiki: Geohash or just google it for more details.
 *
 * Try http://geohash.co/.
 *
 * You task is converting a (latitude, longitude) pair into a geohash string.
 *
 * 1 <= precision <=12
 *
 * Have you met this question in a real interview?
 * Example
 * Example1
 *
 * Input:
 * lat = 39.92816697
 * lng = 116.38954991
 * precision = 12
 * Output: "wx4g0s8q3jf9"
 * Example2
 *
 * Input:
 * lat = -90
 * lng = 180
 * precision = 12
 * Output: "pbpbpbpbpbpb"
 *
 */
public class Geohash {
    /**
     * @param latitude, longitude a location coordinate pair
     * @param precision an integer between 1 to 12
     * @return a base32 string
     */
    public String encode(double latitude, double longitude, int precision) {
        String _base32 = "0123456789bcdefghjkmnpqrstuvwxyz";
        String lat_bin = getBin(latitude, -90, 90);
        String lng_bin = getBin(longitude, -180, 180);

        StringBuffer hash = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 30; ++i) {
            sb.append(lng_bin.charAt(i));
            sb.append(lat_bin.charAt(i));
        }

        for (int i = 0; i < 60; i += 5) {
            int index = b2i(sb.substring(i, i + 5));
            hash.append(_base32.charAt(index));
        }
        return hash.substring(0, precision);
    }

    private int b2i(String bin) {
        return Integer.parseInt(bin, 2);
    }

    private String getBin(double value, double left, double right) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 30; ++i) {
            double mid = left + (right - left) / 2.0;
            if (value > mid) {
                left = mid;
                sb.append("1");
            } else {
                right = mid;
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
