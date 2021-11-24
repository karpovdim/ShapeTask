package by.karpov.shape.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Warehouse {
    private static final Logger LOGGER = LogManager.getLogger(Warehouse.class);
    private static Warehouse instance;
    private final Map<String, Parameters> map = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public Map<String, Parameters> getMap() {
        return Map.copyOf(map);
    }

    public void putParameters(String id, Parameters parameters) {
        instance.map.put(id, parameters);
    }

    public Optional<Parameters> getParameters(String id) {
        Optional<Parameters> parameters = Optional.ofNullable(instance.map.get(id));
        return parameters;
    }
}
