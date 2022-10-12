package learning_cat_chat;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

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
        private String animalImage;
        private String animalSays;

        public enum Type {
            CAT, DOG, SHEEP, CHICKEN,
            COW, GOAT, MONKEY
        }

        Type animalType;

        public Type getAnimalType() {
            return animalType;
        }

        public void setAnimalType(Type animalType) {
            this.animalType = animalType;
        }


        public static Map<Type, String> animalEmojis;

        static {
            animalEmojis = new HashMap<>();
            animalEmojis.put(Type.CAT, "\uD83D\uDE3A");
            animalEmojis.put(Type.DOG, "\uD83D\uDC36");
        }


        /**
         * @param animal_type :enum, specifies they type of animal.
         *                    Could be one of many. List of animal types are (CAT, DOG, SHEEP, CHICKEN,
         *                    COW, GOAT, MONKEY).
         */
        public Animal(Type animal_type, String myAnimalSays) {
            setAnimalSound(myAnimalSays);
            this.animalType = animal_type;

            //setThisImage();
        }

        public Animal(String myAnimalSays) {
            setAnimalSound(myAnimalSays);

            //setThisImage();
        }

        public Animal(Type animal_type) {

            this.animalType = animal_type;

            //  setThisImage();
        }


        /**
         * @param myAnimalSound :a string value that sets your cat's response.
         */
        public void setAnimalSound(String myAnimalSound) {
            this.animalSays = myAnimalSound;

        }

        public String getAnimalSound() {
            return this.animalSays;
        }

        public void setThisImage(Type myAnimalType) {
            EnumSet.allOf(Type.class).forEach(type -> {
                        try {
                            if (type.toString() == animalEmojis.get(type) && type != null) {
                                String ourImg = animalEmojis.get(type);
                                System.out.println(getAnimalType().compareTo(type) + this.animalImage);
                            }

                        } catch (Exception e) {
                            System.out.println("Get image exception in animal class" +
                                    ". Check the Animal class where get image is");
                        }
                    }
            );

        }

        public String getThisImage() {
            return this.animalImage;
        }

        public void formatConsoleOutput(String image, String message){

            System.out.println(image + ": " + message);

        }


   /*  public String setAnimalImage{
            EnumSet.allOf(Type.class).forEach(type -> {
                        try {
                            if (getAnimalType().compareTo(type) == 0) {
                                System.out.println(animalEmojis.get(type).getClass());
                                return animalEmojis.get(type);
                            }

                        }catch (Exception e) {System.out.println("Get image exception in animal class" +
                                ". Check the Animal class where get image is");}
                    }
            );
    }*/


    }

    public static class Cat extends Animal {
        private String catImg = "\uD83D\uDE3A";

        public Cat(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(catImg, myAnimalSays);
        }

    }

    public static class Dog extends Animal {

        private String dogImg = "\uD83D\uDC15";

        public Dog(String myAnimalSays) {
            super(myAnimalSays);
            formatConsoleOutput(dogImg, myAnimalSays);
        }
    }
    public static class Sheep extends Animal {
        private String sheepImg = "\uD83D\uDC11";

        public Sheep(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(sheepImg, myAnimalSays);
        }

    }
    public static class Chicken extends Animal {
        private String chickenImg = "\uD83D\uDC14";

        public Chicken(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(chickenImg, myAnimalSays);
        }

    }
    public static class Cow extends Animal {
        private String cowImg = "\uD83D\uDC2E";

        public Cow(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(cowImg, myAnimalSays);
        }

    }
    public static class Goat extends Animal {
        private String goatImg = "\uD83D\uDC10";

        public Goat(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(goatImg, myAnimalSays);
        }

    }

    public static class Monkey extends Animal {
        private String monkeyImg = "\uD83D\uDC12";

        public Monkey(String myAnimalSays) {

            super(myAnimalSays);
            formatConsoleOutput(monkeyImg, myAnimalSays);
        }

    }
}


