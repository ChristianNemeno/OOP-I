package problem2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileProcessorTest {

    private static final String TEST_FILE_PATH = "testFile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE_PATH));
    }

    @Test
    void testWriteContentToFile() {
        fileProcessor.writeContentToFile(TEST_FILE_PATH, "Test Content");
        String result = fileProcessor.readContentFromFile(TEST_FILE_PATH);
        assertEquals("Test Content", result, "The content written should match 'Test Content'");
    }

    @Test
    void testReadContentFromFile_FileDoesNotExist() {
        assertNull(fileProcessor.readContentFromFile("nonExistentFile.txt"), "Reading a non-existent file should return null");
    }

    @Test
    void testAppendContentToFile() {
        fileProcessor.writeContentToFile(TEST_FILE_PATH, "Initial Content");
        fileProcessor.appendContentToFile(TEST_FILE_PATH, " Appended Content");
        String result = fileProcessor.readContentFromFile(TEST_FILE_PATH);
        assertEquals("Initial Content Appended Content", result, "Appended content should be added to the initial content");
    }

    @Test
    void testAppendContentToFile_FileDoesNotExist() {
        fileProcessor.appendContentToFile(TEST_FILE_PATH, "First Line");
        String result = fileProcessor.readContentFromFile(TEST_FILE_PATH);
        assertEquals("First Line", result, "Appending to a non-existent file should create it and add the content");
    }
}
