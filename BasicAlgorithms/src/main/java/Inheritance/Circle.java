package Inheritance;

public class Circle extends Shape {

    private double radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*(radius*radius);
    }
}
