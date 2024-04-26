package dzenang.reentrantlock;

public class SumExample {

  public static void main(String[] args) {
    SumCalculatorWithLock sumCalculator = new SumCalculatorWithLock();
    FirstThread firstThread = new FirstThread(sumCalculator);
    SecondThread secondThread = new SecondThread(sumCalculator);

    firstThread.start();
    secondThread.start();

    try {
      firstThread.join();
      secondThread.join();
    } catch (InterruptedException e) {
      System.out.println("Got interrupted: " + e.getMessage());
    }

    System.out.println("Sum in the end of execution: " + sumCalculator.getSum().getSum());
  }

}
