package main.java.com.cristmas.movie.recommender;

import java.util.*;

public class TopOneGenreRule implements RecommendationRule {

    @Override
    public Genre recommend(UserProfile profile) {
        return profile.getScores().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(Genre.HEALING);
    }
}
