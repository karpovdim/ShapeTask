package by.karpov.shape.util;

import java.util.UUID;

public class GenerateId {
    public static String getId() {
        String id = UUID.randomUUID().toString();
        return id;
    }
}
