class Section {
    private Point p1;
    private Point p2;

    public Section() {
        this.p1 = new Point();
        this.p2 = new Point();
    }

    public Section(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Section(Section other) {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
    }

    public void move(double dx, double dy) {
        this.p1.move(dx, dy);
        this.p2.move(dx, dy);
    }

    @Override
    public String toString() {
        return "Section: " + p1.toString() + " - " + p2.toString();
    }

    public double getArea() {
        return 0;
    }
}