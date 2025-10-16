public class Polygon extends Shape implements ShapeInterface {
    private Point[] points;

    public Polygon(String name, Point[] points) {
        super(name);
        this.points = points;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        double sum = 0;
        int n = points.length;
        for (int i = 0; i < n - 1; i++) {
            sum += (points[i].x * points[i + 1].y) - (points[i + 1].x * points[i].y);
        }
        return 0.5 * Math.abs(sum);
    }

    @Override
    public double calculatePerimeter() {
        double p = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            p += Point.distance(points[i], points[(i + 1) % n]);
        }
        return p;
    }

    @Override
    public void showInfo() {
        System.out.println("Polygon: " + name);
        for (int i = 0; i < points.length; i++) {
            System.out.println("Point " + (i + 1) + ": (" + points[i].x + ", " + points[i].y + ")");
        }
    }

    @Override
    public String getInfo() {
        return "Polygon: " + name + " | Area: " + area + " | Perimeter: " + perimeter;
    }
}