package A;

import java.util.Map;

public class Question {

    private int number;
    private String text;
    private Map<Character, String> options;
    private Map<Character, Map<String, Integer>> scoreMap;

    public Question(int number, String text,
                    Map<Character, String> options,
                    Map<Character, Map<String, Integer>> scoreMap) {
        this.number = number;
        this.text = text;
        this.options = options;
        this.scoreMap = scoreMap;
    }

    public void printQuestion() {
        System.out.println("\nQ" + number + ". " + text);
        for (Map.Entry<Character, String> entry : options.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public boolean isValidChoice(char choice) {
        return options.containsKey(choice);
    }

    public Map<String, Integer> getScoreByChoice(char choice) {
        return scoreMap.get(choice);
    }

    public int getNumber() {
        return number;
    }
}
