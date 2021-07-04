import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame{
Container c;
JLabel name;
JButton b1, b2, exit;
MainFrame(){
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.gray);

b1 = new JButton("Register?");
b2 = new JButton("Login!");
exit = new JButton("Exit!");

b1.setBackground(Color.white);
b2.setBackground(Color.white);
exit.setBackground(Color.white);

name = new JLabel("BLOOD BANK");
name.setForeground(Color.black);

Font f = new Font("Calibri", Font.BOLD, 30);
b1.setFont(f);
b2.setFont(f);
exit.setFont(f);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

c.add(name);
c.add(b1);
c.add(b2);
c.add(exit);

ActionListener a1 = (ae)->{RegisterPage r = new RegisterPage(); dispose();};
b1.addActionListener(a1);
ActionListener a2 = (ae)->{LoginPage l = new LoginPage(); dispose();};
b2.addActionListener(a2);
ActionListener a3 = (ae)->{System.exit(0);};
exit.addActionListener(a3);

setSize(350,500);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Blood Bank Management System!");
setVisible(true);
}
}