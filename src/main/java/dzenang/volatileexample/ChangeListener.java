package dzenang.volatileexample;

import static dzenang.volatileexample.VolatileExample.myInt;

public class ChangeListener extends Thread {

  @Override
  public void run() {
    int localInt = myInt;
    while (localInt < 5) {
      if (localInt != myInt) {
        System.out.println("Got change for myInt: " + myInt);
        localInt = myInt;
      }
    }
  }
}
