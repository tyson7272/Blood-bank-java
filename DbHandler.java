import javax.swing.*;
import java.sql.*;

class DbHandler{
public static void addOrg(String OrgName, String OrgPhone, String OrgCity, String OrgID, String OrgPassword){
try{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
	Statement stmti = con.createStatement();
	String sqli = "select max(orgid) from orginfo";
	ResultSet rs = stmti.executeQuery(sqli);
	int OrgSr=10000;
	while(rs.next())
		OrgSr=OrgSr+rs.getInt(1)+1;
	
	String sqll = "insert into LoginInfo values(?,?)";
	PreparedStatement stmtl = con.prepareStatement(sqll);
	stmtl.setString(1,OrgID);
	stmtl.setString(2,OrgPassword);
	
	String sqlo = "insert into OrgInfo values(?,?,?,?,?)";
	PreparedStatement stmto = con.prepareStatement(sqlo);
	stmto.setInt(1,OrgSr);
	stmto.setString(2,OrgName);
	stmto.setString(3,OrgPhone);
	stmto.setString(4,OrgCity);
	stmto.setString(5,OrgID);
	int r1 = stmtl.executeUpdate();
	int r2 = stmto.executeUpdate();
	JOptionPane.showMessageDialog(new JDialog(),"Organization has been registered Successfully!.");
	con.close();

}
catch(SQLException e){JOptionPane.showMessageDialog(new JDialog(),"SQL ERROR: "+e);} 
}
}
/*
public static void addUser(String OrgName, String OrgPhone, String OrgCity, String OrgID, String OrgPassword){
try{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
	Statement stmti = con.createStatement();
	String sqli = "select max(orgid) from orginfo";
	ResultSet rs = stmti.executeQuery(sqli);
	int OrgSr=10000;
	while(rs.next())
		OrgSr=OrgSr+rs.getInt(1)+1;
	
	String sqll = "insert into LoginInfo values(?,?)";
	PreparedStatement stmtl = con.prepareStatement(sqll);
	stmtl.setString(1,OrgID);
	stmtl.setString(2,OrgPassword);
	
	String sqlo = "insert into OrgInfo values(?,?,?,?,?)";
	PreparedStatement stmto = con.prepareStatement(sqlo);
	stmto.setInt(1,OrgSr);
	stmto.setString(2,OrgName);
	stmto.setString(3,OrgPhone);
	stmto.setString(4,OrgCity);
	stmto.setString(5,OrgID);
	int r1 = stmtl.executeUpdate();
	int r2 = stmto.executeUpdate();
	JOptionPane.showMessageDialog(new JDialog(),"Organization has been registered Successfully!.");
	con.close();
	
}
catch(SQLException e){JOptionPane.showMessageDialog(new JDialog(),"SQL ERROR: "+e);} 
}
}

	public static String viewEmployee(){
			String data = "";
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
			Statement stmt = con.createStatement();
			String sql = "select * from employeemarch2021";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				data = data+"eid = "+rs.getInt(1)+" ename = "+rs.getString(2)+"\n";
			con.close();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(new JDialog(),"SQL ERROR: "+e);
		}
		return data;
	}*/