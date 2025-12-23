package main.java.com.christmas.movie.recommender;

import java.util.*;

public class UserProfile {

    private EnumMap<Genre, Integer> scores;

    public UserProfile() {
        scores = new EnumMap<>(Genre.class);
        for (Genre g : Genre.values()) {
            scores.put(g, 0);
        }
    }

    // 점수 추가
    public void addScore(Genre genre, int score) {
        scores.put(genre, scores.get(genre) + score);
    }

    // 전체 점수 반환
    public Map<Genre, Integer> getScores() {
        return scores;
    }
}

