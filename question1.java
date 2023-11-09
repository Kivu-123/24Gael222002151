public class question1 
{
    //method of the parent class
    String registration_number;
    public void done()
    {
        System.out.println("you have registered");
    }
}
// derive from question1 class
class information extends question1 
{
    // new method in subclass
    public void display() 
    {
        System.out.println("Your name is " +registration_number);
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        // create an object of the subclass
        information student = new information ();
        // access data of class
        student.registration_number = "222002151";
        student.display ();
        // call method of class using object of subclass
        student.done();
    }
}