// 장르 코드, 장르 매칭 클래스

public enum Genre {
    ROMANCE("G1", "로맨스"),
    HORROR("G2", "공포"),
    ACTION("G3", "액션"),
    COMEDY("G4", "코미디"),
    ANIMATION("G5", "애니메이션"),
    FANTASY("G6", "판타지"),
    FAMILY("G7", "가족"),
    MYSTERY("G8", "미스터리/스릴러"),
    MUSICAL("G9", "뮤지컬"),
    HEALING("G10", "힐링");

    private final String code;
    private final String displayName;

    Genre(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public String getCode() { return code; }
    public String getDisplayName() { return displayName; }

    public static Genre fromCode(String code) {
        for (Genre g : values()) {
            if (g.code.equalsIgnoreCase(code)) return g;
        }
        throw new IllegalArgumentException("Unknown genre code: " + code);
    }
}