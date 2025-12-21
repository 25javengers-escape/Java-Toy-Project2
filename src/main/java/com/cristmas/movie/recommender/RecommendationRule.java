package main.java.com.cristmas.movie.recommender;

public interface RecommendationRule {
    Genre recommend(UserProfile profile);
}

