package by.karpov.shape.validator;

import by.karpov.shape.entity.Point;
import by.karpov.shape.entity.Pyramid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static by.karpov.shape.util.Utility.getSizeLine;


public class PyramidValidator implements ShapeValidator {
    private static final Logger LOGGER = LogManager.getLogger(PyramidValidator.class);
    private static final Integer VALID_COUNT_POINTS = 5;

    @Override
    public boolean isValid(List<Point> points) {
        return countPointsIsValid(points) && sizeSideIsValid(points) && sizeDiagonalIsValid(points) && vertexIsValid(points);
    }

    private boolean countPointsIsValid(List<Point> points) {
        if (VALID_COUNT_POINTS.equals(points.size())) {
            return true;
        }
        LOGGER.warn("pyramid must have {} vertex ", VALID_COUNT_POINTS);
        return false;
    }

    private boolean sizeDiagonalIsValid(List<Point> points) {
        if (getSizeLine(points.get(0), points.get(2)) == (getSizeLine(points.get(1), points.get(3)))) {
            return true;
        }
        LOGGER.warn("The pyramid must have a base with The same diagonals");
        return false;
    }

    private boolean sizeSideIsValid(List<Point> points) {
        if (getSizeLine(points.get(0), points.get(1)) == (getSizeLine(points.get(1), points.get(3)))
                && getSizeLine(points.get(1), points.get(3)) == (getSizeLine(points.get(3), points.get(2)))) {
            return true;
        }
        LOGGER.warn("The pyramid must have a base with The same sides");
        return false;
    }

    private boolean vertexIsValid(List<Point> points) {
        if (getSizeLine(points.get(4), points.get(0)) == (getSizeLine(points.get(4), points.get(1)))
                && getSizeLine(points.get(4), points.get(1)) == (getSizeLine(points.get(4), points.get(2)))
                && getSizeLine(points.get(4), points.get(2)) == (getSizeLine(points.get(4), points.get(3)))) {
            return true;
        }
        LOGGER.warn("The pyramid must have a side faces The same length");
        return false;
    }

    public static Boolean pyramidIsNotNull(Pyramid pyramid) {
        return pyramid != null;

    }
}
