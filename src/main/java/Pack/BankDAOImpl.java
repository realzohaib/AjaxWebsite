package Pack;
import java.sql.*;
public class BankDAOImpl implements BankDAO {
	String driver="com.mysql.cj.jdbc.Driver";
	String dburl="jdbc:mysql://localhost:3306/zohaibdb";
	String username="root";
	String password="";
	private Connection con=null;
	void createConnection() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(dburl, username,
					password);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	

	@Override
	public String fetchAll() {
		// TODO Auto-generated method stub
		String res= "";
		try {
			createConnection();
			Statement stmt=con.createStatement();
			String query="select * from bank "
					+ " where "
					+ " currentstatus='active' ";
			ResultSet rs=stmt.executeQuery(query);
			res="<table  align='center'>";
			res+="<tr style='background-color: black; color: white;'>"+
					"<th> Account No.   </th>"+
                    "<th> Fname  </th>"+
                    "<th> Lname  </th>"+
                    "<th> Gender  </th>"+
                    "<th> Address  </th>"+
                    "<th> City  </th>"+
                    "<th> Pincode  </th>"+
                    "<th> Mobile No.  </th>"+
                    "<th> Registration Date  </th>"+
                    "<th> Currentstatus  </th>"+
                    "<th>  Close Account </th>"+
                    "<th> Update </th>"+
                    "</tr>";
					
			while(rs.next()==true) {
				res+="<tr>";
			     String accountno=rs.getString(1);
				 String fname=rs.getString(2);
				 String lname=rs.getString(3);
				 String gender=rs.getString(4);
				 String address=rs.getString(5);
				 String city=rs.getString(6);
				 String pin=rs.getString(7);
				 String mobileno=rs.getString(8);
				 String regdate=rs.getString(9);
				 String currentstatus=rs.getString(10);
				 
				 res+="<td>"+accountno+ "</td> "
					+ "<td>"+fname+"</td> "
			 		+ "<td>"+lname+"</td> "
			 		+ "<td>"+gender+"</td> "
			 		+ "<td>"+address+"</td> "
			 		+ "<td>"+city+"</td> "
			 		+ "<td>"+pin+"</td> "
			 		+ "<td>"+mobileno+"</td> "
			 		+ "<td>"+regdate+"</td>"
			 		+ "<td>"+currentstatus+"</td>"
			 		+"<td ><a href='#' onclick='return deleteaccnt("+accountno+");'>Close</a></td>"
			 		+ "<td><a href='#' onclick='return functionUpdate("+accountno+")'>Update</a></td>";
				 
				 res+="</tr>";
			}
			res+="</table>";
			
		}
		catch(Exception e) {
			res=e.toString();
			System.out.println(e);
		}
		return res;
	}


	@Override
	public String insert(Bank b) {
		// TODO Auto-generated method stub
		String result="";
		try {
			createConnection();
			String insertquery="insert into bank "
					+ "values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insertquery);
			ps.setString(1, b.getAccountno());
			ps.setString(2, b.getFname());
			ps.setString(3, b.getLname());
			ps.setString(4, b.getGender());
			ps.setString(5, b.getAddress());
			ps.setString(6, b.getCity());
			ps.setString(7, b.getPincode());
			ps.setString(8, b.getMobileno());
			ps.setString(9, b.getRegdate());
			ps.setString(10, "active");
			int res=ps.executeUpdate();
			result="<p class='heading-text' ><b>"+res+" record/s successfully inserted in bank table</b></p>";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			result="<p class='heading-text' >"+e+"()</p>";
		}
		return result;
	}


	@Override
	public String delete(String accountno) {
		// TODO Auto-generated method stub
		String result="";
		try {
			
			createConnection();
			
			String query="update bank set "+
					" currentstatus='Close' "+
								" where accountno=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, accountno);
			int res=ps.executeUpdate();
			result="<p class='heading-text' ><b>"+res+" record/s successfully closed from bank table</b></p>";
			
			ps.close();
			con.close();
			
		}
		catch(Exception e) {
		result=e.toString();
		}
		return result;
	}


	@Override
	public String[] FetchByAccnt(String accountno) {
		// TODO Auto-generated method stub
		String[]res=new String[10];
		try {
			createConnection();
			String query="select * from bank "
					+ "where accountno=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, accountno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()==true) {
				res[0]=rs.getString(1);
				res[1]=rs.getString(2);
				res[2]=rs.getString(3);
				res[3]=rs.getString(4);
				res[4]=rs.getString(5);
				res[5]=rs.getString(6);
				res[6]=rs.getString(7);
				res[7]=rs.getString(8);
				res[8]=rs.getString(9);
				res[9]=rs.getString(10);
			}
			ps.close();
			rs.close();
			con.close();
			
		}
		catch(Exception e) {
			res[0]=e.toString();
		}
		return res;
	}


	@Override
	public String update(Bank bank) {
		// TODO Auto-generated method stub
		String res="";
		try {
			createConnection();
			String query="update bank set "
					+ "Fname=?, "
					+ "Lname=?, "
					+ "Gender=?, "
					+ "Address=?, "
					+ "City=?, "
					+ "Pincode=?, "
					+ "Mobileno=?,"
					+ "Regdate=?, "
					+"currentstatus=?"
					+ "where "
					+ "Accountno=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, bank.getFname());
			ps.setString(2, bank.getLname());
			ps.setString(3, bank.getGender());
			ps.setString(4, bank.getAddress());
			ps.setString(5, bank.getCity());
			ps.setString(6, bank.getPincode());
			ps.setString(7, bank.getMobileno());
			ps.setString(8, bank.getRegdate());
			ps.setString(9, "active");
			ps.setString(10, bank.getAccountno());
			
			int res1=ps.executeUpdate();
			res="<p class='heading-text' ><b>"+res+" record/s successfully updated in bank table</b></p>";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			res=e.toString();
		}
		return res;
	}


	@Override
	public String fetchdelete() {
		String res= "";
		try {
			createConnection();
			Statement stmt=con.createStatement();
			String query="select * from bank "
					+ " where "
					+ " currentstatus='close' ";
			ResultSet rs=stmt.executeQuery(query);
			res="<table  align='center'>";
			res+="<tr style='background-color: black; color: white;'>"+
					"<th> Account No.   </th>"+
                    "<th> Fname  </th>"+
                    "<th> Lname  </th>"+
                    "<th> Gender  </th>"+
                    "<th> Address  </th>"+
                    "<th> City  </th>"+
                    "<th> Pincode  </th>"+
                    "<th> Mobile No.  </th>"+
                    "<th> Registration Date  </th>"+
                    "<th> Currentstatus  </th>"+
                    "<th>  Open Account </th>"+
          
                    "</tr>";
					
			while(rs.next()==true) {
				res+="<tr>";
			     String accountno=rs.getString(1);
				 String fname=rs.getString(2);
				 String lname=rs.getString(3);
				 String gender=rs.getString(4);
				 String address=rs.getString(5);
				 String city=rs.getString(6);
				 String pin=rs.getString(7);
				 String mobileno=rs.getString(8);
				 String regdate=rs.getString(9);
				 String currentstatus=rs.getString(10);
				 
				 res+="<td>"+accountno+ "</td> "
					+ "<td>"+fname+"</td> "
			 		+ "<td>"+lname+"</td> "
			 		+ "<td>"+gender+"</td> "
			 		+ "<td>"+address+"</td> "
			 		+ "<td>"+city+"</td> "
			 		+ "<td>"+pin+"</td> "
			 		+ "<td>"+mobileno+"</td> "
			 		+ "<td>"+regdate+"</td>"
			 		+ "<td>"+currentstatus+"</td>"
			 		+"<td ><a href='#' onclick='return openaccnt("+accountno+");'>Open</a></td>";
			 		
				 
				 res+="</tr>";
			}
			res+="</table>";
			
		}
		catch(Exception e) {
			res=e.toString();
			System.out.println(e);
		}
		return res;
		
	}


	@Override
	public String open(String accountno) {
		String result="";
		try {
			createConnection();
			
			String query="update bank set "+
					" currentstatus='active' "+
								" where accountno=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, accountno);
			int res=ps.executeUpdate();
			result="<p class='heading-text' ><b>"+res+"</b> record/s sucessfully restored in bank table</p>";
			
			ps.close();
			con.close();
			
		}
		catch(Exception e) {
			result=e.toString();
		}
		return result;
	}

}
