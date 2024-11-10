package StudentFileManager;

import StudentFileManager.StudentRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;



public class FileHandlingTest {
    private static final String TEST_FILE = "students.txt";
    private List<StudentRecord> testRecords;

    @BeforeEach
    void setUp() {
        testRecords = new ArrayList<>();
        testRecords.add(new StudentRecord("Alice Smith", 1001, 3.8));
        testRecords.add(new StudentRecord("Bob Johnson", 1002, 3.5));
        testRecords.add(new StudentRecord("Charlie Brown", 1003, 3.9));
    }

    @AfterEach
    void cleanUp() {
        try {
            Files.deleteIfExists(Paths.get(TEST_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testFileOperations() {
        StudentFileManager fileManager = new StudentFileManager(TEST_FILE);

        // Test writing records
        assertTrue(fileManager.writeRecords(testRecords));

        // Test reading records
        List<StudentRecord> readRecords = fileManager.readRecords();
        assertNotNull(readRecords);
        assertEquals(testRecords.size(), readRecords.size());

        // Test content equality
        for (int i = 0; i < testRecords.size(); i++) {
            assertEquals(testRecords.get(i), readRecords.get(i));
        }

        // Test searching for a student
        StudentRecord foundStudent = fileManager.findStudentById(1002);
        assertNotNull(foundStudent);
        assertEquals("Bob Johnson", foundStudent.name);

        // Test adding a new record
        StudentRecord newStudent = new StudentRecord("David Wilson", 1004, 3.7);
        assertTrue(fileManager.appendRecord(newStudent));

        // Verify the new total count
        readRecords = fileManager.readRecords();
        assertEquals(4, readRecords.size());
    }
}