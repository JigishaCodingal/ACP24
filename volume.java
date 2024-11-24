class Shape {
    public double getVolume() {
        return 0;
    }
}

// A triangle with base and height
class Triangle extends Shape { // extended form the Shape class
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getVolume() {// area of triangle 1/2*b*h
        // area using heron's formula can also be used here
        return  base * height;
    }
}

// A SQUARE is a Shape with a specific side
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side*side;
    }
}

class Main {
    public static void main(String args[]) {
        Shape[] shape = new Shape[2]; // Creating shape array of size 2
        // instead of hardcoding the inout we can take input from user also
        // a switch case could be created press 1 for area of square press 2 for area of
        // triangle
        shape[0] = new Square(5); // creating circle object at index 0
        shape[1] = new Triangle(2, 2); // creating rectangle object at index 1
        // Shape object is calling children classes method
        System.out.println("Area of the Square: " + shape[0].getVolume());
        System.out.println("Area of the Triangle: " + shape[1].getVolume());
    }
}