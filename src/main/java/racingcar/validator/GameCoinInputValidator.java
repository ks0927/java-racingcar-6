package racingcar.validator;


public class GameCoinInputValidator implements InputValidator {

    private static final String GAME_COIN_IS_DIGIT = "입력값이 숫자가 아닙니다.";

    @Override
    public void validateInput(String input) {
        keepDigit(input);
    }

    public void keepDigit(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(GAME_COIN_IS_DIGIT);
        }
    }
}
