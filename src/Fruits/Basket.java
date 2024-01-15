package Fruits;

public class Basket {
    final int maxWeight;
    int size = 0;
    Apple[] apples = new Apple[]{};
    Peach[] peachs = new Peach[]{};
    Pomegranate[] pomegranates = new Pomegranate[]{};

    public Basket(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFuul() {
        return size == maxWeight;
    }

    boolean addFruit(Apple apple) {
        if (apple.weight <= maxWeight - size) {
            Apple[] newApple = new Apple[apples.length + 1];
            int index = 0;
            for (int i = 0; i < newApple.length; i++) {
                newApple[index++] = apple;
                size += apple.weight;
            }
            apples = newApple;
            for (Apple value : apples) {
                System.out.println(value.weight + " kg " + value.color + " " + value.name + " qo'shildi");
                break;
            }
            return true;
        } else {
            System.out.println("Savatga siqmaydi");
            return false;
        }
    }

    boolean addFruit(Peach peach) {
        if (peach.weight <= maxWeight - size) {
            Peach[] newPeach = new Peach[peachs.length + 1];
            int index = 0;
            for (int i = 0; i < newPeach.length; i++) {
                newPeach[index++] = peach;
                size += peach.weight;
            }
            peachs = newPeach;
            for (Peach value : peachs) {
                System.out.println(value.weight + " kg " + value.color + " " + value.name + " qo'shildi");
                break;
            }
            return true;
        } else {
            System.out.println("Savatga siqmaydi");
            return false;
        }
    }

    boolean addFruit(Pomegranate pomegranate) {
        if (pomegranate.weight <= maxWeight - size) {
            Pomegranate[] newPomegranate = new Pomegranate[pomegranates.length + 1];
            int index = 0;
            for (int i = 0; i < newPomegranate.length; i++) {
                newPomegranate[index++] = pomegranate;
                size += pomegranate.weight;
            }
            Basket.this.pomegranates = newPomegranate;
            for (Pomegranate value : pomegranates) {
                System.out.println(value.weight + " kg " + value.color + " " + value.name + " qo'shildi");
                break;
            }
            return true;
        } else {
            System.out.println("Savatga siqmaydi");
            return false;
        }
    }

    boolean addFruits(Fruit[] fruits) {
        if (apples.length + pomegranates.length + peachs.length <= fruits.length) {
            /**
             Shu metodni qilolmadim
             **/
            return true;
        } else return false;
    }

    int getEmptySize() {
        return maxWeight - size;
    }
}
