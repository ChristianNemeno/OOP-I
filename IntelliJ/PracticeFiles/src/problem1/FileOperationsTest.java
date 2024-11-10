package problem1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

class FileOperationsTest {

    @Test
    void testWriteToFile() throws IOException {
        String filename = "testFile.txt";
        String content = "Hello, World!";

        FileOperations.writeToFile(filename, content);

        Path path = Paths.get(filename);
        assertTrue(Files.exists(path));
        assertEquals(content, Files.readString(path));

        Files.deleteIfExists(path); // Cleanup
    }
}
