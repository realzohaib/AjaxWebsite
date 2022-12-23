package Pack;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/insertservlet"})
public class insertservlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		insert(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		insert(req, resp);
		
	}
	void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<br>");
		try {
			String Accountno=req.getParameter("accountno");
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String gender=req.getParameter("gender");
			String address=req.getParameter("address");
			String city=req.getParameter("city");
			String pin=req.getParameter("pincode");
			String mobileno=req.getParameter("mobileno");
			String Regdate=req.getParameter("regdate");
			
			Bank bank=new Bank();
			bank.setAccountno(Accountno);
			bank.setFname(fname);
			bank.setLname(lname);
			bank.setGender(gender);
			bank.setAddress(address);
			bank.setCity(city);
			bank.setPincode(pin);
			bank.setMobileno(mobileno);
			bank.setRegdate(Regdate);
			bank.setCurrentstatus("active");
			
			BankDAO bankdao=BankDAOFactory.createBankDAO();
			String res=bankdao.insert(bank);
			out.println(res);
			System.out.println(res);
					
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
