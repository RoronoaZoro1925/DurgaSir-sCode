package OOPSConcept;

public class IsARelationship
{
    public static void main(String[] args)
    {
//        Parent parent =new Parent();
//        parent.m1();
        Child child = new Child();
//        child.m2();
        child.m1();
//        Parent parentChild = new Child();
//        parentChild.m1();

    }

}

class Parent implements Parent1
{
    public Parent()
    {
        System.out.println("This is parent");
    }
    public void m1()
    {
        System.out.println("Parent");
    }
}

class Child implements Parent1
{
    public Child()
    {
        System.out.println("This is Child");
    }
    public void m2()
    {
        System.out.println("Child");
    }

    @Override
    public void m1()
    {
        System.out.println("Child");

    }
}
