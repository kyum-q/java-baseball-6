package baseball.view;

import baseball.constant.ErrorMessage;
import baseball.constant.RequestMessage;
import baseball.validator.NumbersValidator;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    private NumbersValidator numValidator;
    public Input() {
        numValidator = new NumbersValidator();
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
}
