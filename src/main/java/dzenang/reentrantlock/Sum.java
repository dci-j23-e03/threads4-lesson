package dzenang.reentrantlock;

public class Sum {

  private int sum = 0;

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public synchronized void updateSum(int n) {
    sum += n;
  }
}
