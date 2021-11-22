package by.karpov.shape.service;

import by.karpov.shape.controller.PyramidBaseController;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.create.PyramidCreate;
import by.karpov.shape.validator.PyramidValidator;

import java.util.List;

public class PyramidService {
    public List<Pyramid> getPyramids(){
        PyramidCreate pyramidCreate = new PyramidCreate();
        return pyramidCreate.getPyramids(new PyramidValidator(), new PyramidBaseController());
    }
}
