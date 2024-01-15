package Fruits;

public abstract class Fruit {
    protected String name;
    protected String color;
    protected int weight;

    public Fruit(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    final void showInfo() {
        System.out.println(color + " rangli " + name + " dan" + weight + " kg");
    }
}
