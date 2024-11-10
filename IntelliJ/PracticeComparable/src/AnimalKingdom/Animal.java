package AnimalKingdom;

abstract class Animal implements  Soundable{


    public abstract void move();

    public static class Lion extends Animal{


        public void move(){
            System.out.println("Lion moves: Running on four legs");
        }

        @Override
        public void makeSound(){
            System.out.println("Lion says: Roar!");
        }
    }

    public static class Eagle extends Animal{

        public void move(){
            System.out.println("Eagle moves: Flying through the air");
        }
        @Override
        public void makeSound(){
            System.out.println("Eagle says: Screech!");
        }

    }

    public static class Snake extends Animal{


        public void move(){
            System.out.println("Snake moves: Slithering on the ground");
        }

        @Override
        public void makeSound(){
            System.out.println("Snake says: Hiss!");
        }
    }


}
