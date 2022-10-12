package learning_cat_chat;

public class Main {

    public static void main(String[] args) {

        new Cat("Meow...");
        new Dog("Woof!...woof");
        new Sheep("What do I say?");
        new Chicken("Cluck Cluck");
        new Cow("Moo!..");
        new Goat("Bheee!...");
        new Monkey("Hello, gentlemen.");


    }

    public static class Animal {
        private String animalSays;

        public enum Type {
            CAT, DOG, SHEEP, CHICKEN,
            COW, GOAT, MONKEY
        }

        public Animal(String myAnimalSays) {
            setAnimalSound(myAnimalSays);
        }

        /**
         * @param myAnimalSound :a string value that sets your cat's response.
         */
        public void setAnimalSound(String myAnimalSound) {
            this.animalSays = myAnimalSound;
        }

        public void formatConsoleOutput(String image, String message){
            System.out.println(image + ": " + message);
        }

    }

    public static class Cat extends Animal {
        private String myCatImg = "\uD83D\uDE3A";
        private Type myAnimalType = Type.CAT;

        public Cat(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(myCatImg, myAnimalSays);
        }

    }

    public static class Dog extends Animal {

        private String myDogImg = "\uD83D\uDC15";

        public Dog(String myAnimalSays) {
            super(myAnimalSays);
            formatConsoleOutput(myDogImg, myAnimalSays);
        }
    }
    public static class Sheep extends Animal {
        private String mySheepImg = "\uD83D\uDC11";

        public Sheep(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(mySheepImg, myAnimalSays);
        }

    }
    public static class Chicken extends Animal {
        private String myChickenImg = "\uD83D\uDC14";

        public Chicken(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(myChickenImg, myAnimalSays);
        }

    }
    public static class Cow extends Animal {
        private String myCowImg = "\uD83D\uDC2E";

        public Cow(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(myCowImg, myAnimalSays);
        }

    }
    public static class Goat extends Animal {
        private String myGoatImg = "\uD83D\uDC10";

        public Goat(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(myGoatImg, myAnimalSays);
        }

    }

    public static class Monkey extends Animal {
        private String myMonkeyImg = "\uD83D\uDC12";

        public Monkey(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(myMonkeyImg, myAnimalSays);
        }

    }
}


