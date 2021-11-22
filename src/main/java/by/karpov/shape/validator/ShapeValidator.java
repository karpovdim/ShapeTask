package by.karpov.shape.validator;

import by.karpov.shape.entity.Point;

import java.util.List;

public interface ShapeValidator {
    boolean isValid(List<Point> points);
}
