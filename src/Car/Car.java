package Car;

public class Car {
    private static Car instens;
    final static private int maxCapacity=100;
    private int buysCapacity;

    private Car() {
        buysCapacity=0;
    }
    public static Car getInstance(){
        if (instens==null){
            instens=new Car();
        }
        return instens;
    }
    public boolean isActive() {
        return buysCapacity > 0;
    }

    public boolean refuel(int addPetrol) {
        if (buysCapacity + addPetrol <= maxCapacity) {
            buysCapacity += addPetrol;
            return true;
        } else return false;
    }

    public int getMaxWay(int value) {
        return buysCapacity * value;
    }
}
