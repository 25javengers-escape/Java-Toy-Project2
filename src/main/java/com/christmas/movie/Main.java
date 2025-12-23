package com.christmas.movie;

import com.christmas.movie.movie.*;
import com.christmas.movie.recommender.*;
import com.christmas.movie.survey.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // 1. 설문 진행 (A)
        // ==============================
        Survey survey = new Survey();
        survey.start();

        Answer answer = survey.getAnswer();

        // ==============================
        // 2. Answer → UserProfile 변환 (B)
        // ==============================
        UserProfile profile = new UserProfile();

        for (Map.Entry<String, Integer> entry : answer.getGenreScores().entrySet()) {
            Genre genre = Genre.fromCode(entry.getKey());
            profile.addScore(genre, entry.getValue());
        }

        // ==============================
        // 3. 추천 장르 결정 (B)
        // ==============================
        RecommendationRule rule = new TopOneGenreRule();
        MovieRecommender recommender = new MovieRecommender(rule);

        Genre topGenre = recommender.recommendGenre(profile);
        List<Genre> topGenres = List.of(topGenre);

        // ==============================
        // 4. 영화 조회 (C)
        // ==============================
        MovieRepository repository = new MovieRepository();

        List<Movie> moviesByGenre = repository.findByGenre(topGenre);
        Collections.shuffle(moviesByGenre);

        List<Movie> top3Movies = moviesByGenre.stream()
                .limit(3)
                .collect(Collectors.toList());

        // ==============================
        // 5. 결과 출력 (C)
        // ==============================
        ResultPrinter printer = new ResultPrinter();
        printer.printTop3Result(topGenres, top3Movies);
    }
}
