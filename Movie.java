// 영화 제목, 장르 매칭 클래스

import java.util.EnumSet;
import java.util.Set;

public class Movie {
    private final String title;
    private final EnumSet<Genre> genres;

    public Movie(String title, Set<Genre> genres) {
        this.title = title;
        this.genres = (genres instanceof EnumSet)
                ? (EnumSet<Genre>) genres
                : EnumSet.copyOf(genres);
    }

    public String getTitle() { return title; }
    public EnumSet<Genre> getGenres() { return genres; }

    public boolean hasGenre(Genre genre) {
        return genres.contains(genre);
    }

    public static Movie of(String title, Genre... genres) {
        EnumSet<Genre> set = EnumSet.noneOf(Genre.class);
        for (Genre g : genres) set.add(g);
        return new Movie(title, set);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(title).append(" (");
        int i = 0;
        for (Genre g : genres) {
            if (i++ > 0) sb.append(", ");
            sb.append(g.getDisplayName());
        }
        sb.append(")");
        return sb.toString();
    }
}
