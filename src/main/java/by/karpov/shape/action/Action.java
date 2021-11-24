package by.karpov.shape.action;

import by.karpov.shape.entity.Parameters;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.entity.Shape;

import java.util.Optional;
import java.util.OptionalDouble;

public interface Action {
Parameters calculate(Shape shape);
}
