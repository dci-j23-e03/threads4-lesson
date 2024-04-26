package dzenang.printerexample;

public class Thread1 extends Thread {
  private Printer printer;

  Thread1(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void run() {
    System.out.println("Thread1:run() enters");
    printer.printNumbers(5);
    System.out.println("Thread1:run() exits");
  }
}
