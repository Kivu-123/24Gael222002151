public class doEx1
{
    public static void main(String[] args)
	{
		int x = 21, sum = 0;
		do 
        {
			sum += x;
			x--;
		}
		while (x > 8);
		System.out.println("the total sum equals " + sum);
	}
}