import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mainframe extends JFrame
{
Container c;
JLabel  name;
JButton b1, b2;

mainframe()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.black);

b1 = new JButton("Admin");
b2 = new JButton("User");

b1.setBackground(Color.white);
b2.setBackground(Color.white);

name = new JLabel("BLOOD BANK");
name.setForeground(Color.yellow);

Font f = new Font("Calibri", Font.BOLD, 30);

b1.setFont(f);
b2.setFont(f);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

c.add(name);
c.add(b1);
c.add(b2);

ActionListener a1 = (ae)->{user u = new user(); dispose();};
b2.addActionListener(a1);

setSize(700,650);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Main Frame");
setVisible(true);

}
}