package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TopKKeywordTest extends JunitBase {

    @Test
    public void testTopKKeywords() {
        System.out.println("TopKKeywords");
        TopKKeywords instance = new TopKKeywords();

        String[] keywords1 = new String[]{"anacell", "cetracular", "betacellular"};
        String[] reviews1 = new String[] {
                "Anacell provides the best services in the city",
                "betacellular has awesome services",
                "Best services provided by anacell, everyone should use anacell"};
        String[] expect1 = new String[] {"anacell", "betacellular"}; // anacell=[2], betacellular=[1]
        //assertArrayEquals(expect1, instance.topKeyword(2, keywords1, reviews1));

        String[] keywords2 = new String[]{"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
        String[] reviews2 = new String[] {
                "I love anacell Best services; Best services provided by anacell",
                "betacellular has great services",
                "deltacellular provides much better services than betacellular",
                "cetracular is worse than anacell",
                "Betacellular is better than deltacellular."};
        String[] expect2 = new String[] {"betacellular", "anacell"}; // betacellular=[3], anacell=[2]
        assertArrayEquals(expect2, instance.topKeyword(2, keywords2, reviews2));

        String[] expect3 = new String[] {"betacellular", "anacell","deltacellular"}; // betacellular=[3], anacell=[2]
        assertArrayEquals(expect3, instance.topKeyword(3, keywords2, reviews2));

    }

}
