import java.io.*;
public class filereader 
{
    public static void main(String arg[])
        {
            FileReader fr;
            try
                {
                    fr=new FileReader("student_details.txt");
                    BufferedReader br=new BufferedReader(fr);
                    String s;
                    while((s=br.readLine())!=null)
                        {
                            System.out.println(s);
                        }
                    fr.close();
                }
            catch(Exception e)
                {
                    System.out.println(e);
                }
        }
}
