package by.karpov.shape.validator;

public class CoordinatesValidator {
    private static final String VALID_DATA = "^-?\\d+(\\.\\d+)?(\\s+-?\\d+(\\.\\d+)?){14}$";
    public static Boolean dataISValid(String data) {
        return data.matches(VALID_DATA);
    }
}
