import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Picture picture = new Picture();

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj punkt");
            System.out.println("2. Dodaj odcinek");
            System.out.println("3. Dodaj okrąg");
            System.out.println("4. Wyświetl obraz");
            System.out.println("5. Przesuń obraz");
            System.out.println("6. Wyświetl sumę pól");
            System.out.println("0. Wyjdź");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Podaj x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Podaj y: ");
                    double y = scanner.nextDouble();
                    Point point = new Point(x, y);
                    picture.addPoint(point);
                    break;
                case 2:
                    System.out.println("Podaj punkty końcowe odcinka:");
                    System.out.print("x1: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("y1: ");
                    double y1 = scanner.nextDouble();
                    System.out.print("x2: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("y2: ");
                    double y2 = scanner.nextDouble();
                    Point startPoint = new Point(x1, y1);
                    Point endPoint = new Point(x2, y2);
                    Section section = new Section(startPoint, endPoint);
                    picture.addSection(section);
                    break;
                case 3:
                    System.out.print("Podaj środek okręgu:");
                    System.out.print("x: ");
                    double centerX = scanner.nextDouble();
                    System.out.print("y: ");
                    double centerY = scanner.nextDouble();
                    System.out.print("Podaj promień okręgu: ");
                    double radius = scanner.nextDouble();
                    Point centerPoint = new Point(centerX, centerY);
                    Circle circle = new Circle(centerPoint, radius);
                    picture.addCircle(circle);
                    break;
                case 4:
                    System.out.println(picture.toString());
                    break;
                case 5:
                    System.out.print("Podaj wektor przesunięcia:");
                    System.out.print("dx: ");
                    double dx = scanner.nextDouble();
                    System.out.print("dy: ");
                    double dy = scanner.nextDouble();
                    picture.move(dx, dy);
                    break;
                case 6:
                    System.out.println("Suma pól: " + picture.getArea());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Niepoprawna opcja.");
            }
        }
    }
}
