public class lecturer 
{
    public static void main(String[] args)
    { 
        String position = "Receptionist";  
        if(position == "Manager")
        {  
        System.out.println(" Your work is to record business transactions");  
        }
        else if (position == "Stock Manager")
        {  
        System.out.println("Your work is to take care of the stock");  
        }
        else if(position == "Receptionist") 
        {  
        System.out.println("Your work is to provide customer care");  
        }
        else if(position == "Security Guard")
        {
        System.out.println("Your work is to provide security");
        }
        else
        {  
        System.out.println("You are an intern");
        }
    }
}
