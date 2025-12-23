package main.java.com.christmas.movie.recommender;

public interface RecommendationRule {
    Genre recommend(UserProfile profile);
}

