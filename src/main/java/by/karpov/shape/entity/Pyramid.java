package by.karpov.shape.entity;

import by.karpov.shape.util.GenerateId;

public class Pyramid implements Shape {
    private String id;
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point vertex;

    @Override
    public String getId() {
        return GenerateId.getId();
    }

    public void setId(String id) {

        this.id = id;
    }

    public void setA(Point a) {

        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public void setVertex(Point vertex) {
        this.vertex = vertex;
    }

    public Pyramid(Point a, Point b, Point c, Point d, Point vertex) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.vertex = vertex;
        this.id = GenerateId.getId();
    }

    public String getPyramidId() {
        return id;
    }

    public Point getVertex() {
        return vertex;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Pyramid{");
        stringBuilder.append("id = ").append(id);
        stringBuilder.append(",\n vertex = ").append(vertex);
        stringBuilder.append(",\n a = ").append(a);
        stringBuilder.append(",\n b = ").append(b);
        stringBuilder.append(",\n c = ").append(c);
        stringBuilder.append(",\n d = ").append(d);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pyramid pyramid = (Pyramid) o;

        if (id != null ? !id.equals(pyramid.id) : pyramid.id != null) return false;
        if (a != null ? !a.equals(pyramid.a) : pyramid.a != null) return false;
        if (b != null ? !b.equals(pyramid.b) : pyramid.b != null) return false;
        if (c != null ? !c.equals(pyramid.c) : pyramid.c != null) return false;
        if (d != null ? !d.equals(pyramid.d) : pyramid.d != null) return false;
        return vertex != null ? vertex.equals(pyramid.vertex) : pyramid.vertex == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (d != null ? d.hashCode() : 0);
        result = 31 * result + (vertex != null ? vertex.hashCode() : 0);
        return result;
    }
}
