import java.io.*;
public class filewrite 
{
    public static void main(String arg[])
        {
            FileOutputStream fout;
            try
                {
                    fout=new FileOutputStream("output.txt");
                    String sent="";
                    int id=111,mk1=40,mk2=50,mk3=50;
                    String name ="Arun";
                    sent=sent+id+" "+name+" "+mk1+" "+mk2+" "+mk3+"\n";
                    byte[] sentence=sent.getBytes();
                    fout.write(sentence);
                    sent=sent+112+" "+"Anamika"+" "+40+" "+40+" "+50;
                    sentence=sent.getBytes();
                    fout.write(sentence);
                    fout.close();
                }
            catch(Exception e)
                {
                    System.out.println(e);
                }
        }    
}
