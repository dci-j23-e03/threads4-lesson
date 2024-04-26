package dzenang.volatileexample;

import static dzenang.volatileexample.VolatileExample.myInt;

public class ChangeMaker extends Thread {

  @Override
  public void run() {
    int localInt = myInt;
    while (myInt < 5) {
      System.out.println("Incrementing myInt to " + (localInt + 1));
      myInt = ++localInt;
      try {
        sleep(500);
      } catch (InterruptedException e) {
        System.out.println("Got interrupted: " + e.getMessage());
      }
    }
  }
}
