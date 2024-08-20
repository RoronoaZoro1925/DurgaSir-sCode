package MultiThreading;

public class InterruptMethod
{
    public static void main(String[] args) {
        TeriThread t = new TeriThread();
        t.start();
        t.interrupt();
        System.out.println("End of Main");
    }
}

class TeriThread extends Thread
{
    @Override
    public void run()
    {
        try {
            for (int i = 0; i <5 ; i++)
            {
                System.out.println("I am Lazy Thread" + i);
                Thread.sleep(20000);

            }
        }
        catch (InterruptedException e)
        {
            System.out.println("I got Interrupted");
        }

    }
}
