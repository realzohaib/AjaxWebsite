package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/updateservlet2"})
public class updateservlet2 extends HttpServlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		update(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		update(req, resp);
		
		
	}
	void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		try {
		Bank bank=new Bank();
		
		String Accountno=req.getParameter("accountno");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String pincode=req.getParameter("pincode");
		String mobileno=req.getParameter("mobileno");
		String Regdate=req.getParameter("regdate");
		
		bank.setAccountno(Accountno);
		bank.setFname(fname);
		bank.setLname(lname);
		bank.setGender(gender);
		bank.setAddress(address);
		bank.setCity(city);
		bank.setPincode(pincode);
		bank.setMobileno(mobileno);
		bank.setRegdate(Regdate);
		bank.setCurrentstatus("active");
		
		BankDAO dao=BankDAOFactory.createBankDAO();
		String res= dao.update(bank);
		out.println(res);
		}
		catch(Exception e) {
			out.println(e.toString());
		}
				
				
	}

}
