package main.java.com.christmas.movie.recommender;

public class MovieRecommender {

    private RecommendationRule rule;

    public MovieRecommender(RecommendationRule rule) {
        this.rule = rule;
    }

    public Genre recommendGenre(UserProfile profile) {
        return rule.recommend(profile);
    }
}
