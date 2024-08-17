package MultiThreading;

public class FirstThread
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i <5 ; i++)
        {
            System.out.println("Parent Thread");
        }

    }
}
class MyThread extends Thread
{
    public void run()
    {
        for (int i = 0; i <5 ; i++)
        {
            System.out.println("Child Thread");
        }
    }

    /*public void start()
    {
        super();
        System.out.println("Start Method");
    }
    *//*Never override Start() as it will be implemented as normal method*/
}
