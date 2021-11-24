package by.karpov.shape.service;

import by.karpov.shape.entity.Point;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.factory.PointFactory;
import by.karpov.shape.factory.PyramidFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EntityService {
    public  List<List<Point>> createPointsLists(List<List<Double>> dataLists) {
        return dataLists.stream()
                .map(PointFactory::createPointsList)
                .collect(Collectors.toUnmodifiableList());
    }
    public List<Pyramid> getPyramids( List<List<Point>> points) {
       final List<Pyramid> pyramids = new ArrayList<>(Collections.emptyList());
        for (List<Point> point : points) {
            Optional<Pyramid> pyramid = PyramidFactory.getShape(Pyramid.class, point);
            pyramid.ifPresent(pyramids::add);
        }
        return pyramids;
    }


}
