package Inheritance;

public class Square extends Shape {

    private double length;

    public Square(int length, String color) {
        super(color);
        this.length = length;
    }

    @Override
    public double getArea(){
        return length * length;
    }
}


