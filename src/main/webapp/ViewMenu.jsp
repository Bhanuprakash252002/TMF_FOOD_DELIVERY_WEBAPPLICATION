<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page
	import="com.bhanu.foodpro.FoodItemsDAO,java.util.ArrayList,com.bhanu.foodpro.FoodItemsDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	int resid=Integer.parseInt(request.getParameter("id"));
	ArrayList<FoodItemsDTO> foodbean=FoodItemsDAO.getlist();
	for(FoodItemsDTO bean :foodbean )
	{
		if(resid==(bean.getResid()))
		{
			String foodtype="";
			if(bean.getNonveg().equals("yes"))
			{
				foodtype="Non-veg";
			}
			else
			{
				foodtype="Veg";
			}
	%>
		<img src=<%= bean.getImgurl()%>  height="200px" width="200px" alt="foodimg"/>
		<h2><%= bean.getFoodname() %></h2>
		<p><%= bean.getPrice() %></p>
		<p><%= foodtype%>
			
	<%
		}
	}
%>


</body>
</html>