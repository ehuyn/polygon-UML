import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Pentagon
    System.out.println("---PENTAGON---");
    System.out.print("Side length: ");
    double sideLength = in.nextDouble();
    Pentagon pent = new Pentagon(sideLength);
    pent.results();

    System.out.print("New side length: ");
    sideLength = in.nextDouble();
    pent.setSideLength(sideLength);
    pent.results();

    // Hexagon
    System.out.println("---HEXAGON---");
    System.out.print("Side length: ");
    sideLength = in.nextDouble();
    Hexagon hex = new Hexagon(sideLength);
    hex.results();

    System.out.print("New side length: ");
    sideLength = in.nextDouble();
    hex.setSideLength(sideLength);
    hex.results();
    
    // Parallelogram
    System.out.println("---PARALLELOGRAM---");
    System.out.print("Base: ");
    sideLength = in.nextDouble();
    System.out.print("Height: ");
    double height = in.nextDouble();
    Parallelogram par = new Parallelogram(sideLength, height);
    par.results();

    System.out.print("New base: ");
    sideLength = in.nextDouble();
    par.setSideLength(sideLength);
    System.out.print("New height: ");
    height = in.nextDouble();
    par.setHeight(height);
    par.results();
    
    // Rectangle
    System.out.println("---RECTANGLE---");
    System.out.print("Base: ");
    sideLength = in.nextDouble();
    System.out.print("Height: ");
    height = in.nextDouble();
    Rectangle rect = new Rectangle(sideLength, height);
    rect.results();

    System.out.print("New base: ");
    sideLength = in.nextDouble();
    rect.setSideLength(sideLength);
    System.out.print("New height: ");
    height = in.nextDouble();
    rect.setHeight(height);
    rect.results();
    
    // Square
    System.out.println("---SQUARE---");
    System.out.print("Side length: ");
    sideLength = in.nextDouble();
    Square sqr = new Square(sideLength);
    sqr.results();

    System.out.print("New side length: ");
    sideLength = in.nextDouble();
    sqr.setSideLength(sideLength);
    sqr.results();
  }
}