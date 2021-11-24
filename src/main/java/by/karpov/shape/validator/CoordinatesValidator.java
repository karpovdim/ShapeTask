package by.karpov.shape.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CoordinatesValidator {
    private static final Logger LOGGER = LogManager.getLogger(CoordinatesValidator.class);

    private static final String VALID_DATA = "^-?\\d+(\\.\\d+)?(\\s+-?\\d+(\\.\\d+)?){14}$";

    public static Boolean isValidCoordinates(String data) {
        if (data.matches(VALID_DATA)) {
            return true;
        }
        LOGGER.warn("invalid coordinates: {} ", data);
        return false;
    }
}

