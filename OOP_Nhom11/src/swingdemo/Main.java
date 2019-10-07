
package swingdemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Main extends JFrame{
    JLabel lb1,lb2,lb3,lb4;
    JTextField txt1,txt2,txt3;
    JButton bt1,bt2;
    public Main(){
        setTitle("Demo the title");
        setSize(400,300);//do rong cua bang
        setLocation(200,200);//vtri
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1 = new JLabel("Nhap a: ");
        lb2 = new JLabel("Nhap b: ");
        lb3 = new JLabel("Nhap c: ");
        lb4 = new JLabel("Ket qua: ");
        
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
     
        bt1 = new JButton("Thoat");
        bt2 = new JButton("Giai PT");
        
        setLayout(null);
        
        lb1.setBounds(50,50,80,20);
        lb2.setBounds(50,90,80,20);
        lb3.setBounds(50,130,80,20);
        lb4.setBounds(50,170,240,20);
        lb4.setForeground(Color.red);
        lb4.setFont(new Font("Courier New", Font.BOLD, 24));
        
        txt1.setBounds(150,50,80,20);
        txt2.setBounds(150,90,80,20);
        txt3.setBounds(150,130,80,20);
        
        bt1.setBounds(50,210,80,20);
        bt2.setBounds(150,210,120,20);
        
        bt1.setBackground(Color.yellow);
        bt2.setBackground(Color.yellow);
        
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(txt1);
        add(txt2);
        add(txt3);
        add(bt1);
        add(bt2);
        
       bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Co thoat khong", "Thoat", JOptionPane.YES_NO_OPTION);
                if(option == JOptionPane.YES_OPTION) System.exit(0);
                
            }
        });
       bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txt1.getText().trim());
                double b = Double.parseDouble(txt2.getText().trim());
                double c = Double.parseDouble(txt3.getText().trim());
                double delta = b*b-4*a*c;
                String st = "";
                if(delta<0){
                    st="vo nghiem";
                }
                else if(delta==0){
                    st = "x1=x2="+(-b/(2*a));
                }
                else{
                    double x1 = (((-b+Math.sqrt(delta))/(2*a)));
                    double x2 = (((-b-Math.sqrt(delta))/(2*a)));
                    st = "x1="+x1+",x2="+x2;
                }
             lb4.setText(st);// luu y 
            }
        });
       
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.setVisible(true);
    }
}
