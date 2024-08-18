package MultiThreading;

public class RunnableMethod
{
    public static void main(String[] args)
    {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        Thread t1 = new Thread();
        t.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main Thread");
        }

    }
}
class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Child Thread");
        }

    }
}
