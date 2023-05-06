<%@page import="java.util.Arrays"%>
<%@page import="dto.Train"%>
<%@page import="dao.TrainDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Train</title>
</head>
<body>
<%int Train_Number=Integer.parseInt(request.getParameter("Train_Number"));
TrainDao trainDao=new TrainDao();
Train train=trainDao.find(Train_Number);
%>
<h1>Update Train Details</h1>
<fieldset>
<form action="updatetrain" method="post">
<table>
<tr>
<td><label for="tn">Train Number</label></td>
<td><input type="number" id="tn" name="Train_Number" value="<%=train.getTrain_Number() %>" readonly="readonly"></td>
</tr>
<tr>
<td><label for="tname">Train Name</label></td>
<td><input type="text" id="tname" name="Train_Name" value="<%=train.getTrain_Name() %>"></td>
</tr>
<tr>
<td><label for="ns">Number Of Seats</label></td>
<td><input type="number" id="ns" name="Number_Of_Seats" value="<%=train.getTrain_Seats() %>"></td>
</tr>
<tr>
<td><label for="tstation">Stations</label></td>
<td><textarea rows="5" cols="30" id="tstation" name="Stations"><%=Arrays.toString(train.getTrain_Stations())%></textarea></td>
</tr>
<tr>
<td><label for="tprice">Ticket Price</label></td>
<td><textarea rows="5" cols="30" id="tprice" name="Ticket_Price"><%=Arrays.toString(train.getTrain_Price())%></textarea></td>
</tr>
<tr>
<td><label for="time">Time</label></td>
<td><textarea rows="5" cols="30" id="time" name="Time"><%=Arrays.toString(train.getTrain_Time())%></textarea></td>
</tr>
<tr>
<td><label for="days">Days</label></td>
<td><textarea rows="5" cols="30" id="days" name="Days"><%=Arrays.toString(train.getTrain_Days()) %></textarea></td>
</tr>
<tr>
<td><button type="submit">Update</button></td>
<td><button type="reset">Cancel</button></td>
</tr>
</table>
<br>
<br>
</form>
</fieldset>
</body>
</html>