/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Student extends Person {

    private int credits;

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + credits + " credits";
    }

}
