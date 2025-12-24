# Java-Toy-Project
2025 겨울방학 학습공동체 토이프로젝트

---

# 🎄 Christmas Movie Recommender

크리스마스 분위기에 어울리는 영화를 추천해주는 **설문 기반 콘솔 프로그램**입니다.  
사용자의 선택을 바탕으로 장르 점수를 계산하고, 가장 선호도가 높은 **Top 장르**를 선정하여  
해당 장르의 **영화 TOP 3**를 추천합니다.

설문, 추천 로직, 영화 데이터를 패키지와 클래스 단위로 분리하여  
**확장과 수정이 용이한 구조**로 설계되었습니다.

---

## 🚀 프로그램 흐름
1. 설문 진행  
2. 장르 점수 누적  
3. 선호 장르(Top 1) 선정  
4. 영화 TOP 3 추천  
5. 결과 출력  

---

## 🎯 클래스별 주요 기능

### ▶ Main
- 프로그램의 시작점  
- 설문 → 추천 → 결과 출력까지 전체 실행 흐름 제어  

---

### ▶ survey 패키지 (설문 / 입력 처리)

**Survey**  
- 설문 전체 흐름 관리  
- 질문을 순서대로 출력하고 답변 수집  

**Question**  
- 질문 내용과 선택지(a~d) 관리  
- 선택지별 장르 점수 반환  

**InputHandler**  
- 사용자 입력 처리  
- a~d 이외 입력에 대한 유효성 검사  

**Answer**  
- 사용자의 선택 저장  
- 장르별 점수 누적 관리  

---

### ▶ recommender 패키지 (추천 로직)

**UserProfile**  
- 사용자 장르 선호도 저장 및 조회  

**ScoreCalculator**  
- 설문 답변을 기반으로 장르 점수 계산  

**RecommendationRule**  
- 추천 장르를 결정하는 규칙 인터페이스  

**TopOneGenreRule**  
- 가장 점수가 높은 Top 1 장르 선정  

**MovieRecommender**  
- 추천 규칙을 적용해 최종 추천 장르 결정  

---

### ▶ movie 패키지 (영화 데이터 / 출력)

**Movie**  
- 영화 제목과 장르 정보를 담는 도메인 클래스  

**Genre**  
- 장르 코드와 장르명을 매핑한 enum  

**Mood**  
- 영화 분위기 표현용 enum  

**MovieRepository**  
- 영화 목록 관리  
- 장르별 영화 조회 기능 제공  

**ResultPrinter**  
- 추천 결과 출력  
- 추천 장르와 영화 목록, 안내 문구 출력  

---

## 📂 프로젝트 구조
src/main/java/com/christmas/movie
├─ Main.java
│
├─ movie
│ ├─ Genre.java
│ ├─ Mood.java
│ ├─ Movie.java
│ ├─ MovieRepository.java
│ └─ ResultPrinter.java
│
├─ recommender
│ ├─ MovieRecommender.java
│ ├─ RecommendationRule.java
│ ├─ ScoreCalculator.java
│ ├─ TopOneGenreRule.java
│ └─ UserProfile.java
│
└─ survey
├─ Answer.java
├─ InputHandler.java
├─ Question.java
└─ Survey.java

yaml
코드 복사

---

## 🧪 실행 방법
1. IntelliJ에서 프로젝트 열기  
2. `Main.java` 실행  
3. 질문에 a~d 중 하나 입력  
4. 추천 결과 확인  

---

## 💡 예시 실행 화면
Q1. 크리스마스에 어떤 분위기의 영화를 원하시나요?
입력 > b

Q2. 누구와 함께 보시나요?
입력 > b

🎁 추천 장르 : FAMILY

🎬 추천 영화 TOP 3

Home Alone

The Polar Express

Klaus

yaml
코드 복사

---

## 👤 팀 구성 및 역할
| 이름 | 담당 기능 | 주요 역할 |
|------|----------|----------|
| 박서은 | survey, Main | 설문 흐름 및 전체 실행 관리 |
| 이채연 | recommender | 추천 로직 및 점수 계산 |
| 장은주 | movie | 영화 데이터 관리 및 결과 출력 |

---

## 💬 협업 과정
- 기능별 브랜치에서 작업 후 `main` 브랜치로 Pull Request 병합  
- Pull Request 기반 코드 리뷰 진행
