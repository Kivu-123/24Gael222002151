public class swtchcase 
{
    public static void main(String[] args)
    {
        String position = "Stock Manager"; 
         switch (position)
         {
            case "Manager":
            System.out.println("Your work is record business transactions");
            break;
            case "Stock Manager":
            System.out.println("Your work is to take care of the stock");
            break;
            case "Receptionist":
            System.out.println("Your work is to provide customer care");
            case "Security Guard":
            System.out.println("Your work is to provide security");
            break;
            default:
            System.out.println("You are an intern");
         }
    }
}
