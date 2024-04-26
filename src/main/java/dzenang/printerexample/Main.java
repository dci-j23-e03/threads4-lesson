package dzenang.printerexample;

public class Main {

  public static void main(String[] args) {
    Printer printer = new Printer();
    Thread1 printWith5 = new Thread1(printer);
    Thread2 printWith100 = new Thread2(printer);

    printWith5.start();
    printWith100.start();
  }
}