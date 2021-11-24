package by.karpov.shape.action.implementation;

import by.karpov.shape.action.Action;
import by.karpov.shape.entity.Parameters;
import by.karpov.shape.entity.Pyramid;
import by.karpov.shape.entity.PyramidParametrs;
import by.karpov.shape.entity.Shape;
import by.karpov.shape.util.Utility;

import java.util.Optional;
import java.util.OptionalDouble;

import static by.karpov.shape.util.Utility.getSizeLine;
import static by.karpov.shape.validator.PyramidValidator.pyramidIsNotNull;

public class PyramidAction implements Action {
    @Override
    public Parameters calculate(Shape shape) {
        return new PyramidParametrs(area, volume);
    }

    public OptionalDouble calculateSurfaceAreaPyramid(Pyramid pyramid) {
        if (pyramidIsNotNull(pyramid)) {
            double sizeSideBase = Utility.getSizeLine(pyramid.getA(), pyramid.getB());
            double sizeSideFace = Utility.getSizeLine(pyramid.getA(), pyramid.getVertex());
            double surfaceArea = sizeSideBase * sizeSideBase + 2 * sizeSideBase * Math.sqrt(sizeSideFace - sizeSideBase * 0.25);
            OptionalDouble surfaceAreaOptional = OptionalDouble.of(surfaceArea);
            return surfaceAreaOptional;
        }

        return OptionalDouble.empty();
    }

    public double calculateVolumePyramid(Pyramid pyramid) {
        if (pyramidIsNotNull(pyramid)) {
            double hieght = pyramid.getVertex().getPivotY()*getSizeLine(pyramid.getA(),pyramid.getB());
            double baseSide = getSizeLine(pyramid.getA(),pyramid.getB());
            double volume = 0.33333 * hieght * baseSide * baseSide;
            return volume;
        }

        return 0.0; //todo check volume not 0.0;
    }

    @Override
    public double ratioVolumeByCuttingParallelPlain(Pyramid pyramid, Double heightCutting) {
        return 0.0;
    }

    @Override
    public Boolean isPyramidAfterCutting(Optional<Pyramid> pyramid) {
        return true;
    }
}
