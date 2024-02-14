import java.util.*;
import java.io.*;
class NumberException extends Exception{
    public NumberException(String message){
        super(message);
    }
}
public class voter {
    public static void main(String arg[]) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = A.nextInt();
        try 
        {
            if (age > 18)
                System.out.println("Age is valid");
            else
                throw new NumberException("Age not valid");
        } 
        catch (NumberException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
    

