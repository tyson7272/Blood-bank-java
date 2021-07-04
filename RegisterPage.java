import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterPage extends JFrame
{
Container c;
JButton org, user, back;
RegisterPage()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.gray);

org = new JButton("ORGANIZATION");
user = new JButton("USER");
back = new JButton("BACK");

org.setBackground(Color.white);
user.setBackground(Color.white);
back.setBackground(Color.white);

Font f = new Font("Calibri", Font.BOLD, 30);
org.setFont(f);
user.setFont(f);
back.setFont(f);

c.add(org);
c.add(user);
c.add(back);

ActionListener a1 = (ae)->{OrgRegFrame o = new OrgRegFrame(); dispose();};
org.addActionListener(a1);
ActionListener a2 = (ae)->{UserRegFrame u = new UserRegFrame(); dispose();};
user.addActionListener(a2);
ActionListener a3 = (ae)->{MainFrame m = new MainFrame(); dispose();};
back.addActionListener(a3);

setSize(350,500);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Register Page");
setVisible(true);
}
}
