import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

															//VAALID BAAKI H

class OrgRegFrame extends JFrame{
Container c;
JButton btnRegister, btnBack;
JLabel lblOrgName, lblOrgID, lblOrgPassword, lblCnfOrgPassword, lblOrgPhone, lblOrgCity; // lblHeading;
JTextField txtOrgName, txtOrgID, txtOrgPhone, txtOrgCity;
JPasswordField txtOrgPassword, txtCnfOrgPassword;
OrgRegFrame(){
c = getContentPane();
c.setLayout(new FlowLayout(FlowLayout.CENTER));
c.setBackground(Color.gray);
//lblHeading = new JLabel("REGISTER PAGE");
//Dimension size = lblHeading.getPreferredSize();
//lblHeading.setBounds(500, 100, size.width, size.height);
lblOrgName = new JLabel("Enter Organization Name ");
txtOrgName = new JTextField(15);
lblOrgID = new JLabel("\nEnter a Valid Username ");
txtOrgID = new JTextField(15);
lblOrgPassword = new JLabel("\nPassword");
txtOrgPassword = new JPasswordField(15);
lblCnfOrgPassword = new JLabel("\nConfirm Password ");
txtCnfOrgPassword = new JPasswordField(15);
lblOrgPhone = new JLabel("\nEnter Phone No. ");
txtOrgPhone = new JTextField(15);
lblOrgCity = new JLabel("\nEnter Location ");
txtOrgCity = new JTextField(15);

lblOrgName.setForeground(Color.black);
lblOrgID.setForeground(Color.black);
lblOrgPassword.setForeground(Color.black);
lblCnfOrgPassword.setForeground(Color.black);
lblOrgCity.setForeground(Color.black);
lblOrgPhone.setForeground(Color.black);
//lblHeading.setForeground(Color.YELLOW);

btnRegister = new JButton("\nRegister");
btnBack = new JButton("Back");
btnRegister.setBackground(Color.GREEN);
btnBack.setBackground(Color.RED);

Font f = new Font("Calibri", Font.BOLD, 22);
btnRegister.setFont(f);
btnBack.setFont(f);
lblOrgID.setFont(f);
lblOrgName.setFont(f);
lblOrgPassword.setFont(f);
lblCnfOrgPassword.setFont(f);
lblOrgPhone.setFont(f);
lblOrgCity.setFont(f);
txtOrgName.setFont(f);
txtOrgID.setFont(f);
txtOrgPassword.setFont(f);
txtCnfOrgPassword.setFont(f);
txtOrgPhone.setFont(f);
txtOrgCity.setFont(f);

//Font f1 = new Font("Calibri", Font.ITALIC, 40);
//lblHeading.setFont(f1);

//c.add(lblHeading);
c.add(lblOrgName);
c.add(txtOrgName);
c.add(lblOrgID);
c.add(txtOrgID);
c.add(lblOrgPassword);
c.add(txtOrgPassword);
c.add(lblCnfOrgPassword);
c.add(txtCnfOrgPassword);
c.add(lblOrgPhone);
c.add(txtOrgPhone);
c.add(lblOrgCity);
c.add(txtOrgCity);

c.add(btnRegister);
c.add(btnBack);

ActionListener a1 = (ae) -> {try{
	if(txtOrgPassword.getText().equals(txtCnfOrgPassword.getText())){
		DbHandler.addOrg(txtOrgName.getText(),txtOrgPhone.getText(),txtOrgCity.getText(),txtOrgID.getText(),txtCnfOrgPassword.getText());
	}
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(c,e.getMessage());
	}
	finally{LoginPage l = new LoginPage(); dispose();}
};
btnRegister.addActionListener(a1);
ActionListener a2 = (ae) -> {RegisterPage r = new RegisterPage(); dispose();};
btnBack.addActionListener(a2);

setVisible(true);
setTitle("Blood Bank -> Organization Registration");
setSize(350,550);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}