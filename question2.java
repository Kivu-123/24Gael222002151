public class question2 
{
    double un;
    double deux;
    double temporary;
    public void before()
    {
        System.out.println("before swap");
        System.out.println("first number=" +un);
        System.out.println("second number=" +deux);
        temporary=un;
        un=deux;
        deux=temporary;
    }
}
class show extends question2
{
    public void after()
    {
    System.out.println("after swap");
    System.out.println("first number=" +un);
    System.out.println("second number=" +deux);
    }
}
class Main
{
    public static void main(String[] args)
    {
        show result= new show();
        result.un=1.20;
        result.deux=2.56;
        result.before();
        result.after();
    }
}
