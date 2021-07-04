import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DonorFrame extends JFrame
{
Container c;
JLabel  name;
JButton submit, back;

DonorFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER,200,40));
c.setBackground(Color.black);

name = new JLabel("Enter Your Blood Details");
name.setForeground(Color.yellow);

Font g = new Font("Calibri", Font.ITALIC, 50);
name.setFont(g);

submit = new JButton("Submit");
back = new JButton("Back");

Font f = new Font("Calibri", Font.BOLD, 30);

submit.setFont(f);
back.setFont(f);

c.add(name);
c.add(submit);
c.add(back);

ActionListener a1 = (ae)->{UserInterface u = new UserInterface(); dispose();};
back.addActionListener(a1);

setSize(700,650);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Main Frame");
setVisible(true);

}
}
