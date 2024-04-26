package dzenang.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SumCalculatorWithLock {

  private Sum sum = new Sum();
  Lock lock = new ReentrantLock();

  public Sum calculateSum(int n) {
    // lock implementation
    // lock
    lock.lock();
    // execute
    try {
      sum.updateSum(n);
    } finally {
      // unlock
      lock.unlock();
    }
    return sum;
  }

//  public Sum calculateSum(int n) {
//    // tryLock implementation
//    // lock
//    boolean isLockAcquired = false;
//    try {
//      isLockAcquired = lock.tryLock(1, TimeUnit.SECONDS);
//    } catch (InterruptedException e) {
//      System.out.println("Got interrupted: " + e.getMessage());
//    }
//    // execute
//    if (isLockAcquired) {
//      try {
//        sum.updateSum(n);
//      } finally {
//        // unlock
//        lock.unlock();
//      }
//    }
//    return sum;
//  }

  public Sum getSum() {
    return sum;
  }

}
