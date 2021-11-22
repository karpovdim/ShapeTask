package by.karpov.shape.reader;

import by.karpov.shape.exception.PyramidException;

import java.util.List;

public interface BaseReader {
    List<String> readFile(String path) throws PyramidException;
}
