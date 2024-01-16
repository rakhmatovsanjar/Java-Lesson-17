package Car;

public class Main {
    public static void main(String[] args) {
        Car car = Car.getInstance();
        System.out.println("Mashina yuradimi: " + car.isActive());
        System.out.println("Yoqilgi'i sig'adimi: " + car.refuel(40));
        System.out.println(car.getMaxWay(20) + " km yuradi");
    }
}
