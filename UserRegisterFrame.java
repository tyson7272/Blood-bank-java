import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserRegisterFrame extends JFrame
{
    Container c;
    JButton btnRegister, btnBack;
    JLabel lblFullName, lblEmail, lblPassword, lblPhone, lblCity, lblPincode; // lblHeading;
    JTextField txtFullName, txtEmail, txtPassword, txtPhone, txtCity, txtPincode;
    UserRegisterFrame()
    {
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 40));
        c.setBackground(Color.BLACK);

        //lblHeading = new JLabel("REGISTER PAGE");
        //Dimension size = lblHeading.getPreferredSize();
        //lblHeading.setBounds(500, 100, size.width, size.height);
        lblFullName = new JLabel("Full Name");
        txtFullName = new JTextField(15);
        lblEmail = new JLabel("Email    ");
        txtEmail = new JTextField(15);
        lblPassword = new JLabel("Password");
        txtPassword = new JTextField(15);
        lblPhone = new JLabel("phone no.");
        txtPhone = new JTextField(15);
        lblCity = new JLabel("City   ");
        txtCity = new JTextField(15);
        lblPincode = new JLabel("Pincode");
        txtPincode = new JTextField(15);

        lblFullName.setForeground(Color.WHITE);
        lblEmail.setForeground(Color.WHITE);
        lblPassword.setForeground(Color.WHITE);
        lblCity.setForeground(Color.WHITE);
        lblPhone.setForeground(Color.WHITE);
        lblPincode.setForeground(Color.WHITE);
        //lblHeading.setForeground(Color.YELLOW);

        btnRegister = new JButton("Register");
        btnBack = new JButton("Back");

        btnRegister.setBackground(Color.GREEN);
        btnBack.setBackground(Color.RED);

        Font f = new Font("Calibri", Font.BOLD, 30);
        btnRegister.setFont(f);
        btnBack.setFont(f);
        lblEmail.setFont(f);
        lblFullName.setFont(f);
        lblPassword.setFont(f);
        lblPhone.setFont(f);
        lblCity.setFont(f);
        lblPincode.setFont(f);
        txtFullName.setFont(f);
        txtEmail.setFont(f);
        txtPassword.setFont(f);
        txtPhone.setFont(f);
        txtCity.setFont(f);
        txtPincode.setFont(f);

        //Font f1 = new Font("Calibri", Font.ITALIC, 40);
        //lblHeading.setFont(f1);

        //c.add(lblHeading);
        c.add(lblFullName);
        c.add(txtFullName);
        c.add(lblEmail);
        c.add(txtEmail);
        c.add(lblPassword);
        c.add(txtPassword);
        c.add(lblPhone);
        c.add(txtPhone);
        c.add(lblCity);
        c.add(txtCity);
        c.add(lblPincode);
        c.add(txtPincode);

        c.add(btnRegister);
        c.add(btnBack);

        ActionListener a1 = (ae) -> {};
        btnBack.addActionListener(a1);

        setVisible(true);
        setTitle("Blood Bank -> User Register");
        setSize(700, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}