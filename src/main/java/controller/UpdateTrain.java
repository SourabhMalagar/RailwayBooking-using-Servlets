package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TrainDao;
import dto.Train;

@WebServlet("/updatetrain")
public class UpdateTrain extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int Train_Number=Integer.parseInt(req.getParameter("Train_Number"));
   	 int Train_Seats=Integer.parseInt(req.getParameter("Number_Of_Seats"));
   	 String Train_Name=req.getParameter("Train_Name");
   	 
   	 String Station=req.getParameter("Stations");
   	 String[] Train_Stations=Station.split(",");
   	 
   	 String Price=req.getParameter("Ticket_Price");
   	 String[] Train_Price=Price.split(",");
   	 
   	 String Time=req.getParameter("Time");
   	 String[] Train_Time=Time.split(",");
   	 
   	 String Days=req.getParameter("Days");
   	 String[] Train_Days=Days.split(",");
   	 
   	 Train train=new Train();
   	 
   	 train.setTrain_Number(Train_Number);
   	 train.setTrain_Seats(Train_Seats);
   	 train.setTrain_Stations(Train_Stations);
   	 train.setTrain_Price(Train_Price);
   	 train.setTrain_Time(Train_Time);
   	 train.setTrain_Days(Train_Days);
   	 train.setTrain_Name(Train_Name);
   	 
		
   	    TrainDao trainDao=new TrainDao();
   	    trainDao.update(train);
   	    resp.getWriter().print("<h1 style='color:green'>Train Updated Successfully</h1>");
		req.setAttribute("list",trainDao.fetchAll());
		req.getRequestDispatcher("FetchRailwayInfo.jsp").forward(req, resp);
	}

}
