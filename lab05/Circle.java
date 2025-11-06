package lab05;

public class Circle extends Shape implements ShapeInterface {
    private Point center;
    private double radius;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.center = center;
        this.radius = radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void showInfo() {
        System.out.println(getInfo());
    }

    @Override
    public String getInfo() {
        return "Circle: " + name + " | Center: " + center +
               " | Radius: " + radius +
               " | Area: " + area +
               " | Perimeter: " + perimeter;
    }
}