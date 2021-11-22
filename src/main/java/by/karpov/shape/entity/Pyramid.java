package by.karpov.shape.entity;

import by.karpov.shape.utils.GenerateId;

public class Pyramid {
    private final Long id;
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;
    private final Point vertex;


    public Pyramid(Point a, Point b, Point c, Point d, Point vertex) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.vertex = vertex;
        this.id = GenerateId.getId();
    }

    public Long getId() {
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
        return "Pyramid{" +
                "id=" + id +
                ",\n vertex=" + vertex +
                ",\n a=" + a +
                ",\n b=" + b +
                ",\n c=" + c +
                ",\n d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pyramid pyramid = (Pyramid) obj;
        return a != null
                && b != null
                && c != null
                && d != null
                && vertex != null
                && a.equals(pyramid.a)
                && b.equals(pyramid.b)
                && c.equals(pyramid.c)
                && d.equals(pyramid.d)
                && vertex.equals(pyramid.vertex);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id.intValue();
        return result;
    }
}
