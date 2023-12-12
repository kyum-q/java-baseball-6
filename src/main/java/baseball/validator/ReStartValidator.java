package baseball.validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReStartValidator {
    private int number;

    public boolean valid(String s) {
        return validNotNumber(s);
    }

    private boolean validNotNumber(String s) {
        try {
            number = Integer.parseInt(s);
            if(number != 1 && number != 2)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public int getNumber() {
        return number;
    }
}