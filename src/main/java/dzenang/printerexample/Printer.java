package dzenang.printerexample;

public class Printer {

  synchronized void printNumbers(int n) {
    System.out.println("Printer:printNumbers(" + n + ") enters");
    for (int i = 1; i <= 5; i++) {
      System.out.println(n * i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted: " + Thread.currentThread().getName());
      }
    }
    System.out.println("Printer:printNumbers(" + n + ") exits");
  }
}
