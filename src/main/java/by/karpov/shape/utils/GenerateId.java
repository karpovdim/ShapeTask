package by.karpov.shape.utils;

public class GenerateId {
    public static Long countId = 0L;

    public static Long getId() {
        return countId++;
    }
}
