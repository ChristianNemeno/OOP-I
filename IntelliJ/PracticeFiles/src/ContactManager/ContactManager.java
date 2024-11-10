package ContactManager;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private String fileName;

    public ContactManager(String fileName) {
        this.fileName = fileName;
    }

    public boolean addContact(Contact contact) {
        // Your code here

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write(contact.toString());
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Contact> getAllContacts() {
        // Your code here
        List<Contact> hi = new ArrayList<>();
        String[] regexed;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String ln =reader.readLine();
            while(ln != null){
                regexed = ln.split(",");
                hi.add(new Contact(regexed[0],regexed[1],regexed[2]));
                ln = reader.readLine();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        return hi;
    }

    public Contact findContactByName(String name) {
        // Your code here
        String[] regexed;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){


            String now = reader.readLine();
            while(now != null){
                regexed = now.split(",");
                if(regexed[0].equals(name)){
                    return new Contact(regexed[0],regexed[1],regexed[2]);
                }

                now = reader.readLine();
            }



        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean deleteContact(String name) {

        List<Contact> tacts = getAllContacts();

        try(BufferedWriter wat = new BufferedWriter(new FileWriter(fileName))){

            for(Contact e : tacts){
                if(!e.getName().equals(name)){
                   wat.write(e.toString());
                   wat.newLine();
                }

            }

            return true;
        }catch(IOException e){
            System.out.println("Error in deleting " + e.getMessage());
            return false;
        }
    }
}