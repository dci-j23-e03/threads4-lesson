package dzenang.volatileexample;

public class VolatileExample {
  public static volatile int myInt = 0;

  public static void main(String[] args) {
    new ChangeListener().start();
    new ChangeMaker().start();
  }
}
