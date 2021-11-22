package by.karpov.shape.exception;

import java.io.IOException;

public class PyramidException extends Exception {
    public PyramidException(String msg, IOException exception) {
        super(msg,exception);
    }
    public PyramidException(String msg) {
        super(msg);
    }
}
