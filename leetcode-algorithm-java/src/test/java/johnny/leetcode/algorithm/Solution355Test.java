package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution355;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution355Test extends JunitBase {

    @Test
    public void testPostTweet() {
        System.out.println("postTweet");

        Solution355 twitter = new Solution355();
        // User 1 posts a new tweet (id = 5).
        twitter.postTweet(1, 5);
        List<Integer> list1 = ListUtil.buildList(new Integer[] {5});
        // User 1's news feed should return a list with 1 tweet id -> [5].
        assertEquals(list1, twitter.getNewsFeed(1));

        // User 1 follows user 2.
        twitter.follow(1, 2);

        // User 2 posts a new tweet (id = 6).
        twitter.postTweet(2, 6);

        // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
        // Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        List<Integer> list2 = ListUtil.buildList(new Integer[] {6,5});
        assertEquals(list2, twitter.getNewsFeed(1));

        // User 1 unfollows user 2.
        twitter.unfollow(1, 2);

        // User 1's news feed should return a list with 1 tweet id -> [5],
        // since user 1 is no longer following user 2.
        List<Integer> list3 = ListUtil.buildList(new Integer[] {5});
        assertEquals(list3, twitter.getNewsFeed(1));
    }
}
