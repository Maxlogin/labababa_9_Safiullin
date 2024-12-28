package zad2;

public class Rhombus extends Parallelogram {
    private double h;

    public Rhombus(double a, double h) {
        super(a, h);
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}
