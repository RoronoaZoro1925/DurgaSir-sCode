package MultiThreading;

public class JoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {
/*        SabkiThread t = new SabkiThread();
        Thread t1 = new Thread(t);

        t1.start();
        t1.join();*/
        MainJoin t = new MainJoin();


        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Main Thread" + " " + i);

        }
    }
}
class SabkiThread implements Runnable
{
    @Override
    public void run()
    {
//        Thread.currentThread().setName("Zoro");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Child Thread" + " " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class MainJoin extends Thread
{
    static Thread mt;

    @Override
    public void run()
    {
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Child Thread" + " " + i);
        }

    }
}
