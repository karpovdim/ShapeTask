package by.karpov.shape.observer;

import by.karpov.shape.entity.Shape;

public final class Event {
    private final Shape shape;

    public Event(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
