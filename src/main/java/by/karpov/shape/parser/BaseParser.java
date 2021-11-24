package by.karpov.shape.parser;

import java.util.List;

public interface BaseParser {
    List<List<Double>> parseToCoordinate(List<String> dataList);
}

