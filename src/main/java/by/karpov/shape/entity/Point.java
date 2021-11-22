package by.karpov.shape.entity;

public class Point {
    private final Double pivotX;
    private final Double pivotY;
    private final Double pivotZ;

    public Double getPivotX() {
        return pivotX;
    }

    public Double getPivotY() {
        return pivotY;
    }

    public Double getPivotZ() {
        return pivotZ;
    }

    public Point(Double pivotX, Double pivotY, Double pivotZ) {
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.pivotZ = pivotZ;
    }

    @Override
    public String toString() {
        return "\n Point{" +
                "pivotX=" + pivotX +
                ", pivotY=" + pivotY +
                ", pivotZ=" + pivotZ +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return pivotX != null
                && pivotY != null
                && pivotZ != null
                && pivotX.equals(point.pivotX)
                && pivotY.equals(point.pivotY)
                && (pivotZ.equals(point.pivotZ));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + pivotX.intValue() + pivotY.intValue() + pivotZ.intValue();
        return result;
    }
}
