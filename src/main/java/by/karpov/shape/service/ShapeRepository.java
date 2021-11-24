package by.karpov.shape.service;

import by.karpov.shape.entity.Shape;

public interface ShapeRepository {
    Shape findById(String id);
    Shape save(Shape shape);
}
