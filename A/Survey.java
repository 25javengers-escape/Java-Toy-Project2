package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Survey {

    private List<Question> questions = new ArrayList<>();
    private Answer answer = new Answer();
    private InputHandler inputHandler = new InputHandler();

    public Survey() {
        initQuestions();
    }

    public void start() {
        System.out.println("🎄 크리스마스 영화 추천 설문을 시작합니다!");

        for (Question question : questions) {
            question.printQuestion();

            char choice;
            while (true) {
                choice = inputHandler.getChoice();
                if (question.isValidChoice(choice)) break;
                System.out.println("⚠ a~d 중 하나를 선택해주세요.");
            }

            answer.recordAnswer(question.getNumber(), choice);
            answer.addScores(question.getScoreByChoice(choice));
        }

        answer.printResult();
    }

    // 설문 문항 초기화 (Q1 ~ Q10)
    private void initQuestions() {

        // Q1
        questions.add(new Question(
                1,
                "크리스마스를 가장 같이 보내고 싶은 사람은?",
                Map.of(
                        'a', "연인",
                        'b', "가족",
                        'c', "친구",
                        'd', "혼자가 좋다"
                ),
                Map.of(
                        'a', Map.of("G1", 2, "G4", 1),
                        'b', Map.of("G7", 2, "G10", 1),
                        'c', Map.of("G4", 2, "G3", 1),
                        'd', Map.of("G6", 2, "G9", 1)
                )
        ));

        // Q2
        questions.add(new Question(
                2,
                "크리스마스 밤, 이런 장면이 더 끌린다",
                Map.of(
                        'a', "환상적인 세계",
                        'b', "갑작스러운 사건과 반전",
                        'c', "화려한 액션 장면",
                        'd', "따뜻한 대화와 위로"
                ),
                Map.of(
                        'a', Map.of("G5", 2, "G6", 2),
                        'b', Map.of("G8", 2, "G2", 1, "G3", 1),
                        'c', Map.of("G3", 2, "G6", 1),
                        'd', Map.of("G10", 2, "G1", 1, "G7", 1)
                )
        ));

        // Q3
        questions.add(new Question(
                3,
                "크리스마스 영화라면 어떤 요소가 있으면 좋을까?",
                Map.of(
                        'a', "노래와 음악이 많이 나온다",
                        'b', "마법이나 환상적인 설정",
                        'c', "애니메이션 형식",
                        'd', "현실적인 이야기"
                ),
                Map.of(
                        'a', Map.of("G9", 2, "G2", 1),
                        'b', Map.of("G6", 2, "G8", 1),
                        'c', Map.of("G5", 2),
                        'd', Map.of("G10", 1, "G7", 1)
                )
        ));

        // Q4
        questions.add(new Question(
                4,
                "혼자 크리스마스 영화를 본다면?",
                Map.of(
                        'a', "몰입감 있는 스릴러",
                        'b', "아무 생각 없이 웃기는 영화",
                        'c', "감정선이 중요한 영화",
                        'd', "애니메이션 영화"
                ),
                Map.of(
                        'a', Map.of("G8", 2),
                        'b', Map.of("G4", 2),
                        'c', Map.of("G1", 1, "G10", 1),
                        'd', Map.of("G5", 2)
                )
        ));

        // Q5
        questions.add(new Question(
                5,
                "영화에서 가장 싫은 것은?",
                Map.of(
                        'a', "너무 무서운 장면",
                        'b', "전개가 너무 뻔함",
                        'c', "감정이 너무 과함",
                        'd', "분위기가 지나치게 어두움"
                ),
                Map.of(
                        'a', Map.of("G10", 2),
                        'b', Map.of("G8", 2),
                        'c', Map.of("G3", 1, "G4", 1),
                        'd', Map.of("G7", 2)
                )
        ));

        // Q6
        questions.add(new Question(
                6,
                "크리스마스에 더 어울린다고 느끼는 이야기는?",
                Map.of(
                        'a', "오래된 사랑의 재회",
                        'b', "가족 간의 화해",
                        'c', "웃지 못할 해프닝",
                        'd', "조용한 자기 성찰"
                ),
                Map.of(
                        'a', Map.of("G1", 2),
                        'b', Map.of("G7", 2),
                        'c', Map.of("G4", 2),
                        'd', Map.of("G10", 2)
                )
        ));

        // Q7
        questions.add(new Question(
                7,
                "크리스마스 영화에서 긴장감은 어느 정도가 좋을까?",
                Map.of(
                        'a', "거의 없어도 된다",
                        'b', "적당한 반전 정도",
                        'c', "손에 땀을 쥘 정도",
                        'd', "액션 위주의 긴장감"
                ),
                Map.of(
                        'a', Map.of("G10", 2),
                        'b', Map.of("G8", 2),
                        'c', Map.of("G2", 2),
                        'd', Map.of("G3", 2)
                )
        ));

        // Q8
        questions.add(new Question(
                8,
                "이런 크리스마스 영화라면 더 보고 싶다",
                Map.of(
                        'a', "아이들도 함께 볼 수 있는 영화",
                        'b', "상상력이 가득한 세계",
                        'c', "노래가 계속 나오는 영화",
                        'd', "어른들을 위한 현실적인 이야기"
                ),
                Map.of(
                        'a', Map.of("G7", 2),
                        'b', Map.of("G6", 2),
                        'c', Map.of("G9", 2),
                        'd', Map.of("G10", 2)
                )
        ));

        // Q9
        questions.add(new Question(
                9,
                "크리스마스 영화의 결말은?",
                Map.of(
                        'a', "사랑이 이루어지는 해피엔딩",
                        'b', "모두가 웃고 끝나는 결말",
                        'c', "의미 있는 교훈이 남는 결말",
                        'd', "여운과 해석이 남는 결말"
                ),
                Map.of(
                        'a', Map.of("G1", 2),
                        'b', Map.of("G4", 2),
                        'c', Map.of("G7", 1, "G10", 1),
                        'd', Map.of("G8", 2)
                )
        ));

        // Q10
        questions.add(new Question(
                10,
                "당신의 크리스마스 무드에 가장 가까운 것은?",
                Map.of(
                        'a', "설렘",
                        'b', "즐거움",
                        'c', "따뜻함",
                        'd', "평온함"
                ),
                Map.of(
                        'a', Map.of("G1", 3),
                        'b', Map.of("G4", 3),
                        'c', Map.of("G7", 3),
                        'd', Map.of("G10", 3)
                )
        ));
    }
}
