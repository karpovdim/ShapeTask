//package by.karpov.shape.service;
//
//import by.karpov.shape.entity.Point;
//import by.karpov.shape.entity.Shape;
//import by.karpov.shape.factory.PyramidFactory;
//
//import java.util.List;
//
//public class ShapeService {
//    private final ShapeRepository shapeRepository ;
//
//    public ShapeService(ShapeRepository shapeRepository) {
//        this.shapeRepository = shapeRepository;
//    }
//
//    Shape update(String id, List<Point> points){
//        Shape shape = shapeRepository.findById(id);
//        Shape shapeNew = PyramidFactory.getShape(shape.getClass(), points);
//        shapeNew.setId(id);
//        shapeRepository.save(shapeNew);
//        return shape;
//    }
//}
