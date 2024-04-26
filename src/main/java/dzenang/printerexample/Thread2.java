package dzenang.printerexample;

public class Thread2 extends Thread {
  private Printer printer;

  Thread2(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void run() {
    System.out.println("Thread2:run() enters");
    printer.printNumbers(100);
    System.out.println("Thread2:run() exits");
  }
}
