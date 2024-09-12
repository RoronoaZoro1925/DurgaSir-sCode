package MultiThreading;

public class NotifyMethod
{
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.start();
        Integer x=128;
        Integer y = 128;
        System.out.println(x==y);
        synchronized (a)
        {
            System.out.println("Main thread trying to call wait() method");
            a.wait();

            System.out.println("Main thread got notification");
            System.out.println(a.total);
        }
    }
}
class ThreadA extends Thread
{
    int total = 0;

    @Override
    public void run()
    {
        synchronized (this)
        {
            System.out.println("Child Thread to start code");
            for (int i = 0; i <10 ; i++)
            {
                total=total+i;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread trying to give notification");
//            this.notify();
        }

    }
}
