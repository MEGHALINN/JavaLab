import java.io.*;
public class file 
{
    public static void main(String arg[])
        {
            FileInputStream fin;
            try
                {
                    fin=new FileInputStream("student_details.txt");
                    int c;
                    c=fin.read();
                    while(c!=-1)
                        {
                            System.out.println((char)c);
                            c=fin.read();
                        }
                    fin.close();
                }
            catch(Exception e)
                {
                    System.out.println(e);   
                }      
        }
}