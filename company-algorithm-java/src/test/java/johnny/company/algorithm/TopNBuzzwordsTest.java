package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopNBuzzwordsTest extends JunitBase {

    @Test
    public void testTopToysList() {
        System.out.println("topToysList");
        TopNBuzzwords instance = new TopNBuzzwords();

        List<String> toys1 = ListUtil.buildList(new String[]{"elmo", "elsa", "legos", "drone", "tablet", "warcraft"});
        List<String> quotes1 = ListUtil.buildList(new String[] {
                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                "The new Elmo dolls are super high quality",
                "Expect the Elsa dolls to be very popular this year, Elsa!",
                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"});
        List<String> expect1 = ListUtil.buildList(new String[] {"elmo", "elsa"}); // Elmo=[4,3], Elsa=[4,2]
        assertEquals(expect1, instance.topToys(6, 2, toys1, 6, quotes1));

        assertEquals(new ArrayList<>(), instance.topToys(6, 2, null, 6, quotes1));
        // assertEquals(new ArrayList<>(), instance.topToys(6, 2, null, 6, null));

        List<String> expect4 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone", "warcraft" });
        assertEquals(expect4, instance.topToys(6, 8, toys1, 6, quotes1));
        List<String> expect5 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone", "warcraft" });
        assertEquals(expect5, instance.topToys(6, 5, toys1, 6, quotes1));
        List<String> expect6 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone", "warcraft" });
        assertEquals(expect6, instance.topToys(6, 4, toys1, 6, quotes1));
        List<String> expect7 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone" });
        assertEquals(expect7, instance.topToys(6, 3, toys1, 6, quotes1));
        List<String> expect8 = ListUtil.buildList(new String[]{"elmo", "elsa"});
        assertEquals(expect8, instance.topToys(6, 2, toys1, 6, quotes1));
        List<String> expect9 = ListUtil.buildList(new String[]{"elmo"});
        assertEquals(expect9, instance.topToys(6, 1, toys1, 6, quotes1));
        List<String> expect10 = ListUtil.buildList(new String[]{});
        assertEquals(expect10, instance.topToys(6, 0, toys1, 6, quotes1));

        List<String> toys2 = ListUtil.buildList(new String[]{"drone", "legos", "warcraft"});
        List<String> quotes2 = ListUtil.buildList(new String[] {
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"});
        List<String> expect22 = ListUtil.buildList(new String[] {"drone"}); // drone=[1,1], legos=[0,0], warcraft=[1,1]
        assertEquals(expect22, instance.topToys(3, 1, toys2, 2, quotes2));

        List<String> expect23 = ListUtil.buildList(new String[] {"drone", "warcraft"});
        assertEquals(expect23, instance.topToys(3, 2, toys2, 2, quotes2));

        List<String> expect24 = ListUtil.buildList(new String[] {"drone", "warcraft"});
        assertEquals(expect24, instance.topToys(3, 3, toys2, 2, quotes2));
    }

    @Test
    public void testTopToys() {
        System.out.println("topToys");
        TopNBuzzwords instance = new TopNBuzzwords();

        String[] toys1 = new String[]{"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
        String[] quotes1 = new String[] {
            "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
            "The new Elmo dolls are super high quality",
            "Expect the Elsa dolls to be very popular this year, Elsa!",
            "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
            "For parents of older kids, look into buying them a drone",
            "Warcraft is slowly rising in popularity ahead of the holiday season"};
        List<String> expect1 = ListUtil.buildList(new String[] {"elmo", "elsa"}); // Elmo=[4,3], Elsa=[4,2]
        assertEquals(expect1, instance.topToys2(6, 2, toys1, 6, quotes1));

        assertEquals(new ArrayList<>(), instance.topToys2(6, 2, null, 6, quotes1));
       // assertEquals(new ArrayList<>(), instance.topToys(6, 2, null, 6, null));

        List<String> expect4 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone", "warcraft" });
        assertEquals(expect4, instance.topToys2(6, 8, toys1, 6, quotes1));
        List<String> expect5 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone", "warcraft" });
        assertEquals(expect5, instance.topToys2(6, 5, toys1, 6, quotes1));
        List<String> expect6 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone", "warcraft" });
        assertEquals(expect6, instance.topToys2(6, 4, toys1, 6, quotes1));
        List<String> expect7 = ListUtil.buildList(new String[]{"elmo", "elsa", "drone" });
        assertEquals(expect7, instance.topToys2(6, 3, toys1, 6, quotes1));
        List<String> expect8 = ListUtil.buildList(new String[]{"elmo", "elsa"});
        assertEquals(expect8, instance.topToys2(6, 2, toys1, 6, quotes1));
        List<String> expect9 = ListUtil.buildList(new String[]{"elmo"});
        assertEquals(expect9, instance.topToys2(6, 1, toys1, 6, quotes1));
        List<String> expect10 = ListUtil.buildList(new String[]{});
        assertEquals(expect10, instance.topToys2(6, 0, toys1, 6, quotes1));

        String[] toys2 = new String[]{"drone", "legos", "warcraft"};
        String[] quotes2 = new String[] {
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"};
        List<String> expect22 = ListUtil.buildList(new String[] {"drone"}); // drone=[1,1], legos=[0,0], warcraft=[1,1]
        assertEquals(expect22, instance.topToys2(3, 1, toys2, 2, quotes2));

        List<String> expect23 = ListUtil.buildList(new String[] {"drone", "warcraft"});
        assertEquals(expect23, instance.topToys2(3, 2, toys2, 2, quotes2));

        List<String> expect24 = ListUtil.buildList(new String[] {"drone", "warcraft"});
        assertEquals(expect24, instance.topToys2(3, 3, toys2, 2, quotes2));
    }

}
