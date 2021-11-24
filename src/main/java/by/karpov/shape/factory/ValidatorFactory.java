package by.karpov.shape.factory;

import by.karpov.shape.entity.Shape;
import by.karpov.shape.validator.PyramidValidator;
import by.karpov.shape.validator.ShapeValidator;

public class ValidatorFactory {
    public static <T extends Shape> ShapeValidator getValidator(Class<T> type) {
        return new PyramidValidator();
    }//todo : switch case


}
