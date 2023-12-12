package baseball.view;

import baseball.constant.PrintMessage;
import baseball.model.User;

public class Output {
    public void gameStartOutput() {
        System.out.println(PrintMessage.PRINT_GAME_START.getValue());
    }

    public void gameResultOutput(User user) {
        System.out.println(user.toString());
    }

    public void gameEndOutput() {
        System.out.println(PrintMessage.PRINT_GAME_END.getValue());
    }

}
