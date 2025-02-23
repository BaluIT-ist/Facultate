package Inheritance;

import java.util.Scanner;

import static java.awt.Color.yellow;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Square's lenght :");
        int lenght = sc.nextInt();
        System.out.println("Circle's radius :");
        int radius = sc.nextInt();
        System.out.println("Rectangle's Height and Width:");
        int height = sc.nextInt();
        int width = sc.nextInt();

        Rectangle rectangle=new Rectangle(height,width,"red");
        double areaRectangle = rectangle.getArea();
        System.out.println("Rectangle's area is : " + areaRectangle + " and the color : " + rectangle.color);


        Square square = new Square(lenght,"green");
        double areaSquare = square.getArea();
        System.out.println("Square's area is : " + areaSquare+ " and the color : " + square.color);

        Circle circle = new Circle(radius,"yellow");
        double areaCircle = circle.getArea();
        System.out.println("Circle's area is : " + areaCircle+ " and the color : " + circle.color);


    }
}
