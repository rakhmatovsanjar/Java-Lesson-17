package Shape;

public class Treangel implements Shape {
    private final int a;
    private final int b;
    private final int c;

    public Treangel(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimetr() {
        return a + b + c;
    }

    @Override
    public int getSquare() {
        int p = (a + b + c) / 2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
