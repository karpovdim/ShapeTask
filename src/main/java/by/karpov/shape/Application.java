package by.karpov.shape;

import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.service.PyramidService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        PyramidService pyramidService = new PyramidService();
        List<Pyramid> pyramids = pyramidService.getPyramids();
        System.out.println(pyramids);
    }
}
