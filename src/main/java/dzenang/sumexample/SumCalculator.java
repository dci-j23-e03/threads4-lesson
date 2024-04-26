package dzenang.sumexample;

public class SumCalculator {
  private int sum = 0;

  // we can use synchronized keyword on method level, or code block level
  public void calculateSum(int n) {
    // not critical, so no need to synchronise
//    System.out.println("SumCalculator current sum: " + sum);

    // critical line, where we are updating sum variable
    // if not synchronized we can have one thread reads a value and while updating, in the meantime
    // second thread updates it, then the first is working with old value
    // with bigger sample (5000) we can end up with 1000 clashes like described above
    // and difference in result of 2000-3000
    synchronized (this) {
      sum += n;
    }
//    sum += (n * factor);
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }
}
