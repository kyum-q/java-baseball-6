package baseball.validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersValidator {
    private List<Integer> lists;

    public boolean valid(String s) {
        return validNotNumber(s) && validThreeNumber(s) && validOverlapNumbers(lists);
    }

    private boolean validNotNumber(String s) {
        try {
            int numbers = Integer.parseInt(s);

            if(numbers <= 100 || numbers >= 999) {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e) {
              return false;
          }
        return true;
    }

    private boolean validThreeNumber(String s) {
        try {
            lists = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                lists.add(s.charAt(i) - '0');
            }
        }
        catch(IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    private boolean validOverlapNumbers(List<Integer> lists) {
        try {
            if(lists.stream().distinct().count() != lists.stream().count())
                throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public List<Integer> getLists() {
        return Collections.unmodifiableList(lists);
    }
}
