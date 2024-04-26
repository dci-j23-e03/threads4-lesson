package dzenang.sumexample;

public class SecondThread extends Thread {

  private SumCalculator calculator;

  SecondThread(SumCalculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
//      System.out.println("SecondThread:run() iteration " + (i + 1));
      calculator.calculateSum(1);
    }
  }
}
