package baseball.controller;

import baseball.model.Computer;
import baseball.model.User;
import baseball.view.Input;
import baseball.view.Output;

import java.util.List;

public class GameController {
    private Input input;
    private Output output;

    public GameController() {
        input = new Input();
        output = new Output();
    }
    public void gameStart() {
        output.gameStartOutput();

        do {
            gamePlay();
        } while(gameRestart());
    }

    private void gamePlay() {
        Computer computer = new Computer();
        User user = new User();
        do {
            List<Integer> numbers = input.inputUserNumbers();
            user.checkBaseBall(numbers, computer);
            output.gameResultOutput(user);
        } while(!user.isThreeStrike());

        output.gameEndOutput();
    }

    private boolean gameRestart() {
        return input.inputUserEnding() == 1;
    }
}
