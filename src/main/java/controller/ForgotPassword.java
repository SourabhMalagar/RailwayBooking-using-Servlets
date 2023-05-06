package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;
@WebServlet("/forgotpassword")
public class ForgotPassword extends HttpServlet
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   
    	 int Id=Integer.parseInt(req.getParameter("Id"));
    	 UserDao dao=new UserDao();
    	 User user=dao.find(Id);
    	 
    	 if(dao==null)
  	   {
  		   resp.getWriter().print("<h1 style='color:red'>Invalid Id</h1>");
  		   req.getRequestDispatcher("ForgotPassword.html").include(req, resp);
  	   }
  	   else{
  		   
  		   long Mobile_Number=Long.parseLong(req.getParameter("Mobile"));
  		   Date dob=Date.valueOf(req.getParameter("dob"));
  		   
  		   if(Mobile_Number==user.getMobile_Number() && dob.equals(user.getDate_Of_Birth()))
  		   {
  			  
  			   user.setCreate_Password(req.getParameter("New_Password"));
  			   user.setConfirm_Password(req.getParameter("New_Password"));
  			   dao.update(user);
  			  
  			   resp.getWriter().print("<h1 style='color:green'>Password Updated Successfully</h1>");
      		   req.getRequestDispatcher("Login.html").include(req, resp);
  		   }
  		   else{
  			   resp.getWriter().print("<h1 style='color:red'>Invalid Details Please Enter Correctly</h1>");
      		   req.getRequestDispatcher("ForgotPassword.html").include(req, resp);
  		   }
  	   }
    }
}
