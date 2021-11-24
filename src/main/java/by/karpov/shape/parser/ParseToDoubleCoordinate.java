package by.karpov.shape.parser;

import by.karpov.shape.validator.CoordinatesValidator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseToDoubleCoordinate implements BaseParser {
    private static final String DELIMITER = "\\s+";

    @Override
    public List<List<Double>> parseToCoordinate(List<String> dataList) {
        return dataList.stream()
                .filter(CoordinatesValidator::isValidCoordinates)
                .map(data -> data.trim().split(DELIMITER))
                .map(list -> Stream.of(list)
                        .map(Double::parseDouble)
                        .collect(Collectors.toList()))
                .collect(Collectors.toUnmodifiableList());
    }
}
