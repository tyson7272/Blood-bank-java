import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SuccessRegister extends JFrame
{
Container c;
JLabel  name;
JButton login;

SuccessRegister()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,70));
c.setBackground(Color.black);

name = new JLabel("You Have Successfully Created Account");
name.setForeground(Color.yellow);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

login = new JButton("Login");
login.setBackground(Color.green);

Font f = new Font("Calibri", Font.BOLD, 30);

login.setFont(f);

c.add(name);
c.add(login);

ActionListener a1 = (ae)->{UserLogin ul = new UserLogin(); dispose();};
login.addActionListener(a1);

setSize(800,950);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Main Frame");
setVisible(true);

}

}