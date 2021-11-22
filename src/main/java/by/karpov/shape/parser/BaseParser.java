package by.karpov.shape.parser;

import by.karpov.shape.entity.Point;

import java.util.List;

public interface BaseParser {
    List<List<Point>> stringsToPoints(List<String> dataList);
}

