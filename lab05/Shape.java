package lab05;
public abstract class Shape {
    protected String name;
    protected double area;
    protected double perimeter;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getArea() { return area; }
    public double getPerimeter() { return perimeter; }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}