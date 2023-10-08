public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2020, "green");

    Car dodge = new Car("Dodge", 11000, 2019, "blue");

    System.out.println("Ths " + nissan.make + " is worth $" + nissan.price + ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    System.out.println("Ths " + dodge.make + " is worth $" + dodge.price + ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
  }
}