<<<<<<< HEAD
<<<<<<< HEAD
package com.christmas.movie.recommender;

import java.util.*;
import com.christmas.movie.movie.Genre;
=======
package main.java.com.christmas.movie.recommender;

import java.util.*;
>>>>>>> c5376105d07a9f36f1b445fd0d3e6d7fad43bf31
=======
package main.java.com.christmas.movie.recommender;

import java.util.*;
>>>>>>> origin/main

public class TopOneGenreRule implements RecommendationRule {

    @Override
    public Genre recommend(UserProfile profile) {
        return profile.getScores().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(Genre.HEALING);
    }
}
