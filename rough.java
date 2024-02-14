import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class rough implements ActionListener
{
    JTextField rollno,name,mark1,mark2,mark3;
    JButton importb,calculate;
    JTextField total;
    rough()
        {
            JFrame jf=new JFrame("Student Marks");
            jf.setSize(400,400);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLayout(new GridLayout(7,2));

            JLabel roll,nam,mk1,mk2,mk3;

            roll=new JLabel("Roll No :");
            rollno=new JTextField(20);
            jf.add(roll);
            jf.add(rollno);

            nam=new JLabel("Name :");
            name=new JTextField(20);
            jf.add(nam);
            jf.add(name);

            mk1=new JLabel("Mark1 :");
            mark1=new JTextField(20);
            jf.add(mk1);
            jf.add(mark1);

            mk2=new JLabel("Mark2 :");
            mark2=new JTextField(20);
            jf.add(mk2);
            jf.add(mark2);

            mk3=new JLabel("Mark3 :");
            mark3=new JTextField(20);
            jf.add(mk3);
            jf.add(mark3);

            importb=new JButton("Import Data");
            importb.addActionListener(this);

            calculate=new JButton("Calculate Total");
            calculate.addActionListener(this);
            jf.add(importb);
            jf.add(calculate);

            total=new JTextField(20);
            total.setEditable(false);
            jf.add(total);
            jf.pack();
        }

    public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==importb)
                importdata();
            if(ae.getSource()==calculate)
                calculatemarks();
            
        }
    void importdata()
        {
            try
            {
                BufferedReader bf=new BufferedReader(new FileReader("student_details.txt"));
                rollno.setText(bf.readLine());
                name.setText(bf.readLine());
                mark1.setText(bf.readLine());
                mark2.setText(bf.readLine());
                mark3.setText(bf.readLine());
                bf.close();
            }
            catch(Exception e)
                {
                    System.out.println(e);
                }
        }

    void calculatemarks()
        {
            String marks1=mark1.getText().trim();
            String marks2=mark2.getText().trim();
            String marks3=mark3.getText().trim();
            
            int m1=Integer.parseInt(marks1);
            int m2=Integer.parseInt(marks2);
            int m3=Integer.parseInt(marks3);

            int totalm=m1+m2+m3;
            total.setText(totalm+"");
        }

        public static void main(String arg[])
        {
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    new rough();
                }

            });
        }
}
