package baseball.constant;

public enum RequestMessage {
    REQUEST_THREE_NUMBER("숫자를 입력해주세요 : "),
    REQUEST_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private String message;

    RequestMessage(String s) {
        message = s;
    }

    public String getValue() {
        return message;
    }
}
