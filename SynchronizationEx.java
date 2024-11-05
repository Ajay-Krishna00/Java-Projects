class Counter 
{
  int count=0;
  
  synchronized void increment()//if synchronized is not used then the output will be less than 20000
  {
    count++;
  }

  int getCount()
  {
    return count;
  }
}
class MyThread extends Thread 
{
  Counter c;
  MyThread(Counter c)
  {
    this.c = c;
  }

  public void run()
  {
    for (int i=0;i<10000;i++)
    {
      c.increment();
    }
  }
}
public class SynchronizationEx {
  public static void main (String args[])
  {
    Counter c = new Counter();
    MyThread t1 = new MyThread(c);
    MyThread t2 = new MyThread(c);
    t1.start();
    t2.start();
    try
    {
      t1.join();
      t2.join();
    }
    catch (InterruptedException e)
    {
      System.out.println(e);
    }
    System.out.println("Count is: " + c.getCount());
  }
}
