package by.karpov.shape.reader;

import by.karpov.shape.exception.PyramidException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadeByFile implements BaseReader {
    private static final Logger logger = LogManager.getLogger();

    public List<String> readFile(String path) throws PyramidException {
        if (path == null || path.isBlank()) {
            throw new PyramidException("File is null or file name/path is empty");
        }
        final List<String> list = new ArrayList<>();
        try (final BufferedReader rdr = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = rdr.readLine()) != null) {
                list.add(line);
            }
            logger.log(Level.INFO, "Read file {} is successful", path);

        } catch (IOException exception) {
            throw new PyramidException(String.format("Some problems with reading file of path %s", path), exception);
        }
        return list;
    }
}
