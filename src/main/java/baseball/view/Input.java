package baseball.view;

import baseball.constant.ErrorMessage;
import baseball.constant.RequestMessage;
import baseball.validator.NumbersValidator;
import baseball.validator.ReStartValidator;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    private NumbersValidator numValidator;
    private ReStartValidator reStartValidator;
    public Input() {
        numValidator = new NumbersValidator();
        reStartValidator = new ReStartValidator();
    }

    public List<Integer> inputUserNumbers() {
        String printMessage = RequestMessage.REQUEST_THREE_NUMBER.getValue();
        String input;
        do {
            System.out.print(printMessage);

            input = Console.readLine();
            printMessage = ErrorMessage.ERROR_THREE_NUM.getMessage();
        } while(!numValidator.valid(input));

        return numValidator.getLists();
    }

    public int inputUserEnding() {
        String printMessage = RequestMessage.REQUEST_RESTART.getValue();
        String input;
        do {
            System.out.println(printMessage);

            input = Console.readLine();
            printMessage = ErrorMessage.ERROR_START_NUM.getMessage();
        } while(!reStartValidator.valid(input));

        return reStartValidator.getNumber();
    }
}
