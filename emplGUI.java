import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class emplGUI implements ActionListener
{
    JTextField id,name,bp,da,hra;
    JButton total,save;
    JTextField totalsal;

    emplGUI()
    {   
        JFrame jf=new JFrame("Employee Details");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(7,2));

        JLabel empid=new JLabel("EMPID :");
        id=new JTextField(20);
        jf.add(empid);
        jf.add(id);

        JLabel empname=new JLabel("Name :");
        name=new JTextField(20);
        jf.add(empname);
        jf.add(name);

        JLabel basicp=new JLabel("Basic Pay :");
        bp=new JTextField(20);
        jf.add(basicp);
        jf.add(bp);

        JLabel DA =new JLabel("DA :");
        da=new JTextField(20);
        jf.add(DA);
        jf.add(da);

        JLabel HRA=new JLabel("HRA :");
        hra=new JTextField(20);
        jf.add(HRA);
        jf.add(hra);

        save=new JButton("Save Data");
        save.addActionListener(this);
        jf.add(save);

        total=new JButton("Calculate Salary");
        total.addActionListener(this);
        jf.add(total);

        JLabel totsal=new JLabel("Total Salary :");
        totalsal =new JTextField(20);
        jf.add(totsal);
        jf.add(totalsal);

        jf.pack();

    }

    public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==save)
                writedata();
            if(ae.getSource()==total)
                calcsalary();
        }

    void writedata()
        {
            FileOutputStream fout;
            try
                {
                    fout=new FileOutputStream("emp_details.txt");
                    String s="";
                    s+=(id.getText());
                    s+=" "+(name.getText());
                    s+=" "+(bp.getText());
                    s+=" "+(da.getText());
                    s+=" "+(hra.getText());
                    byte[] sent=s.getBytes();
                    fout.write(sent);
                    fout.close();
                }
            catch(Exception e)
                {
                    System.out.println(e);
                }
        }
    void calcsalary()
        {
            int total;
            String basic=bp.getText().trim();
            String dadk=da.getText().trim();
            String hradk=hra.getText().trim();
            int num1=Integer.parseInt(basic);
            int num2=Integer.parseInt(dadk);
            int num3=Integer.parseInt(hradk);
            total=num1+num2+num3;
            totalsal.setText(""+total);
        }
    public static void main(String arg[])
        {
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    new emplGUI();
                }
            });
        }
    
}
