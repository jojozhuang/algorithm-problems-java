package johnny.company.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FavoriteGenresTest extends JunitBase {

    @Test
    public void testFavoriteGenre() {
        System.out.println("favoriteGenre");
        FavoriteGenres instance = new FavoriteGenres();

        Map<String, List<String>> userMap1 = new HashMap<>();
        userMap1.put("David", Arrays.asList("song1", "song2", "song3", "song4", "song8"));
        userMap1.put("Emma", Arrays.asList("song5", "song6", "song7"));
        Map<String, List<String>> genreMap1 = new HashMap<>();
        genreMap1.put("Rock", Arrays.asList("song1", "song3"));
        genreMap1.put("Dubstep", Arrays.asList("song7"));
        genreMap1.put("Techno", Arrays.asList("song2", "song4"));
        genreMap1.put("Pop", Arrays.asList("song5", "song6"));
        genreMap1.put("Jazz", Arrays.asList("song8", "song9"));
        Map<String, List<String>> expect1 = new HashMap<>();
        expect1.put("David", Arrays.asList("Rock", "Techno"));
        expect1.put("Emma", Arrays.asList("Pop"));
        assertEquals(expect1, instance.favoriteGenre(userMap1, genreMap1));

        Map<String, List<String>> userMap2 = new HashMap<>();
        userMap2.put("David", Arrays.asList("song1", "song2"));
        userMap2.put("Emma", Arrays.asList("song3", "song4"));
        Map<String, List<String>> genreMap2 = new HashMap<>();
        Map<String, List<String>> expect2 = new HashMap<>();
        expect2.put("David", Arrays.asList());
        expect2.put("Emma", Arrays.asList());
        assertEquals(expect2, instance.favoriteGenre(userMap2, genreMap2));
    }
}
