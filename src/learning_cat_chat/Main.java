package learning_cat_chat;


import learning_cat_chat.care.ScheduleCare;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        new Cat("Meow...");





    }

    public static class Pet implements ScheduleCare {
        private String petSays;
        private String eatLanguage;

        @Override
        public String feedReminder() {
            return null;
        }

        @Override
        public String groomingReminder() {
            return null;
        }

        @Override
        public String vetReminder() {
            return null;
        }

        @Override
        public String tidyPetEnv() {
            return null;
        }

        public enum Type {
            CAT, DOG, SHEEP, CHICKEN,
            COW, GOAT, MONKEY
        }

        public Pet(String myPetSays) {
            setPetSound(myPetSays);
            eatTime();

        }

        /**
         * @param myPetSound :a string value that sets your cat's response.
         */
        public void setPetSound(String myPetSound) {
            this.petSays = myPetSound;
        }

        public void eatTime(){
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Running: " + new java.util.Date());
                }
            }, 0, 5000);
        }


        public void formatConsoleOutput(String image, String message){
            System.out.println(image + ": " + message);
        }

    }

    public static class Cat extends Pet {
        private String myCatImg = "\uD83D\uDE3A";
        private Type myPetType = Type.CAT;
        private String catHungry = "I'm hungry. Grr...";

        public Cat(String myPetSays) {

            super(myPetSays);
            formatConsoleOutput(myCatImg, myPetSays);


        }
        //Schedule eating time idea. Bug:null catHungry when first running. Come up with better scheduler.
        @Override
        public void eatTime() {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {

                    formatConsoleOutput(myCatImg, catHungry);

                }
            }, 0, 5000);

        }
    }

    public static class Dog extends Pet {

        private String myDogImg = "\uD83D\uDC15";

        public Dog(String myPetSays) {
            super(myPetSays);
            formatConsoleOutput(myDogImg, myPetSays);
        }
    }
    public static class Sheep extends Pet {
        private String mySheepImg = "\uD83D\uDC11";

        public Sheep(String myPetSays) {

            super(myPetSays);
            formatConsoleOutput(mySheepImg, myPetSays);
        }

    }
    public static class Chicken extends Pet {
        private String myChickenImg = "\uD83D\uDC14";

        public Chicken(String myPetSays) {

            super(myPetSays);
            formatConsoleOutput(myChickenImg, myPetSays);
        }

    }
    public static class Cow extends Pet {
        private String myCowImg = "\uD83D\uDC2E";

        public Cow(String myPetSays) {

            super(myPetSays);
            formatConsoleOutput(myCowImg, myPetSays);
        }

    }
    public static class Goat extends Pet {
        private String myGoatImg = "\uD83D\uDC10";

        public Goat(String myPetSays) {

            super(myPetSays);
            formatConsoleOutput(myGoatImg, myPetSays);
        }

    }

    public static class Monkey extends Pet {
        private String myMonkeyImg = "\uD83D\uDC12";

        public Monkey(String myPetSays) {

            super(myPetSays);
            formatConsoleOutput(myMonkeyImg, myPetSays);
        }

    }
}


