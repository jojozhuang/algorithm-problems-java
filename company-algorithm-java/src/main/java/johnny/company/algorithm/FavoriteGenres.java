package johnny.company.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Favorite Genres
 *
 * Given a map Map<String, List<String>> userSongs with user names as keys and a list of all the songs that the user has listened to as values.
 *
 * Also given a map Map<String, List<String>> songGenres, with song genre as keys and a list of all the songs within that genre as values. The song can only belong to only one genre.
 *
 * The task is to return a map Map<String, List<String>>, where the key is a user name and the value is a list of the user's favorite genre(s). Favorite genre is the most listened to genre. A user can have more than one favorite genre if he/she has listened to the same number of songs per each of the genres.
 *
 * Example 1:
 *
 * Input:
 * userSongs = {
 *    "David": ["song1", "song2", "song3", "song4", "song8"],
 *    "Emma":  ["song5", "song6", "song7"]
 * },
 * songGenres = {
 *    "Rock":    ["song1", "song3"],
 *    "Dubstep": ["song7"],
 *    "Techno":  ["song2", "song4"],
 *    "Pop":     ["song5", "song6"],
 *    "Jazz":    ["song8", "song9"]
 * }
 *
 * Output: {
 *    "David": ["Rock", "Techno"],
 *    "Emma":  ["Pop"]
 * }
 *
 * Explanation:
 * David has 2 Rock, 2 Techno and 1 Jazz song. So he has 2 favorite genres.
 * Emma has 2 Pop and 1 Dubstep song. Pop is Emma's favorite genre.
 * Example 2:
 *
 * Input:
 * userSongs = {
 *    "David": ["song1", "song2"],
 *    "Emma":  ["song3", "song4"]
 * },
 * songGenres = {}
 *
 * Output: {
 *    "David": [],
 *    "Emma":  []
 * }
 *
 * https://leetcode.com/discuss/interview-question/373006
 */
public class FavoriteGenres {
    public Map<String, List<String>> favoriteGenre(Map<String, List<String>> userMap,
                                                   Map<String, List<String>> genreMap) {
        // build map between song and genre
        Map<String, String> mapSong = new HashMap<>(); // <Song, Genre>
        for (Map.Entry<String, List<String>> entry : genreMap.entrySet()) {
            for (String song : entry.getValue()) {
                if (!mapSong.containsKey(song)) {
                    mapSong.put(song, entry.getKey());
                }
            }
        }

        Map<String, List<String>> ans = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : userMap.entrySet()) {
            // Count genre with songs
            Map<String, Integer> count = new HashMap<>(); // <Genre, Count>
            for (String song : entry.getValue()) {
                if (mapSong.containsKey(song)) {
                    String genre = mapSong.get(song);
                    count.put(genre, count.getOrDefault(genre, 0) + 1);
                }
            }

            // find the maximum count
            int max = 0;
            List<String> list = new ArrayList<>();
            for (Map.Entry<String, Integer> entry2 : count.entrySet()) {
                if (entry2.getValue() > max) {
                    list.clear();
                    list.add(entry2.getKey());
                    max = entry2.getValue();
                } else if (entry2.getValue() == max) {
                    list.add(entry2.getKey());
                }
            }

            ans.put(entry.getKey(), list);
        }

        return ans;
    }
}
