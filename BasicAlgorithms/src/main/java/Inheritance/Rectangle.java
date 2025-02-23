package Inheritance;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length,String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
}
