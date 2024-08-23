/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Main {

    public static void main(String[] args){
        Student student = new Student("Kenny", 23, 140);

        Person person = student;
        Object object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }
    
}
