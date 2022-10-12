package learning_cat_chat;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        new Cat("Meow...");


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
        private String catImg;
        

        public Cat(String myAnimalSays) {

            super(myAnimalSays);
            setAnimalType(Type.CAT);
            if (getAnimalType() == Type.CAT) getCatImg();
        }

        public String getCatImg() {
            return this.catImg;
        }

        public void setCatImgHelper(String catImg) {
            EnumSet.allOf(Type.class).forEach(type -> {
                try {
                    if (type == Type.CAT) setCatImg(animalEmojis.get(type));{
                    }
                } catch (Exception e){
                    System.out.println(e + "Ain't no cat image");
                }

            });
        }


        public String setCatImg(String catImg) {
            return this.catImg = catImg;
        }




    }
}


