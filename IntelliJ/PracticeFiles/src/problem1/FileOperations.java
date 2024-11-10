package problem1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {


    public static void writeToFile(String filename, String content) {
        BufferedWriter bw = null;
        try{
             bw = new BufferedWriter(new FileWriter(filename));
            bw.write(content);
            bw.flush();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                bw.close();
            }catch(IOException | NullPointerException e){
                System.out.println(e.getMessage());
            }


        }

    }

}

/*
Problem 1: Write to a File
Task: Write a method writeToFile(String filename, String content) that writes
the provided content to the file specified by filename.
If the file already exists, it should be overwritten.
 */
