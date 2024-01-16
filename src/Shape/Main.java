package Shape;

public class Main {
    public static void main(String[] args) {
        Treangel treangel1=new Treangel(3,4,5);
        Treangel treangel2=new Treangel(4,7,9);
        System.out.println(treangel1.getPerimetr());
        System.out.println(treangel1.getSquare());
        System.out.println("----------------------");
        System.out.println(treangel2.getPerimetr());
        System.out.println(treangel2.getSquare());
    }
}
