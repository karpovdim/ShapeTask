package by.karpov.shape.create;

import by.karpov.shape.controller.BaseController;
import by.karpov.shape.entity.Point;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.validator.PyramidValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static by.karpov.shape.validator.PointIsNotNull.isNotNull;

public class PyramidCreate {
    private static final Logger logger = LogManager.getLogger();

    public List<Pyramid> getPyramids(PyramidValidator validator, BaseController controller) {
        List<List<Point>> points = controller.getPoints();
        return points.stream()
                .map(list -> create(list, validator))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private Optional<Pyramid> create(List<Point> points, PyramidValidator validator) {
        if (isNotNull(points) && validator.isValid(points)) {
            Pyramid pyramid = new Pyramid(points.get(0), points.get(1), points.get(2), points.get(3), points.get(4));
            logger.log(Level.INFO, String.format("successful creation of a pyramid with %d id", pyramid.getId()));
            return Optional.of(pyramid);
        }
        return Optional.empty();
    }
}
