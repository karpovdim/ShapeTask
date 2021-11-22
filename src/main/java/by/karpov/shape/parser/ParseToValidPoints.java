package by.karpov.shape.parser;

import by.karpov.shape.create.PointListCreate;
import by.karpov.shape.validator.CoordinatesValidator;
import by.karpov.shape.entity.Point;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParseToValidPoints implements BaseParser {
    private static final String DELIMITER = "\\s+";
    public static final int VALID_AMOUNT_COORDINATES = 15;

    @Override
    public List<List<Point>> stringsToPoints(List<String> dataList) {
        return dataList.stream()
                .filter(CoordinatesValidator::dataISValid)//TODO: допустима ли валидация в парсере?
                .map(String::trim)
                .map(data -> data.split(DELIMITER))
                .map(list -> Stream.of(list)
                        .map(Double::parseDouble)
                        .collect(Collectors.toList()))
                .filter(list -> list.size() == VALID_AMOUNT_COORDINATES) //TODO: допустима ли валидация в парсере?
                .map(PointListCreate::getPoints)
                .collect(Collectors.toList());
    }
}
