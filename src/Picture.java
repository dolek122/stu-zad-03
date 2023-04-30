import java.util.ArrayList;

public class Picture {
    private ArrayList<Point> points;
    private ArrayList<Section> sections;
    private ArrayList<Circle> circles;

    public Picture() {
        this.points = new ArrayList<Point>();
        this.sections = new ArrayList<Section>();
        this.circles = new ArrayList<Circle>();
    }

    public void addPoint(Point p) {
        this.points.add(p);
    }

    public void addSection(Section s) {
        this.sections.add(s);
    }

    public void addCircle(Circle c) {
        this.circles.add(c);
    }

    public void move(double dx, double dy) {
        for (Point p : this.points) {
            p.move(dx, dy);
        }
        for (Section s : this.sections) {
            s.move(dx, dy);
        }
        for (Circle c : this.circles) {
            c.move(dx, dy);
        }
    }

    public double getArea() {
        double area = 0;
        for (Point p : this.points) {
            area += p.getArea();
        }
        for (Section s : this.sections) {
            area += s.getArea();
        }
        for (Circle c : this.circles) {
            area += c.getArea();
        }
        return area;
    }

    @Override
    public String toString() {
        String result = "";
        for (Point p : this.points) {
            result += p.toString() + "\n";
        }
        for (Section s : this.sections) {
            result += s.toString() + "\n";
        }
        for (Circle c : this.circles) {
            result += c.toString() + "\n";
        }
        return result;
    }
}