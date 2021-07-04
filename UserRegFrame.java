import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserRegFrame extends JFrame{
Container c;
JButton btnRegister, btnBack;
JLabel lblUserName, lblUserID, lblUserPassword, lblCnfUserPassword, lblUserPhone, lblUserCity; // lblHeading;
JTextField txtUserName, txtUserID, txtUserPassword, txtCnfUserPassword, txtUserPhone, txtUserCity;
UserRegFrame(){
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER));
c.setBackground(Color.gray);
//lblHeading = new JLabel("REGISTER PAGE");
//Dimension size = lblHeading.getPreferredSize();
//lblHeading.setBounds(500, 100, size.width, size.height);		todo: age bgroup 
lblUserName = new JLabel("Enter Full Name ");
txtUserName = new JTextField(15);
lblUserID = new JLabel("\nEnter a Valid Username");
txtUserID = new JTextField(15);
lblUserPassword = new JLabel("Password");
txtUserPassword = new JTextField(15);
lblCnfUserPassword = new JLabel("\nConfirm Password ");
txtCnfUserPassword = new JTextField(15);
lblUserPhone = new JLabel("\nEnter Phone No. ");
txtUserPhone = new JTextField(15);
lblUserCity = new JLabel("\nEnter Location ");
txtUserCity = new JTextField(15);

lblUserName.setForeground(Color.black);
lblUserID.setForeground(Color.black);
lblUserPassword.setForeground(Color.black);
lblCnfUserPassword.setForeground(Color.black);
lblUserCity.setForeground(Color.black);
lblUserPhone.setForeground(Color.black);
//lblHeading.setForeground(Color.YELLOW);

btnRegister = new JButton("\nRegister");
btnBack = new JButton("Back");
btnRegister.setBackground(Color.GREEN);
btnBack.setBackground(Color.RED);

Font f = new Font("Calibri", Font.BOLD, 20);
btnRegister.setFont(f);
btnBack.setFont(f);
lblUserID.setFont(f);
lblUserName.setFont(f);
lblUserPassword.setFont(f);
lblCnfUserPassword.setFont(f);
lblUserPhone.setFont(f);
lblUserCity.setFont(f);
txtUserName.setFont(f);
txtUserID.setFont(f);
txtUserPassword.setFont(f);
txtCnfUserPassword.setFont(f);
txtUserPhone.setFont(f);
txtUserCity.setFont(f);

//Font f1 = new Font("Calibri", Font.ITALIC, 40);
//lblHeading.setFont(f1);

//c.add(lblHeading);
c.add(lblUserName);
c.add(txtUserName);
c.add(lblUserID);
c.add(txtUserID);
c.add(lblUserPassword);
c.add(txtUserPassword);
c.add(lblCnfUserPassword);
c.add(txtCnfUserPassword);
c.add(lblUserPhone);
c.add(txtUserPhone);
c.add(lblUserCity);
c.add(txtUserCity);

c.add(btnRegister);
c.add(btnBack);

ActionListener a1 = (ae) -> {};
btnRegister.addActionListener(a1);
ActionListener a2 = (ae) -> {RegisterPage r = new RegisterPage(); dispose();};
btnBack.addActionListener(a2);

setVisible(true);
setTitle("Blood Bank -> User Registration");
setSize(340,550);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}