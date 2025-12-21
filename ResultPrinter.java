// 추천 결과 출력 클래스

import java.util.List;

public class ResultPrinter {

    public void printTop3Result(List<Genre> topGenres, List<Movie> top3) {
        printHeader(" 크리스마스 영화 추천 결과");
        System.out.println(buildMessage(topGenres, top3));
        printLine();

        if (topGenres != null && !topGenres.isEmpty()) {
            System.out.print("선호 장르: ");
            for (int i = 0; i < topGenres.size(); i++) {
                if (i > 0) System.out.print(" / ");
                System.out.print(topGenres.get(i).getDisplayName());
            }
            System.out.println();
            printLine();
        }

        if (top3 == null || top3.isEmpty()) {
            System.out.println("추천할 영화가 없습니다.");
        } else {
            int limit = Math.min(3, top3.size());
            for (int i = 0; i < limit; i++) {
                System.out.printf("%d. %s%n", i + 1, top3.get(i));
            }
        }

        printFooter();
    }

    private String buildMessage(List<Genre> topGenres, List<Movie> top3) {
        if (topGenres == null || topGenres.isEmpty() || top3 == null || top3.isEmpty()) {
            return "🎄 설문 결과를 바탕으로 크리스마스 영화를 추천했어요.";
        }

        String genreName = topGenres.get(0).getDisplayName();
        String movieTitle = top3.get(0).getTitle();

        return "🎁 " + genreName + " 장르를 좋아하는 당신께, "
                + "\"" + movieTitle + "\"와 함께하는 크리스마스를 추천해요.";
    }

    private void printHeader(String title) {
        System.out.println();
        System.out.println("========================================");
        System.out.println(title);
        System.out.println("========================================");
    }

    private void printFooter() {
        System.out.println("========================================");
        System.out.println("다시 설문을 진행하면 다른 영화도 추천받을 수 있어요.");
        System.out.println("========================================");
        System.out.println();
    }

    private void printLine() {
        System.out.println("----------------------------------------");
    }
}