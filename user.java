import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class user extends JFrame
{
Container c;
JLabel  name;
JButton b1, b2, back;

user()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.black);

b1 = new JButton("Register");
b2 = new JButton("Login");
back = new JButton("Back");

b1.setBackground(Color.white);
b2.setBackground(Color.white);
back.setBackground(Color.white);

name = new JLabel("URER LOGIN");
name.setForeground(Color.yellow);

Font f = new Font("Calibri", Font.BOLD, 30);

b1.setFont(f);
b2.setFont(f);
back.setFont(f);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

c.add(name);
c.add(b1);
c.add(b2);
c.add(back);

ActionListener a1 = (ae)->{login l = new login(); dispose();};
b2.addActionListener(a1);

ActionListener a2 = (ae)->{mainframe m = new mainframe(); dispose();};
back.addActionListener(a2);

setSize(700,650);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Main Frame");
setVisible(true);

}
}