<%@page import="java.util.Arrays"%>
<%@page import="dto.Train"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Train>list=(List<Train>)request.getAttribute("list"); %>
<table border="1">
<tr>
<th>Train Number</th>
<th>Train Name</th>
<th>From Station</th>
<th>To Station</th>
<th>Time Of Departure</th>
<th>Time Of Arrival</th>
<th>Seats Available</th>
<th>Available Days</th>
<th>Book</th>
</tr>
<%for(Train train:list){  %>
<tr>
<th><%=train.getTrain_Number() %></th>
<th><%=train.getTrain_Name() %></th>
<th><%=train.getTrain_Stations()[0] %></th>
<th><%=train.getTrain_Stations()[train.getTrain_Stations().length-1] %></th>
<th><%=train.getTrain_Time()[0]%></th>
<th><%=train.getTrain_Time()[train.getTrain_Time().length-1]%></th>
<th><%=train.getTrain_Seats() %></th>
<th><%=Arrays.toString(train.getTrain_Days()) %></th>
<th><a href="UserBookTicket.html"><button type="submit">Book</button></a></th>
</tr>
<%} %>
</table><br>
<a href="UserHome.html"><button>Home</button></a>
</body>
</html>