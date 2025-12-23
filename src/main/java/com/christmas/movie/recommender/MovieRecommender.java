package com.christmas.movie.recommender;

import com.christmas.movie.movie.Genre;

public class MovieRecommender {

    private RecommendationRule rule;

    public MovieRecommender(RecommendationRule rule) {
        this.rule = rule;
    }

    public Genre recommendGenre(UserProfile profile) {
        return rule.recommend(profile);
    }
}
