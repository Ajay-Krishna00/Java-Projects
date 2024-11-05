/* 
 * Java program that implements a multi-threaded program which has three threads.
 * First thread generates a random integer every 1 second. If the value is even, second thread 
 * computes the square of the number and prints. If the value is odd the third thread will print 
 * the value of cube of the number.
*/
import java.util.Random;

class SharedData {
  int num;
  boolean processed = true;
  synchronized int getNum()
  {
    return num;
  }

  synchronized void setNum(int n)
  {
    this.num = n;
    this.processed = false;
  }
  synchronized boolean isProcessed()
  {
    return processed;
  }
  synchronized void setFlag(boolean p)
  {
    this.processed = p;
  }
}
class NumGen extends Thread 
{
  SharedData sd;
  NumGen(SharedData sd)
  {
    this.sd = sd;
  }

  public void run()
  {
    Random random = new Random();
    while (true) 
    {
      int n = random.nextInt(100);
      System.out.println("Generated Num is: "+n);
      synchronized (sd) 
      {
        sd.setNum(n);
        sd.notifyAll();
      }
      try
      {
        Thread.sleep(1000);
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
class Odd extends Thread 
{
  SharedData sd;
  Odd(SharedData sd)
  {
    this.sd = sd;
  }

  public void run()
  {
    while(true)
    {
      synchronized(sd)
      {
        if (sd.processed || sd.getNum()%2==0)
        {
          try {
            sd.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        else
        {
          System.out.println("Cube of " + sd.getNum() + " is: " + (sd.getNum() * sd.getNum() * sd.getNum()));
          sd.setFlag(true);
          sd.notifyAll();
        }
      }
    }
  }
}

class Even extends Thread {
  SharedData sd;

  Even(SharedData sd) {
    this.sd = sd;
  }

  public void run() {
    while (true) {
      synchronized (sd) {
        if (sd.processed || sd.getNum() % 2 != 0) {
          try {
            sd.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } else {
          System.out.println("Square of " + sd.getNum() + " is: " + (sd.getNum() * sd.getNum()));
          sd.setFlag(true);
          sd.notifyAll();
        }
      }
    }
  }
}

public class MultiThreadingEx {
  public static void main(String args[])
  {
    SharedData sd = new SharedData();
    NumGen nm = new NumGen(sd);
    Odd od = new Odd(sd);
    Even ev = new Even(sd);
    nm.start();
    od.start();
    ev.start();
  }
}
