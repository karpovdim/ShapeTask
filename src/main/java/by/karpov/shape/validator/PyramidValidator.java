package by.karpov.shape.validator;

import by.karpov.shape.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static by.karpov.shape.utils.Utility.getSizeLine;


public class PyramidValidator implements ShapeValidator {
    private static final Logger logger = LogManager.getLogger();
    private static final Integer VALID_COUNT_POINTS = 5;

    @Override
    public boolean isValid(List<Point> points) {
        return countPointsIsValid(points) && sizeSideIsValid(points) && sizeDiagonalIsValid(points) && vertexIsValid(points);
    }

    private boolean countPointsIsValid(List<Point> points) {
        if (VALID_COUNT_POINTS.equals(points.size())) {
            return true;
        }
        logger.log(Level.WARN, String.format("pyramid must have %d vertex ", VALID_COUNT_POINTS));
        return false;
    }

    private boolean sizeDiagonalIsValid(List<Point> points) {
        if (getSizeLine(points.get(0), points.get(2)).equals(getSizeLine(points.get(1), points.get(3)))) {
            return true;
        }
        logger.log(Level.WARN, "The pyramid must have a base with The same diagonals");
        return false;
    }

    private boolean sizeSideIsValid(List<Point> points) {
        if (getSizeLine(points.get(0), points.get(1)).equals(getSizeLine(points.get(1), points.get(3)))
                && getSizeLine(points.get(1), points.get(3)).equals(getSizeLine(points.get(3), points.get(2)))) {
            return true;
        }
        logger.log(Level.WARN, "The pyramid must have a base with The same sides");
        return false;
    }

    private boolean vertexIsValid(List<Point> points) {
        if (getSizeLine(points.get(4), points.get(0)).equals(getSizeLine(points.get(4), points.get(1)))
                && getSizeLine(points.get(4), points.get(1)).equals(getSizeLine(points.get(4), points.get(2)))
                && getSizeLine(points.get(4), points.get(2)).equals(getSizeLine(points.get(4), points.get(3)))) {
            return true;
        }
        logger.log(Level.WARN, "The pyramid must have a side faces The same length");
        return false;
    }
}
