public class Two 
{
    public int loan(int amount,int years)
    {
        return amount*(1+(18/12/100)^years*12);
    }
    public static void main(String[] args)
    {
        Two ln= new Two();
        int result= ln.loan(500000,3);
        System.out.println(result);
    }
}
