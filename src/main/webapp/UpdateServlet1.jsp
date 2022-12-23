<%@page import="Pack.BankDAO"%>
<%@page import="Pack.BankDAOFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="css/main.css" rel="stylesheet" media="all">
<style>
input[type="button"]{
font-family:"Roboto",sans-serif;
font-size: 18px;
font-weight:bold;
background: #1E90FF;
width: 160px;
padding:20px;
text-align:center;
text-decoration :none;
text-transform:uppercase;
color:#fff;
border-radius:5px;
cursor:pointer;
box-shadow:0 0 18px rgba(0,0,0,0.1);
-webkit-transition-property: box-shadow, transform;
transition-property: box-shadow, transform;

}

</style>
</head>
<body>
<%
	String accountno=request.getParameter("accountno");
	
BankDAO dao=BankDAOFactory.createBankDAO();
String[]result=dao.FetchByAccnt(accountno);
%>

 <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title"><b>Update form</b></h2>
                    <form name= updateform method="POST" action="updateservlet2 ">
                        <div class="row row-space">
                        	  <div class="col-2">
                                <div class="input-group">
                                
                                    <label class="label">Account Number</label>
                                    <p class='input-fields'><%=accountno %></p>
                                    <input class="input--style-4" type="hidden" name="accountno" value="<%= result[0] %>">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">first name</label>
                                    <input class="input--style-4" type="text" name="fname"value="<%= result[1] %>"required>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">last name</label>
                                    <input class="input--style-4" type="text" name="lname"value="<%= result[2] %>"required>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Registration Date</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="regdate"value="<%= result[8] %>"required>
                                     
 										<i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Gender</label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Male
                                            <input type="radio" name="gender"value="<%= result[3] %>"required>
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Female
                                            <input type="radio" name="gender"value="<%= result[3] %>"required>
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address</label>
                                    <input class="input--style-4" type="text" name="address"value="<%= result[4] %>"required>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Phone Number</label>
                                    <input class="input--style-4" type="tel" name="mobileno"value="<%= result[7] %>"required>
                                </div>
                            </div>
                        </div>
                       <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">City</label>
                                    <input class="input--style-4" type="text" name="city"value="<%= result[5] %>"required>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Pincode</label>
                                    <input class="input--style-4" type="tel" name="pincode"value="<%= result[6] %>"required>
                                </div>
                            </div>
                        </div>
                <div>
                        <input type="button" onclick="updateinfo();" value ="submit"/>
                        
                       </div>
    
                 </form>
                        
                        
                        
                        
                        
                         <div class="demo"></div>
                    
                </div>
            </div>
        </div>
    </div>

</body>
</html>