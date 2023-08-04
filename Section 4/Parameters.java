public class Parameters {
  public static void main(String[] args) {
    calculateArea(2.3, 3.6);
    calculateArea(1.3, 3.4);
    calculateArea(5.3, 1.6);
  }

  public static void calculateArea(double length, double width) {
    System.out.println("Area is: " + ( length * width ));
  }
}
