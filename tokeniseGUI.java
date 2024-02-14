import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class tokeniseGUI implements ActionListener
{
    JTextField input;
    JButton read;
    tokeniseGUI()
        {
            JFrame jf=new JFrame("Tokeniser");
            jf.setSize(400,400);
            jf.setVisible(true);
            jf.setLayout(new GridLayout(4,1));
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            input=new JTextField(40);
            jf.add(input);

            read=new JButton("Read");
            read.addActionListener(this);
            jf.add(read);

            jf.pack();
        }
    public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==read)
                writefile();
        }
    void writefile()
        {
            FileOutputStream fout;
            try 
            {
                fout=new FileOutputStream("college.txt");
                String s=input.getText();
                byte[] sent;
                int m=111;
                StringTokenizer sr=new  StringTokenizer(s," ");
                while(sr.hasMoreTokens())
                    {
                        sent=(""+m+" " +sr.nextToken()+" \n").getBytes();
                        m=m+1;
                        fout.write(sent);
                    }
                fout.close();
            }
            catch(Exception e)
                {
                    e.printStackTrace();
                }
        }
    public static void main(String arg[])
        {
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    new tokeniseGUI();
                }
            });
        }
}
