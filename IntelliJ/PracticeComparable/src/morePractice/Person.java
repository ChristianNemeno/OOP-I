package morePractice;

import java.util.Comparator;
import java.util.Random;

public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected double salary;

    Random rand = new Random();

    public Person(String name , int age){
        this.name = name;
        this.age = age;

        salary = rand.nextDouble(100000);
    }

    @Override
    public int compareTo(Person that){
        return this.age - that.age;
    }

    @Override
    public String toString(){
        return "Name : " + name +" age: " + age + " salary: " + salary;
    }


    public static class AlphabeticalCompare implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2){
            return o1.name.compareTo(o2.name);
        }

    }

    public static class SalaryCompare implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2){
            return Double.compare(o2.salary, o1.salary);
        }
    }

    public static class AlphabeticalCondition implements Comparator<Person>{

        char condition;

        public AlphabeticalCondition(Character condition){
            this.condition = condition;
        }

        @Override
        public int compare(Person name1, Person name2){
            char first = name1.name.charAt(0);
            char second = name2.name.charAt(0);
            int diff1 = Math.abs(first-condition);
            int diff2 = Math.abs(second-condition);
            if(diff1 == diff2){
                return new SalaryCompare().compare(name1,name2);
            }


            return Integer.compare(diff1,diff2);
        }


    }

}
