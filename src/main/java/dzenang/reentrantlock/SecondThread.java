package dzenang.reentrantlock;

import dzenang.sumexample.SumCalculator;

public class SecondThread extends Thread {

  private SumCalculatorWithLock calculator;

  SecondThread(SumCalculatorWithLock calculator) {
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
