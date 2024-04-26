package dzenang.reentrantlock;

public class FirstThread extends Thread {

  private SumCalculatorWithLock calculator;

  FirstThread(SumCalculatorWithLock calculator) {
    this.calculator = calculator;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
//      System.out.println("FirstThread:run() iteration " + (i + 1));
      Sum sum = calculator.calculateSum(1);
      sum.updateSum(1);
    }
  }
}
