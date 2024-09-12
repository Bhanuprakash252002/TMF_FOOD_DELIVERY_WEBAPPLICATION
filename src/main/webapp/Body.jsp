<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="com.bhanu.foodpro.RestaurantDAO,java.util.ArrayList,com.bhanu.foodpro.RestaurantDto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BODY PAGE</title>
<link href="body.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%
	ArrayList<RestaurantDto> resdetails = RestaurantDAO.getlist();
	%>
	<div>
		<a href="RestaurantOwnerLogin.jsp"><input type="button" value="RestaurantOwnerLogin"/></a>
	</div>
	<div id="body">
		<%
		for (RestaurantDto res : resdetails) {
			String imageUrl = "https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_660/"
			+ res.getImg();
			int resid=res.getResid();
			
		%>
		<a href="ViewMenu.jsp?id=<%= res.getResid() %>">
			<div class="restaurant-card">

				<img src="<%=imageUrl%>" alt="Restaurant Image" />
				<h2><%=res.getResName()%></h2>
				<h2>
					Rating:
					<%=res.getAvgrating()%></h2>
				<p>
					cuisine:
					<%=res.getCusins()%></p>
			</div>
		</a>


		<%
		}
		%>
	</div>
</body>
</html>
