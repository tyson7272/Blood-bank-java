import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class UserInterface extends JFrame
{
Container c;
JLabel  name, space;
JButton Donor, Receiver, logout;

UserInterface()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.black);

space = new JLabel("                                                            ");
name = new JLabel("Select The Type");
name.setForeground(Color.yellow);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

Donor = new JButton("Donor");
Receiver = new JButton("Receiver");
logout = new JButton("Logout");

Donor.setBackground(Color.green);
Receiver.setBackground(Color.green);
logout.setBackground(Color.red);

Font f = new Font("Calibri", Font.BOLD, 30);

Donor.setFont(f);
Receiver.setFont(f);

Font e = new Font("Calibri", Font.BOLD, 15);
logout.setFont(e);

c.add(space);
c.add(logout);
c.add(name);
c.add(Donor);
c.add(Receiver);

ActionListener a1 = (ae)->{mainframe u = new mainframe(); dispose();};
logout.addActionListener(a1);

ActionListener a2 = (ae)->{DonorFrame df = new DonorFrame(); dispose();};
Donor.addActionListener(a2);

setSize(700,650);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Main Frame");
setVisible(true);

}
}
