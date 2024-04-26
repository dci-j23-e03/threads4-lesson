package dzenang.atomicexample;

import java.util.concurrent.atomic.AtomicInteger;

public class SumCalculator {
  private AtomicInteger sum = new AtomicInteger(0);

  public void calculateSum(int n) {
    // this is our critical section
    sum.getAndAdd(n);
  }

  public int getSum() {
    return sum.get();
  }

  public void setSum(int sum) {
    this.sum.set(sum);
  }
}
