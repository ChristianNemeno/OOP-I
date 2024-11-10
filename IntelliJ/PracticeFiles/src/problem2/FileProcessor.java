package problem2;

import java.io.*;
import java.util.Scanner;

public class FileProcessor {

    public void writeContentToFile(String filePath, String content){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){

            bw.write(content);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public String readContentFromFile(String filePath){
        StringBuilder result = new StringBuilder();
        File file = new File(filePath);
        if (!file.exists()) {
            return null;  // Handle non-existent file case
        }
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){


            String line = br.readLine();
            while(line != null) {

                result.append(line);
                result.append("\n");

                line = br.readLine();

            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        return result.toString().trim();
    }

    void appendContentToFile(String filePath, String content){
        try(BufferedWriter br = new BufferedWriter(new FileWriter(filePath,true))){
            br.write(content);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
