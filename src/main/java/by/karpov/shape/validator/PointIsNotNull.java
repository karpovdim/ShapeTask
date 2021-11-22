package by.karpov.shape.validator;

import by.karpov.shape.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PointIsNotNull {
    private static final Logger logger = LogManager.getLogger();

    public static boolean isNotNull(List<Point> points) {
        for (Point point : points) {
            if (point == null) {
                logger.log(Level.ERROR, "Point instance is null");
                return false;
            }
        }
        return true;
    }
}
