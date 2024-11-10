package StudentFileManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileManager {
    private final String filename;

    public StudentFileManager(String filename) {
        this.filename = filename;
    }

    public boolean writeRecords(List<StudentRecord> records) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (StudentRecord record : records) {
                writer.write(record.toString());
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing records: " + e.getMessage());
            return false;
        }
    }

    public List<StudentRecord> readRecords() {
        List<StudentRecord> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        students.add(new StudentRecord(
                                parts[0],
                                Integer.parseInt(parts[1]),
                                Double.parseDouble(parts[2])
                        ));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading records: " + e.getMessage());
        }
        return students;
    }

    public StudentRecord findStudentById(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    if (parts.length == 3 && Integer.parseInt(parts[1]) == id) {
                        return new StudentRecord(
                                parts[0],
                                Integer.parseInt(parts[1]),
                                Double.parseDouble(parts[2])
                        );
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error searching for student: " + e.getMessage());
        }
        return null;
    }

    public boolean appendRecord(StudentRecord record) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(record.toString());
            writer.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error appending record: " + e.getMessage());
            return false;
        }
    }
}