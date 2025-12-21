package A;

import java.util.HashMap;
import java.util.Map;

public class Answer {

    private Map<Integer, Character> answers = new HashMap<>();
    private Map<String, Integer> genreScores = new HashMap<>();

    public Answer() {
        // G1 ~ G10 초기화
        for (int i = 1; i <= 10; i++) {
            genreScores.put("G" + i, 0);
        }
    }

    public void recordAnswer(int questionNumber, char choice) {
        answers.put(questionNumber, choice);
    }

    public void addScores(Map<String, Integer> scores) {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            genreScores.put(
                    entry.getKey(),
                    genreScores.get(entry.getKey()) + entry.getValue()
            );
        }
    }

    public Map<String, Integer> getGenreScores() {
        return genreScores;
    }

    public void printResult() {
        System.out.println("\n🎄 설문 결과 (장르 점수)");
        for (Map.Entry<String, Integer> entry : genreScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
