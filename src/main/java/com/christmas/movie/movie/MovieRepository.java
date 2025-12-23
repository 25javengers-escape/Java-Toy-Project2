// 영화 목록 관리 클래스

package com.christmas.movie.movie;

import java.util.*;
import java.util.stream.Collectors;

public class MovieRepository {
    private final List<Movie> movies = new ArrayList<>();

    public MovieRepository() {
        seed();
    }

    private void seed() {
        // 로맨스
        add("러브액츄얼리", Genre.ROMANCE);
        add("라스트 크리스마스", Genre.ROMANCE);
        add("핫 스노우맨", Genre.ROMANCE);
        add("다음 크리스마스에 만나요", Genre.ROMANCE);
        add("마이 시크릿 산타", Genre.ROMANCE);
        add("러브어페어", Genre.ROMANCE);

        // 코미디
        add("나홀로집에", Genre.COMEDY, Genre.FAMILY);
        add("그저 평범한 크리스마스", Genre.COMEDY);
        add("크리스마스 풀 오브 그레이스", Genre.COMEDY);
        add("딜리버리 바이 크리스마스", Genre.COMEDY);
        add("나이자 크리스마스", Genre.COMEDY);
        add("베스트 맨 홀리데이", Genre.COMEDY);

        // 공포
        add("예고살인자", Genre.HORROR);
        add("블랙 크리스마스", Genre.HORROR);
        add("크리스마스 호러 스토리", Genre.HORROR);
        add("고요한 밤 죽음의 밤", Genre.HORROR);
        add("크리스마스 블러디 크리스마스", Genre.HORROR);

        // 애니메이션
        add("아더 크리스마스", Genre.ANIMATION, Genre.FAMILY);
        add("미키의 크리스마스 캐럴", Genre.ANIMATION, Genre.FAMILY);
        add("겨울왕국", Genre.ANIMATION, Genre.FAMILY);
        add("그런치", Genre.ANIMATION, Genre.FAMILY);
        add("수퍼 소닉3", Genre.ANIMATION, Genre.ACTION);

        // 액션
        add("바이올런트 나이트", Genre.ACTION);
        add("나쁜 산타", Genre.ACTION);
        add("패밀리 플랜2", Genre.ACTION);

        // 뮤지컬
        add("저니 투 베들레헴", Genre.MUSICAL);
        add("스크루지: 크리스마스 캐럴", Genre.MUSICAL);
        add("돌리 파튼의 크리스마스 온 더 스퀘어", Genre.MUSICAL);
        add("크리스마스 스피릿", Genre.MUSICAL);

        // 판타지
        add("스노우 시스터", Genre.FANTASY);
        add("크리스마스 스타", Genre.FANTASY);

        // 힐링
        add("패밀리맨", Genre.HEALING);
        add("찰리 브라운의 크리스마스", Genre.HEALING);

        // 미스터리/스릴러
        add("크리스마스 미스터리", Genre.MYSTERY);
        add("캐리온", Genre.MYSTERY);

        // 가족
        add("겨울왕국", Genre.FAMILY);
        add("나홀로집에", Genre.FAMILY);
        add("노엘", Genre.FAMILY);
    }

    private void add(String title, Genre... genres) {
        movies.add(Movie.of(title, genres));
    }

    public List<Movie> findAll() {
        return Collections.unmodifiableList(movies);
    }

    public List<Movie> findByGenre(Genre genre) {
        return movies.stream()
                .filter(m -> m.hasGenre(genre))
                .collect(Collectors.toList());
    }
}