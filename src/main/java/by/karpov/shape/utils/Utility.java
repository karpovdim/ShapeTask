package by.karpov.shape.utils;

import by.karpov.shape.entity.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Utility {
    public static Double getSizeLine(Point a, Point b) {
        return sqrt(pow((b.getPivotX() - a.getPivotX()), 2)
                + pow((b.getPivotY() - a.getPivotY()), 2)
                + pow((b.getPivotZ() - a.getPivotZ()), 2));
    }
}
