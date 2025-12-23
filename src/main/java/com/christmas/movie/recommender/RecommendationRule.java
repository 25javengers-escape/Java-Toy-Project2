package com.christmas.movie.recommender;

import com.christmas.movie.movie.Genre;

public interface RecommendationRule {
    Genre recommend(UserProfile profile);
}

