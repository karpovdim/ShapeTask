package by.karpov.shape.action;

import by.karpov.shape.action.implementation.PyramidAction;
import by.karpov.shape.entity.Shape;

public class ActionFactory {
    public static <T extends Shape> Action getAction(Class<T> type) {
        //todo create switch
        return new PyramidAction();
    }
}
