package johnny.company.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopNBuzzwordsTest extends JunitBase {

    @Test
    public void testTopNBuzzwords() {
        System.out.println("TopNBuzzwords");
        TopNBuzzwords instance = new TopNBuzzwords();

        String[] toys1 = new String[]{"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
        String[] quotes1 = new String[] {
            "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
            "The new Elmo dolls are super high quality",
            "Expect the Elsa dolls to be very popular this year, Elsa!",
            "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
            "For parents of older kids, look into buying them a drone",
            "Warcraft is slowly rising in popularity ahead of the holiday season"};
        List<String> expect1 = Arrays.asList("elmo", "elsa"); // Elmo=[4,3], Elsa=[4,2]
        assertEquals(expect1, instance.topToys(6, 2, toys1, 6, quotes1));
    }
}
