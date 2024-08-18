package MultiThreading;

public class YieldDemo
{
    public static void main(String[] args)
    {
        UskiThread t = new UskiThread();
//        t.setPriority(10);
//        Thread.currentThread().setPriority(10);
        t.start();
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Main Thread" + " " + i);

        }

    }

}
class UskiThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Child Thread" + " " + i);
            Thread.yield();
        }

    }
}
