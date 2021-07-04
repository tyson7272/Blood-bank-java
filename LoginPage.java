import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginPage extends JFrame{
Container c;
JLabel  name, lblID, lblpass;
JTextField txtID, txtpass;
JButton login, back;

LoginPage(){
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,10));
c.setBackground(Color.gray);

name = new JLabel("Enter Login Detils");
name.setForeground(Color.black);

lblID = new JLabel("Enter ID");
txtID = new JTextField(15);
lblpass = new JLabel("\nEnter Password");
txtpass = new JTextField(15);

lblID.setForeground(Color.black);
lblpass.setForeground(Color.black);

login = new JButton("Login!");
back = new JButton("Back");

Font f = new Font("Calibri", Font.BOLD, 30);
lblID.setFont(f);
txtID.setFont(f);
lblpass.setFont(f);
txtpass.setFont(f);
login.setFont(f);
back.setFont(f);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

c.add(name);
c.add(lblID);
c.add(txtID);
c.add(lblpass);
c.add(txtpass);
c.add(login);
c.add(back);

/*
ActionListener a1 = (ae)->{};login.addActionListener(a1);
*/
ActionListener a2 = (ae)->{MainFrame m = new MainFrame(); dispose();};
back.addActionListener(a2);

setSize(500,600);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Login Page");
setVisible(true);
}
}
