package dzenang.atomicexample;

public class FirstThread extends Thread {

  private SumCalculator calculator;

  FirstThread(SumCalculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
//      System.out.println("FirstThread:run() iteration " + (i + 1));
      calculator.calculateSum(1);
    }
  }
}
