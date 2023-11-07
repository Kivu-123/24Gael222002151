public class addermain 
{
    public int add(int num1, int num2)
    {
        return num1+ num2;
    }
    public static void main(String[] args) 
    {
        addermain myadder= new addermain();
        int result= myadder.add(5,3);
        System.out.println(result);
    }
}
