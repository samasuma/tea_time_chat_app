package learning_root.model;

public class Person {

    private int height;
    private double weight;

    public Person(int ht, double wt){
        this.height = ht;
        this.weight = wt;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
