public class Square extends Rectangle{
  
  public Square(double aSide){
    super(aSide, aSide);
    sideLength = aSide;
  }

  protected double area(){
    return sideLength * sideLength;
  }

  protected double perimeter(){
    return 4*sideLength;
  }

  public void results(){
    System.out.println("The side length of the square is " + getSideLength() + ".");
    System.out.format("The area for this square is %.2f and the perimeter is %.2f.\n\n", area(), perimeter());
  }
}