package lab05;
public class ShapeFactory {

    public enum ShapeType { CIRCLE, RECTANGLE, POLYGON }

    public static class Builder {
        private ShapeType type;
        private String name;
        private Point center;
        private double radius;
        private Point[] points;

        public Builder(ShapeType type) {
            this.type = type;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder center(Point center) {
            this.center = center;
            return this;
        }

        public Builder radius(double radius) {
            this.radius = radius;
            return this;
        }

        public Builder points(Point[] points) {
            this.points = points;
            return this;
        }

        public ShapeInterface build() {
            switch (type) {
                case CIRCLE:
                    return new Circle(name, center, radius);
                case RECTANGLE:
                    return new Rectangle(name, points); 
                case POLYGON:
                    return new Polygon(name, points);
                default:
                    throw new IllegalArgumentException("Unsupported shape type");
            }
        }
    }
    public static void main(String[] args) {
        ShapeInterface circle = new ShapeFactory.Builder(ShapeType.CIRCLE)
                .name("Circle-1")
                .center(new Point(0, 0))
                .radius(5)
                .build();

        circle.showInfo();
    }
}