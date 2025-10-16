public class Rectangle extends Shape implements ShapeInterface {
    private Point[] points;

    public Rectangle(String name, Point[] points) {
        super(name);
        this.points = points;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        double width = Point.distance(points[0], points[1]);
        double height = Point.distance(points[1], points[2]);
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        double width = Point.distance(points[0], points[1]);
        double height = Point.distance(points[1], points[2]);
        return 2 * (width + height);
    }

    @Override
    public void showInfo() {
        System.out.println("Rectangle: " + name);
        for (int i = 0; i < points.length; i++) {
            System.out.println("Point " + (i + 1) + ": (" + points[i].x + ", " + points[i].y + ")");
        }
    }

    @Override
    public String getInfo() {
        return "Rectangle: " + name + " | Area: " + area + " | Perimeter: " + perimeter;
    }
}