package by.karpov.shape.create;

import by.karpov.shape.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PointListCreate {
    private static final Logger logger = LogManager.getLogger();

    public static List<Point> getPoints(List<Double> dataList) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            Double pivotX = dataList.get(i++);
            Double pivotY = dataList.get(i++);
            Double pivotZ = dataList.get(i);
            points.add(new Point(pivotX, pivotY, pivotZ));
            logger.log(Level.INFO,"create Point is successful");
        }
        return points;
    }
}


