package baseball.constant;

public enum PrintMessage {
    PRINT_GAME_START("숫자 야구 게임을 시작합니다."),
    PRINT_NOTHING("낫싱"),
    PRINT_BALL("볼 "),
    PRINT_STRIKE("스트라이크"),

    PRINT_GAME_END("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private String message;

    PrintMessage(String s) {
        message = s;
    }

    public String getValue() {
        return message;
    }
}
