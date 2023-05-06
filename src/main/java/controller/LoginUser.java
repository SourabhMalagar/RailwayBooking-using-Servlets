package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.User;

@WebServlet("/login")
public class LoginUser extends HttpServlet
{
       @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	   int UserId =Integer.parseInt(req.getParameter("Id"));
    	   String Password=req.getParameter("Enter_Password");
    	   
    	   UserDao userDao=new UserDao();
    	   User user=userDao.find(UserId);
    	   
    	   if(userDao==null)
    	   {
    		   resp.getWriter().print("<h1 style='color:green'>Invalid Id</h1>");
    		   req.getRequestDispatcher("Login.html").include(req, resp);
    	   }
    	   else{
    		   if(user.getCreate_Password().equals(Password)){
    			   
    			   resp.getWriter().print("<h1 style='color:green'>Login Succussfull</h1>");
        		   req.getRequestDispatcher("UserHome.html").include(req, resp);
    		   }
    		   else{
    			   resp.getWriter().print("<h1 style='color:green'>Invalid Password</h1>");
        		   req.getRequestDispatcher("Login.html").include(req, resp);
    		   }
    	   }
    }
}
