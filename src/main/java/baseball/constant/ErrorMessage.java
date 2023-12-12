package baseball.constant;

public enum ErrorMessage {
    ERROR_THREE_NUM("1부터 9까지 서로 다른 수 3개를 입력해주세요."),
    ERROR_START_NUM("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private String message;

    ErrorMessage(String s) {
        message = s;
    }

    public String getMessage() {
        return "[ERROR] " + message;
    }
}
