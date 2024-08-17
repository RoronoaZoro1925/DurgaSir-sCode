package MultiThreading;

public class GetSetThreadName
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        MyThread1 m = new MyThread1();
        Thread t = new Thread(m);
        System.out.println(t.getName());
        t.setName("Zoro's Sword");
        System.out.println(t.getName());
        System.out.println(Thread.currentThread());

    }
}
class MyThread1 implements Runnable
{

    @Override
    public void run() {

    }
}
