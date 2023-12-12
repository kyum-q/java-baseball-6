package baseball.model;

import baseball.constant.PrintMessage;

import java.util.List;

public class User {
    private List<Integer> numbers;
    private int ball, strike;

    public boolean isThreeStrike() {
        return strike == 3;
    }

    public void checkBaseBall(List<Integer> numbers, Computer computer) {
        this.numbers = numbers;

        checkBall(computer);
        checkStrike(computer);
    }

    private void checkBall(Computer computer) {
        ball = 0;
        List<Integer> computerNums = computer.getNumbers();
        for (int i = 0; i < 3; i++) {
            if(computerNums.contains(numbers.get(i)))
                ball++;
        }
    }

    private void checkStrike(Computer computer) {
        strike = 0;
        List<Integer> computerNums = computer.getNumbers();
        for (int i = 0; i < 3; i++) {
            if (computerNums.get(i).equals(numbers.get(i))) {
                strike++;
                ball--;
            }
        }
    }

    @Override
    public String toString() {
        if(ball == 0 && strike == 0) {
            return PrintMessage.PRINT_NOTHING.getValue();
        }

        String message = "";
        if(ball != 0)
            message += ball + "볼 ";
        if(strike != 0)
            message += strike + "스트라이크";

        return message;
    }
}
