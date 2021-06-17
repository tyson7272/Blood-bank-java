import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame
{
Container c;
JLabel  name, lblemail, lblpass;
JTextField txtemail, txtpass;
JButton login, back;

login()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.black);

name = new JLabel("Enter Login Detils");
name.setForeground(Color.yellow);

lblemail = new JLabel("Email");
txtemail = new JTextField(15);
lblpass = new JLabel("Password");
txtpass = new JTextField(15);

lblemail.setForeground(Color.white);
lblpass.setForeground(Color.white);

login = new JButton("Login");
back = new JButton("Back");

Font f = new Font("Calibri", Font.BOLD, 30);
lblemail.setFont(f);
txtemail.setFont(f);
lblpass.setFont(f);
txtpass.setFont(f);
login.setFont(f);
back.setFont(f);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

c.add(name);
c.add(lblemail);
c.add(txtemail);
c.add(lblpass);
c.add(txtpass);
c.add(login);
c.add(back);

ActionListener a1 = (ae)->{user u = new user(); dispose();};
back.addActionListener(a1);

setSize(700,650);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Main Frame");
setVisible(true);

}
}