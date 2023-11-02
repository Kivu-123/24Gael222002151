public class Q1 
{
    public int saving(int amount, int rate, int years)
    {
        return amount*rate/100*years;
    }
    public static void main(String[] args)
    {
        Q1 bin=new Q1();
        int answer= bin.saving(100000,5,5);
        System.out.println(answer);
    }
}
