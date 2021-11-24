package by.karpov.shape.factory;

import by.karpov.shape.entity.Point;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.entity.Shape;
import by.karpov.shape.validator.ShapeValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

public final class PyramidFactory {
    private static final PyramidFactory instance = new PyramidFactory();

    private static final Logger LOGGER = LogManager.getLogger(PyramidFactory.class);

    private PyramidFactory() {
    }

    public static <T extends Shape> Optional<T> getShape(Class<T> type, List<Point> points) {

        ShapeValidator validator = ValidatorFactory.getValidator(type);
        if (validator.isValid(points)) {
            return (Optional<T>) createPyramid(points);
        }
        return Optional.empty();
    }

    private static Optional<Pyramid> createPyramid(List<Point> points) {
        Pyramid pyramid = new Pyramid(points.get(0), points.get(1), points.get(2), points.get(3), points.get(4));
        LOGGER.info("successful creation of a pyramid with {} id", pyramid.getPyramidId());
        return Optional.of(pyramid);
    }
}
