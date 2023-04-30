class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point center, double radius) {
        this.center = new Point(center);
        this.radius = radius;
    }

    public Circle(Circle other) {
        this.center = new Point(other.center);
        this.radius = other.radius;
    }

    public void move(double dx, double dy) {
        this.center.move(dx, dy);
    }

    @Override
    public String toString() {
        return "Circle: center = " + center.toString() + ", radius = " + radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}