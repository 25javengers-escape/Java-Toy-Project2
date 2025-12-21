public enum Mood {
    EXCITED("설렘"),
    FUN("즐거움"),
    WARM("따뜻함"),
    CALM("평온함");

    private final String displayName;

    Mood(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}