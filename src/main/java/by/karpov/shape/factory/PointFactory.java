package by.karpov.shape.factory;

import by.karpov.shape.entity.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public final class PointFactory {
    private static final Logger LOGGER = LogManager.getLogger(PointFactory.class);

    private PointFactory() {
    }

    public static List<Point> createPointsList(List<Double> dataList) {

        List<Point> pointsList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i += 3) {
            double pivotX = dataList.get(i);
            double pivotY = dataList.get(i + 1);
            double pivotZ = dataList.get(i + 2);
            Point point = new Point(pivotX, pivotY, pivotZ);
            pointsList.add(point);
            LOGGER.info("create Point {} is successful", point);
        }
        return pointsList;
    }
}
