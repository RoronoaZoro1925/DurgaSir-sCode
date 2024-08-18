package MultiThreading;

public class Priority
{
    public static void main(String[] args)
    {
        MeriThread t = new MeriThread();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println(t1.getName());


    }
}
class MeriThread implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread" + " " + i);
        }
    }
}
