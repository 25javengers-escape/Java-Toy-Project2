package main.java.com.cristmas.movie.recommender;

public class MovieRecommender {

    private RecommendationRule rule;

    public MovieRecommender(RecommendationRule rule) {
        this.rule = rule;
    }

    public Genre recommendGenre(UserProfile profile) {
        return rule.recommend(profile);
    }
}
