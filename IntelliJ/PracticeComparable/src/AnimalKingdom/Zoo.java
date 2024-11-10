package AnimalKingdom;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal.Lion());
        animals.add(new Animal.Eagle());
        animals.add(new Animal.Snake());


        for(Animal a : animals){
            a.makeSound();
            a.move();

        }
    }
}
