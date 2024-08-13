package OverloadingConcepts;

public class MethodResolution
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.m1();
        t.m1(2);
        t.m1(10.5);
        t.m1('a');
    }
}
class Test
{
    public void m1()
    {
        System.out.println("no-arg");
    }
    public void m1(int i)
    {
        System.out.println("int-arg");
    }
    public void m1(double d)
    {
        System.out.println("double-arg");
    }
}
