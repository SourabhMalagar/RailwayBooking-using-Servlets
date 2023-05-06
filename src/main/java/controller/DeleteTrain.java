package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TrainDao;
import dto.Train;



@WebServlet("/DeleteTrain")
public class DeleteTrain extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TrainDao trainDao=new TrainDao();
		trainDao.deleteTrain(Integer.parseInt(req.getParameter("Train_Number")));
		
		List<Train> list=trainDao.fetchAll();
		
		if(list.isEmpty())
		{
			resp.getWriter().print("<h1 style='color:red'>No railways Found</h1>");
			req.getRequestDispatcher("ManagementHome.html").forward(req, resp);
		}
		else{
			
		    resp.getWriter().print("<h1 style='color:green'>Train Deleted Succesfully</h1>");
   	        req.setAttribute("list", list);
   	        req.getRequestDispatcher("FetchRailwayInfo.jsp").include(req, resp);
		}
	}
	

}
