package Fruits;

public class Main {
    public static void main(String[] args) {
        Basket basket=new Basket(100);
        Apple apple=new Apple("olma", "qizil",40);
        Peach peach=new Peach("shaftoli","sariq",40);
        Pomegranate pomegranate=new Pomegranate("anor","qizil",20);
        System.out.println(basket.addFruit(apple));
        System.out.println(basket.addFruit(peach));
        System.out.println(basket.addFruit(pomegranate));
        System.out.println("Safat bo'shmi: "+basket.isEmpty());
        System.out.println("Savat to'lami: "+basket.isFuul());
        System.out.println("Bo'sh joy: "+basket.getEmptySize());
    }
}
