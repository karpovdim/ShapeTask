package by.karpov.shape.entity;

public class Point {
    private final double pivotX;
    private final double pivotY;
    private final double pivotZ;

    public Point(double pivotX, double pivotY, double pivotZ) {
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.pivotZ = pivotZ;
    }

    public double getPivotX() {
        return pivotX;
    }

    public double getPivotY() {
        return pivotY;
    }

    public double getPivotZ() {
        return pivotZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.pivotX, pivotX) != 0) return false;
        if (Double.compare(point.pivotY, pivotY) != 0) return false;
        return Double.compare(point.pivotZ, pivotZ) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(pivotX);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pivotY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pivotZ);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("\nPoint");
        stringBuilder.append("{ pivotX=").append(pivotX);
        stringBuilder.append(" pivotY=").append(pivotY);
        stringBuilder.append(" pivotZ=").append(pivotZ);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }



}
