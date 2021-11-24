package by.karpov.shape;

import by.karpov.shape.entity.Point;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.exception.PyramidException;
import by.karpov.shape.parser.ParseToDoubleCoordinate;
import by.karpov.shape.reader.ReadeByFile;
import by.karpov.shape.service.EntityService;

import java.util.List;

public class Application {
    public static void main(String[] args) throws PyramidException {
        ParseToDoubleCoordinate parse = new ParseToDoubleCoordinate();
        ReadeByFile read = new ReadeByFile();
        List<String> dataList = read.readFile("src/data.txt");
        List<List<Double>> doubleLists = parse.parseToCoordinate(dataList);
        EntityService entityService = new EntityService();
        List<List<Point>> pointsLists = entityService.createPointsLists(doubleLists);
        List<Pyramid> pyramids = entityService.getPyramids(pointsLists);
        pyramids.forEach(System.out::println);


    }
}
